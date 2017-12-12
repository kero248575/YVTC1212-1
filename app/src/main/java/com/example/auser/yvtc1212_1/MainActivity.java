package com.example.auser.yvtc1212_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Click1(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, NewsReaderXML.class);
        startActivity(intent);

    }
    public void Click2(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, WeChat.class);
        startActivity(intent);

    }

}
