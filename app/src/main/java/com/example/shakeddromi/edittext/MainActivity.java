package com.example.shakeddromi.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText date;
    TextView txt;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        date=(EditText)findViewById(R.id.date);
        txt=(TextView)findViewById(R.id.txt);

    }

    public void btn(View view) {
        st=date.getText().toString();
        txt.setText(st);


    }
}
