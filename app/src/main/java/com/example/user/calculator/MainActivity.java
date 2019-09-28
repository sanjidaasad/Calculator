package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button button_zero,button_one,button_two,button_three,button_four,button_five,button_six,button_seven,button_eight,button_nine,button_plus,button_minus,button_multiply,button_division,button_equal;
    TextView tv;
    String v1,v2,op;
    Double d1,d2,result;
    boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_zero=(Button)findViewById(R.id.btn0);
        button_one=(Button)findViewById(R.id.btn1);
        button_two=(Button)findViewById(R.id.btn2);
        button_three=(Button)findViewById(R.id.btn3);
        button_four=(Button)findViewById(R.id.btn4);
        button_five=(Button)findViewById(R.id.btn5);
        button_six=(Button)findViewById(R.id.btn6);
        button_seven=(Button)findViewById(R.id.btn7);
        button_eight=(Button)findViewById(R.id.btn8);
        button_nine=(Button)findViewById(R.id.btn9);
        button_plus=(Button)findViewById(R.id.btnplus);
        button_minus=(Button)findViewById(R.id.btnminus);
        button_multiply=(Button)findViewById(R.id.btnmul);
        button_division=(Button)findViewById(R.id.btndivision);
        button_equal=(Button)findViewById(R.id.btnequal);
        tv=(TextView)findViewById(R.id.tv);
        tv.setText("");
        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag)tv.setText(tv.getText()+"0");
                else{
                    tv.setText("0");
                    flag=false;
                }
            }
        });
        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag) tv.setText(tv.getText()+"1");
                else{
                    tv.setText("1");
                    flag=false;
                }

            }
        });
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag) tv.setText(tv.getText()+"2");
                else{
                    tv.setText("2");
                    flag=false;
                }

            }
        });
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag) tv.setText(tv.getText()+"3");
                else{
                    tv.setText("3");
                    flag=false;
                }
            }
        });
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag) tv.setText(tv.getText()+"4");
                else{
                    tv.setText("4");
                    flag=false;
                }
            }
        });
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag) tv.setText(tv.getText()+"5");
                else{
                    tv.setText("5");
                    flag=false;
                }
            }
        });
        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag) tv.setText(tv.getText()+"6");
                else{
                    tv.setText("6");
                    flag=false;
                }
            }
        });
        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag) tv.setText(tv.getText()+"7");
                else{
                    tv.setText("7");
                    flag=false;
                }
            }
        });
        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag) tv.setText(tv.getText()+"8");
                else{
                    tv.setText("8");
                    flag=false;
                }
            }
        });
        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag) tv.setText(tv.getText()+"9");
                else{
                    tv.setText("9");
                    flag=false;
                }
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=tv.getText().toString().trim();
                d1=Double.parseDouble(v1);
                op="+";
                tv.setText("");
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=tv.getText().toString().trim();
                d1=Double.parseDouble(v1);
                op="-";
                tv.setText("");
            }
        });
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=tv.getText().toString().trim();
                d1=Double.parseDouble(v1);
                op="x";
                tv.setText("");
            }
        });
        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=tv.getText().toString().trim();
                d1=Double.parseDouble(v1);
                op="/";
                tv.setText("");
            }
        });
        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2=tv.getText().toString().trim();
                d2=Double.parseDouble(v2);
                if(op=="+"){
                    result=d1+d2;
                    tv.setText(result.toString());
                }
                if(op=="-"){
                    result=d1-d2;
                    tv.setText(result.toString());
                }
                if(op=="x"){
                    result=d1*d2;
                    tv.setText(result.toString());
                }
                if(op=="/"){
                    result=d1/d2;
                    tv.setText(result.toString());
                }
                flag=true;

            }
        });



    }

}
