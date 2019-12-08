package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
//import android.os.Environment;

import java.io.File;

public class ShareToInstagram {
    String type;
    String filename;
    String mediaPath;
    Context context;

    ShareToInstagram(String setType, String setFilename, String setMediaPath, Context setContext) {
        type = setType;
        filename = setFilename;
        mediaPath = setMediaPath;
        context = setContext;
    }

    public void onClickInsta() {
        System.out.println("In OnClickInsta()");
        createInstagramIntent(type, mediaPath);
    }


    private void createInstagramIntent(String type, String mediaPath){
        System.out.println("In intent code bit");
        // Create the new Intent using the 'Send' action.
        Intent share = new Intent(Intent.ACTION_SEND);

        // Set the MIME type
        share.setType(type);

        // Create the URI from the media
        File media = new File(mediaPath);
        Uri uri = Uri.fromFile(media);

        // Add the URI to the Intent.
        share.putExtra(Intent.EXTRA_STREAM, uri);

        // Broadcast the Intent.
        context.startActivity(Intent.createChooser(share, "Share to"));
    }
}
