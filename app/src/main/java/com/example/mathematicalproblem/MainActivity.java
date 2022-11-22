package com.example.mathematicalproblem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {
    private EditText num1;
    private EditText num2;
    private EditText num3;
    private Button add, subtract, multiply, divide;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.etNum1);
        num2 = (EditText) findViewById(R.id.etNum2);
        num3 = (EditText) findViewById(R.id.etNum3);
        add = (Button) findViewById(R.id.btnAdd);
        subtract = (Button) findViewById(R.id.btnSub);
        multiply = (Button) findViewById(R.id.btnMul);
        divide = (Button) findViewById(R.id.btnDiv);
        result = (TextView) findViewById(R.id.tvAnswer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int number3 = Integer.parseInt(num3.getText().toString());
                int sum = number1 + number2 + number3;
                result.setText("Answer: " + String.valueOf(sum));


            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int number3 = Integer.parseInt(num3.getText().toString());
                int difference = number1 - number2 - number3;
                result.setText("Answer: " + String.valueOf(difference));

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int number3 = Integer.parseInt(num3.getText().toString());
                int product = number1 * number2 * number3;
                result.setText("Answer: " + String.valueOf(product));

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int number3 = Integer.parseInt(num3.getText().toString());
                int quotient = number1 / number2 / number3;
                result.setText("Answer: " + String.valueOf(quotient));

            }
        });


    }

}





