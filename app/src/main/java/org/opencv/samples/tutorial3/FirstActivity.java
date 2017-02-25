package org.opencv.samples.tutorial3;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {

    private Button shape_btn;
    private Button barcode_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        init();
    }
    
    private void init(){
        shape_btn = (Button)findViewById(R.id.shapebutton);
        barcode_btn = (Button)findViewById(R.id.barcodebutton);

        shape_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), Sample3Native.class);
                startActivity(intent);
            }
        });
        barcode_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), SimpleScannerActivity.class);
                startActivity(intent);
            }
        });
    }

    private void shape_btn_event(){

    }

}
