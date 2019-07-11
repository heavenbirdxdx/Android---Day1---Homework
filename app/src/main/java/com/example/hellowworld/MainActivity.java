package com.example.hellowworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        final TextView tv1 = findViewById(R.id.tv1);
        final int[] cnt = {0};
        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                cnt[0]++;
                String s = String.valueOf(cnt[0]);
                tv1.setText(s);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cnt[0] = 0;
                String s = String.valueOf(cnt[0]);
                tv1.setText(s);
            }
        });
    }
}
