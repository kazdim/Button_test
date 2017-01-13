package com.mydomain.dk.button_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;
    Button butt1;
    Button butt2;
    Button butt3;
    Button butt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = (TextView) findViewById(R.id.myText);
        butt1 = (Button) findViewById(R.id.button1);
        butt2 = (Button) findViewById(R.id.button2);
        butt3 = (Button) findViewById(R.id.button3);
        butt4 = (Button) findViewById(R.id.button4);

        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button1: myTextView.setText("Нажата кнопка 1");
                        break;
                    case R.id.button2: myTextView.setText("Нажата кнопка 2");
                        break;
                    case R.id.button3: myTextView.setText("Нажата кнопка 3");
                        break;
                    case R.id.button4: myTextView.setText("Нажата кнопка 4");
                        break;
                }
            }
        };

        butt1.setOnClickListener(myOnClickListener);
        butt2.setOnClickListener(myOnClickListener);
        butt3.setOnClickListener(myOnClickListener);
        butt4.setOnClickListener(myOnClickListener);

    }
}
