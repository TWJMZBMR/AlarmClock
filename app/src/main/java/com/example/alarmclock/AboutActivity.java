package com.example.alarmclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button button=(Button)findViewById(R.id.qrcode_button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent_about_qrcode=new Intent(AboutActivity.this, qrcodeActivity.class);
                startActivity( intent_about_qrcode);
            }
        });


    }
}
