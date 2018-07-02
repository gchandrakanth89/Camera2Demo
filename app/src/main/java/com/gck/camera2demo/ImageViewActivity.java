package com.gck.camera2demo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;

public class ImageViewActivity extends Activity {

    private static final String TAG = "ImageViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        String file = getIntent().getStringExtra("file");
        Log.d(TAG, "Chandu onCreate: "+file);

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = BitmapFactory.decodeFile(file, options);

        Log.d(TAG, "Chandu onCreate: bitmap width = "+bitmap.getWidth()+", "+bitmap.getHeight());

        //File imgFile = new File(file);
        ImageView imageView = findViewById(R.id.image_view);
        //imageView.setImageURI(Uri.fromFile(imgFile));
        imageView.setImageBitmap(bitmap);

    }
}
