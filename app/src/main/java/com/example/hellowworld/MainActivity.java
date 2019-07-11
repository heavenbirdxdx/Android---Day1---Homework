package com.example.hellowworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);

        final ImageView iv1 = findViewById(R.id.iv1);
        iv1.setVisibility(View.VISIBLE);
        final ImageView iv2 = findViewById(R.id.iv2);
        iv2.setVisibility(View.GONE);
        final ImageView iv3 = findViewById(R.id.iv3);
        iv3.setVisibility(View.GONE);

        Switch switch1 = findViewById(R.id.switch1);

        final TextView tv1 = findViewById(R.id.tv1);
        final int[] cnt = {0};
        final boolean[] flag = {false};

        switch1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mLayout = findViewById(R.id.conLayout);
                if(flag[0] == false)
                {
                    mLayout.setBackgroundColor(Color.BLACK);
                    tv1.setBackgroundColor(Color.WHITE);
                    flag[0] = true;
                }
                else
                {
                    mLayout.setBackgroundColor(Color.WHITE);
                    flag[0] = false;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                cnt[0]++;
                String s = String.valueOf(cnt[0]);
                tv1.setText(s+"人想吃饭了");
                System.out.println(cnt[0]);
                if(cnt[0] >= 10 && cnt[0]<=20)
                {
                    iv1.setVisibility(View.GONE);
                    iv2.setVisibility(View.VISIBLE);
                    iv3.setVisibility(View.GONE);
                }
                else if(cnt[0] >20)
                {
                    iv1.setVisibility(View.GONE);
                    iv2.setVisibility(View.GONE);
                    iv3.setVisibility(View.VISIBLE);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cnt[0] = 0;
                String s = String.valueOf(cnt[0]);
                tv1.setText(s+"人想吃饭了");
                iv2.setVisibility(View.GONE);
                iv3.setVisibility(View.GONE);
                iv1.setVisibility(View.VISIBLE);

            }
        });
    }
}
