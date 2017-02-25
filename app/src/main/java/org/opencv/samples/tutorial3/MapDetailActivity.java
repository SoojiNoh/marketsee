package org.opencv.samples.tutorial3;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.opencv.samples.tutorial3.R;

/**
 * Created by INMA on 2017. 2. 12..
 */

public class MapDetailActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private Toolbar mToolbar;
    TextToSpeech TTS;
    TextView n401, n402, n403, n404, male, female, stairs, elv1, elv2;
    private ImageView img_sample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_detail);

        n401 = (TextView) findViewById(R.id.text_401);

        TTS = new TextToSpeech(this, this);
        setupToolbar();
    }

    @Override
    public void onInit(int i) {
        n401.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TTS.speak(String.valueOf(n401.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        n402.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TTS.speak(String.valueOf(n402.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        n403.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TTS.speak(String.valueOf(n403.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        n404.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TTS.speak(String.valueOf(n404.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TTS.speak(String.valueOf(male.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TTS.speak(String.valueOf(female.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        stairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TTS.speak(String.valueOf(stairs.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        elv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TTS.speak(String.valueOf(elv1.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        elv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TTS.speak(String.valueOf(elv2.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }

    private void rgbsensor(){
        img_sample.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View view, MotionEvent event) {
                final Bitmap bitmap = ((BitmapDrawable) img_sample.getDrawable()).getBitmap();
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    int x = (int) event.getX();
                    int y = (int) event.getY();
                    int pixel = bitmap.getPixel(x, y);

                    //then do what you want with the pixel data, e.g
                    int redValue = Color.red(pixel);
                    int blueValue = Color.blue(pixel);
                    int greenValue = Color.green(pixel);

                    Log.i("logcat", "red: " + redValue);
                    Log.i("logcat", "blue: " + blueValue);
                    Log.i("logcat", "green: " + greenValue);

                    return true;
                }
                return false;
            }
        });
    }

//    @Override
//    public boolean onTouch(View view, MotionEvent event) {
//        if (event.getAction() == MotionEvent.ACTION_DOWN) {
//            if (view.getId() == R.id.text_401) {
//                Log.d("at", "401 따운 : " + view.getId());
//            }
//            Log.d("at", "401 따운 : " + view.getId());
//            return true;
//
//        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
//            if (view.getId() == R.id.text_401) {
//                Log.d("at", "401 무브 : " + view.getId());
//                TTS.speak(String.valueOf(n401.getText()), TextToSpeech.QUEUE_FLUSH, null);
//            }
//
//            Log.d("at", "401 무브 : " + view.getId());
//            return true;
//        } else if (event.getAction() == MotionEvent.ACTION_UP) {
//            Log.d("at", "뗌 : " + view.getId());
//            return true;
//        }
//        return false;
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TTS.shutdown();
    }

    // METHODS
    private void setupToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle(R.string.app_name);
    }
}
