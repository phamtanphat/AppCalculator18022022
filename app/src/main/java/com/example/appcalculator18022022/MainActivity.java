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
        //4 : Trị tuyệt đối
//        int number4 = Math.abs(-1);
//        Log.d("BBB",number4 + "");
        //5 : Tìm số lớn nhất trong 2 số
//        int number5 = Math.max(3,4);
//        Log.d("BBB",number5 + "");
        //6 : Lấy căn bậc 2
//        double number6 = Math.sqrt(9);
//        Log.d("BBB",number6 + "");
        //7 : Random
        double number7 = Math.random();
        Log.d("BBB",number7 + "");
    }
}