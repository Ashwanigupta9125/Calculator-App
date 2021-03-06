package com.example.calculator_final;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {





    @SuppressLint("SetTextI18n")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1=(TextView) findViewById(R.id.text1);
        TextView text2=(TextView)findViewById(R.id.text2);
        TextView text_res=(TextView)findViewById(R.id.text_res);
        Button but1=(Button) findViewById(R.id.but1);
        Button but2=(Button)findViewById(R.id.but2);
        Button but3=(Button)findViewById(R.id.but3);
        Button but5=(Button)findViewById(R.id.but5);
        Button but6=(Button)findViewById(R.id.but6);
        Button but7=(Button)findViewById(R.id.but7);
        Button but8=(Button)findViewById(R.id.but8);
        Button but4=(Button)findViewById(R.id.but4);
        Button but0=(Button)findViewById(R.id.but0);
        Button but9=(Button)findViewById(R.id.but9);
        Button but_add=(Button)findViewById(R.id.but_add);
        Button but_div=(Button)findViewById(R.id.but_div);
        Button but_sub=(Button)findViewById(R.id.but_sub);
        Button but_one=(Button)findViewById(R.id.but_one);
        Button butclear=(Button)findViewById(R.id.butclear);
        Button but_mul=(Button)findViewById(R.id.but_mul);


        final boolean[] x1 = {false};
        final boolean[] x2 = {false};


          text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                x1[0] =true;
                x2[0]=false;


             }});


        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text1.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "PLEASE ENTER FIRST INPUT", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    x2[0] = true;
                    x1[0]= false;

                }

            }});


            but1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override

                public void onClick(View v) {
                    if(x1[0]) {
                        text1.setText(text1.getText().toString() + "1");
                    }
                    else if(x2[0])
                    {
                        text2.setText(text2.getText().toString() + "1");
                    }
                }

            });
            but0.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    if(x1[0]) {
                        text1.setText(text1.getText().toString() + "0");
                    }
                    else if(x2[0])
                    {
                        text2.setText(text2.getText().toString() + "0");
                    }

                }
            });
            but2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    if(x1[0]) {
                        text1.setText(text1.getText().toString() + "2");
                    }
                    else if(x2[0])
                    {
                        text2.setText(text2.getText().toString() + "2");
                    }

                }
            });
            but3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    if(x1[0]) {
                        text1.setText(text1.getText().toString() + "3");
                    }
                    else if(x2[0])
                    {
                        text2.setText(text2.getText().toString() + "3");
                    }

                }
            });
            but4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    if(x1[0]) {
                        text1.setText(text1.getText().toString() + "4");
                    }
                    else if(x2[0])
                    {
                        text2.setText(text2.getText().toString() + "4");
                    }

                }
            });
            but5.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    if(x1[0]) {
                        text1.setText(text1.getText().toString() + "5");
                    }
                    else if(x2[0])
                    {
                        text2.setText(text2.getText().toString() + "5");
                    }

                }
            });
            but6.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    if(x1[0]) {
                        text1.setText(text1.getText().toString() + "6");
                    }
                    else if(x2[0])
                    {
                        text2.setText(text2.getText().toString() + "6");
                    }

                }
            });
            but7.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    if(x1[0]) {
                        text1.setText(text1.getText().toString() + "7");
                    }
                    else if(x2[0])
                    {
                        text2.setText(text2.getText().toString() + "7");
                    }

                }
            });
            but8.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    if(x1[0]) {
                        text1.setText(text1.getText().toString() + "8");
                    }
                    else if(x2[0])
                    {
                        text2.setText(text2.getText().toString() + "8");
                    }

                }
            });

            but9.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    if(x1[0]) {
                        text1.setText(text1.getText().toString() + "9");
                    }
                    else if(x2[0])
                    {
                        text2.setText(text2.getText().toString() + "9");
                    }

                }
            });




            but_add.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {

                    if (text1.getText().toString().isEmpty() || text2.getText().toString().isEmpty()) {
                        Toast.makeText(getApplicationContext(), "PLEASE ENTER FIRST INPUT ANS SECOND INPUT", Toast.LENGTH_SHORT).show();
                    } else {
                        Double v1 = Double.parseDouble((String) text1.getText());
                        Double v2 = Double.parseDouble((String) text2.getText());

                        double v3 = v1 + v2;

                        text_res.setText(Double.toString(v3));
                    }
                }});

           but_sub.setOnClickListener(new View.OnClickListener() {
               @SuppressLint("SetTextI18n")
               @Override
               public void onClick(View v) {

                   if (text1.getText().toString().isEmpty() || text2.getText().toString().isEmpty()) {
                       Toast.makeText(getApplicationContext(), "PLEASE ENTER FIRST INPUT ANS SECOND INPUT", Toast.LENGTH_SHORT).show();
                   }
                   else {
                       Double v1 = Double.parseDouble((String) text1.getText());
                       Double v2 = Double.parseDouble((String) text2.getText());

                       double v3 = v1 - v2;

                       text_res.setText(Double.toString(v3));
                   }  }
           });

           but_div.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (text1.getText().toString().isEmpty() || text2.getText().toString().isEmpty()) {
                       Toast.makeText(getApplicationContext(), "PLEASE ENTER FIRST INPUT ANS SECOND INPUT", Toast.LENGTH_SHORT).show();
                   }
                   else
                   {Double v1=Double.parseDouble((String) text1.getText());
                   Double v2=Double.parseDouble((String) text2.getText());

                   double v3=v1/v2;

                   text_res.setText(Double.toString(v3));}
               }
           });

           but_mul.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (text1.getText().toString().isEmpty() || text2.getText().toString().isEmpty()) {
                       Toast.makeText(getApplicationContext(), "PLEASE ENTER FIRST INPUT ANS SECOND INPUT", Toast.LENGTH_SHORT).show();
                   }
                   else
                   {Double v1=Double.parseDouble((String) text1.getText());
                   Double v2=Double.parseDouble((String) text2.getText());

                   double v3=v1*v2;

                   text_res.setText(Double.toString(v3));
               }}
           });

           butclear.setOnClickListener(v -> {

               text1.setText("");
               text2.setText("");

           });
           but_one.setOnClickListener(v -> {

               if(x1[0]) {
                   if(text1.getText().toString().isEmpty())
                   {
                       Toast.makeText(getApplicationContext(), "PLEASE ENTER SOME INPUT ", Toast.LENGTH_SHORT).show();
                   }
                     else
                   {Integer v1=Integer.parseInt((String)text1.getText());
                   v1=v1/10;
                   text1.setText(Integer.toString(v1));}
               }
               else if(x2[0])
               {
                   if(text2.getText().toString().isEmpty())
                   {
                       Toast.makeText(getApplicationContext(), "PLEASE ENTER SOME INPUT ", Toast.LENGTH_SHORT).show();
                   }
                   else {
                       Integer v2 = Integer.parseInt((String) text2.getText());
                       v2 = v2 / 10;
                       text2.setText(Integer.toString(v2));
                   }
               }

           });

    }


}