package com.example.appcalculator18022022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText mEdt1,mEdt2;
    TextView mTvResult;
    Button mBtnPlus,mBtnMinus,mBtnMultiplication,mBtnDivision;

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
        //7 : Math.random()
//        double number7 = Math.round(Math.random() * 4) + 1;
//        Log.d("BBB",number7 + "");

        // 8 : Random
//        Random random = new Random();
        // 0 -> bound - 1

        // 5 -> 13
//        int number8 = random.nextInt(13 - 5 + 1) + 5;
//        Log.d("BBB",number8 + "");

//        int a = 5;
//        int b = a;
//
//        nếu a thay đổi thì b có thay đổi hay không và tại sao

//        Object o = new Object();
//        Object o1 = new Object();
//
//        Log.d("BBB","Before o : " + o.toString());
//        Log.d("BBB","Before o1 : " + o1.toString());
//        // o1 sẽ truyền tham chiếu (vùng nhớ cho thằng o);
//        o = o1;
//
//        Log.d("BBB","After o : " + o.toString());
//        Log.d("BBB","After o1 : " + o1.toString());

        // ánh xạ
        mEdt1 = findViewById(R.id.editTextNumber1);
        mEdt2 = findViewById(R.id.editTextNumber2);
        mTvResult = findViewById(R.id.textViewResult);
        mBtnPlus = findViewById(R.id.buttonPlus);
        mBtnMinus = findViewById(R.id.buttonMinus);
        mBtnMultiplication = findViewById(R.id.buttonMultiplication);
        mBtnDivision = findViewById(R.id.buttonDivision);

        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ edittext
                String inputNumber1 = mEdt1.getText().toString();
                String inputNumber2 = mEdt2.getText().toString();

                // 2 input không được để rỗng
                if (inputNumber1.isEmpty() || inputNumber2.isEmpty()){
//                    Log.d("BBBB","Input 1 or 2 is empty");
                    //Thông báo
                    Toast.makeText(MainActivity.this,"Input 1 or 2 is empty",Toast.LENGTH_LONG).show();
                    return;
                }

                // Thỏa có dữ liệu
                int number1 = Integer.parseInt(inputNumber1);
                int number2 = Integer.parseInt(inputNumber2);

                int result = number1 + number2;

                String textResult = String.format("%d + %d = %d",number1 , number2 , result);
                mTvResult.setText(textResult);

            }
        });


    }



}