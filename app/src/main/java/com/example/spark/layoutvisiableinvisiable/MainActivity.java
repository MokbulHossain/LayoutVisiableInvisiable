package com.example.spark.layoutvisiableinvisiable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button button4;
    RelativeLayout layout1;
    Boolean chack=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout1=(RelativeLayout) findViewById(R.id.layout1);
        button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chack) {
                    layout1.setVisibility(layout1.INVISIBLE);
                    chack=false;
                    button4.setText("VISIBLE");
                }
                else {
                    layout1.setVisibility(layout1.VISIBLE);
                    chack=true;
                    button4.setText("INVISIBLE");
                }
            }
        });
    }
}
