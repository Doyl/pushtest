package com.example.aa.tencentpushdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aa.testlib.DoUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DoUtils.doLog("hehe");
    }
}
