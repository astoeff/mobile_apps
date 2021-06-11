package com.antoni.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_Add,btn_Sub,btn_Mul,btn_Div,btn_calc,btn_dec,btn_clear;
    Button btn_left_scope, btn_right_scope, btn_factorial, btn_grade, btn_backspace;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_left_scope = findViewById(R.id.btn_left_scope);
        btn_right_scope = findViewById(R.id.btn_right_scope);
        btn_Add = findViewById(R.id.btn_Add);
        btn_Div = findViewById(R.id.btn_Div);
        btn_Sub = findViewById(R.id.btn_Sub);
        btn_Mul = findViewById(R.id.btn_Mul);
        btn_calc = findViewById(R.id.btn_calc);
        btn_dec = findViewById(R.id.btn_dec);
        btn_clear = findViewById(R.id.btn_clear);
        btn_factorial = findViewById(R.id.btn_Fact);
        btn_grade = findViewById(R.id.btn_Grade);
        btn_backspace = findViewById(R.id.btn_backspace);
        ed1 = findViewById(R.id.edText1);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString() + "0";
                ed1.setText(text);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString() + "1";
                ed1.setText(text);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString() + "2";
                ed1.setText(text);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString() + "3";
                ed1.setText(text);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString() + "4";
                ed1.setText(text);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString() + "5";
                ed1.setText(text);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString() + "6";
                ed1.setText(text);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString() + "7";
                ed1.setText(text);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString() + "8";
                ed1.setText(text);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString() + "9";
                ed1.setText(text);
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag = true;
                String exp = ed1.getText().toString();
                for (int i = exp.length() - 1; i >= 0; i--) {

                    if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '/' || exp.charAt(i) == '*' ||
                            exp.charAt(i) == '^' || exp.charAt(i) == '!' || exp.charAt(i) == ' ')
                    {
                        break;
                    }
                    else if (exp.charAt(i) == '.') {
                        flag = false;
                        break;
                    }
                }

                if (exp.length() == 0) {
                    String text = ed1.getText().toString();
                    text += "0.";
                    ed1.setText(text);
                    flag = false;
                }
                else if ( ! Character.isDigit(exp.charAt(exp.length() - 1)) && flag) {
                    String text = ed1.getText().toString();
                    text += "0.";
                    ed1.setText(text);
                    flag = false;
                }

                if (flag) {
                    String text = ed1.getText().toString();
                    text += ".";
                    ed1.setText(text);
                }
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString();
                text += "+";
                ed1.setText(text);
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString();
                text += "-";
                ed1.setText(text);
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString();
                text += "*";
                ed1.setText(text);
            }
        });


        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString();
                text += "/";
                ed1.setText(text);
            }
        });

        btn_grade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString();
                text += "^";
                ed1.setText(text);
            }
        });

        btn_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString();
                text += "!";
                ed1.setText(text);
            }
        });

        btn_left_scope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString();
                text += "(";
                ed1.setText(text);
            }
        });

        btn_right_scope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString();
                text += ")";
                ed1.setText(text);
            }
        });

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String exp = ed1.getText().toString();
                if (exp.isEmpty()) {
                    ed1.setText("");
                }
                else {
                    SolveExpression solveExp = new SolveExpression(exp);
                    double result = solveExp.eval(exp);
                    if (result == (int)result) {
                        ed1.setText(Integer.toString((int)result));
                    }
                    else {
                        ed1.setText(Double.toString(result));
                    }
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });

        btn_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ed1.getText().toString();
                if (!text.isEmpty()) {
                    text = text.substring(0, text.length() - 1);
                    ed1.setText(text);
                }
            }
        });
    }
}