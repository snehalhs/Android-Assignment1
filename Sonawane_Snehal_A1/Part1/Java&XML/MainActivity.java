package com.cs442.ssonawa1.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void MyFirstAppButtonView(View view)
    {
        Toast.makeText(this, "Hello World! Its my first app! Snehal Sonawane", Toast.LENGTH_LONG).show();
        Log.d("MyApp:", "I am logging it!");
    }
}
