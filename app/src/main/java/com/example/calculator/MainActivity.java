package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private TextView operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = findViewById(R.id.current);
        operand2 = findViewById(R.id.result);
        operation = findViewById(R.id.operator);

        Button button0 = findViewById(R.id.btn0);
        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);
        Button button6 = findViewById(R.id.btn6);
        Button button7 = findViewById(R.id.btn7);
        Button button8 = findViewById(R.id.btn8);
        Button button9 = findViewById(R.id.btn9);
        Button buttonPoint = findViewById(R.id.btnPoint);

        Button backspace = findViewById(R.id.backspace);
        Button clear = findViewById(R.id.clear);

        Button add = findViewById(R.id.btnPlus);
        Button subtract = findViewById(R.id.btnMinus);
        Button multiply = findViewById(R.id.btnMultiply);
        Button divide = findViewById(R.id.btnDivide);

        View.OnClickListener buttonPressListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button clicked = (Button) view;
                operand1.append(clicked.getText().toString());
            }
        };

        View.OnClickListener backspaceListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand1.setText(operand1.getText().toString().substring(0, operand1.getText().toString().length() - 1));
            }
        };

        View.OnClickListener operationListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button operationButton = (Button) view;
                String currentOperation = operation.getText().toString().trim();
                String newOperation = operationButton.getText().toString();
                operation.setText(newOperation);
            }
        };

        button0.setOnClickListener(buttonPressListener);
        button1.setOnClickListener(buttonPressListener);
        button2.setOnClickListener(buttonPressListener);
        button3.setOnClickListener(buttonPressListener);
        button4.setOnClickListener(buttonPressListener);
        button5.setOnClickListener(buttonPressListener);
        button6.setOnClickListener(buttonPressListener);
        button7.setOnClickListener(buttonPressListener);
        button8.setOnClickListener(buttonPressListener);
        button9.setOnClickListener(buttonPressListener);
        buttonPoint.setOnClickListener(buttonPressListener);

        backspace.setOnClickListener(backspaceListener);

        add.setOnClickListener(operationListener);
        subtract.setOnClickListener(operationListener);
        multiply.setOnClickListener(operationListener);
        divide.setOnClickListener(operationListener);
    }
}















