package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
//import android.os.Environment;

import java.io.File;

public class ShareToInstagram {
    String mediaPath;
    Context context;

    ShareToInstagram(String setMediaPath, Context setContext) {
        mediaPath = setMediaPath;
        context = setContext;
    }

    public void onClickInsta() {
        System.out.println("In OnClickInsta()");
        createInstagramIntent(mediaPath);
    }


    private void createInstagramIntent(String mediaPath){
        System.out.println("In intent code bit");
        // Create the new Intent using the 'Send' action.
        Intent share = new Intent();
        share.setAction(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://" + mediaPath));
        share.setType("image/jpeg");

        share.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

        // Broadcast the Intent.
        context.startActivity(Intent.createChooser(share, "Share to"));
    }
}
