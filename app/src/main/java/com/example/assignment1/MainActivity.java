package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      EditText num1,num2;
      TextView res;
      Button btnadd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = (Button)findViewById(R.id.btnadd);
        num1=(EditText) findViewById(R.id.etnum1);
        num2=(EditText) findViewById(R.id.etnum2);
        res=(TextView) findViewById(R.id.textView3);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mynum1=num1.getText().toString();
                int mnum1=Integer.parseInt(mynum1);

                String mynum2=num2.getText().toString();
                int mnum2=Integer.parseInt(mynum2);

               int  res1=mnum1+mnum2;
                res.setText(Integer.toString(res1));
            }
        });
    }
}


