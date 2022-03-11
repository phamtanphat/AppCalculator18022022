package com.example.appcalculator18022022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1 : Làm tròn 0.5
//        int number1 = Math.round(1.5f);
//        System.out.println("Làm tròn 0.5 = " + number1);
        //2 : Làm tròn xuống
//        double number2 = Math.floor(0.999f);
//        Log.d("BBB",number2 + "");
        //3 : Làm tròn lên
//        double number3 = Math.ceil(1.001);
//        Log.d("BBB",number3 + "");
    }
}