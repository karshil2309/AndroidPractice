package com.example.karshil.calculatorandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import androidx.appcompat.app.AppCompatActivity;
public class Intent_1_Activity extends AppCompatActivity {

    private Button btnexplicit;
    private TextView tvreg;
    private EditText edtfn,edtln,edtemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_1_);
        btnexplicit=(Button)findViewById(R.id.btn_explicit);
        edtfn=(EditText)findViewById(R.id.edt_fn);
        edtln=(EditText)findViewById(R.id.edt_ln);
        edtemail=(EditText)findViewById(R.id.edt_email);
    }

    public void sendData(View view) {
        String fn=edtfn.getText().toString();
        String ln=edtln.getText().toString();
        String email=edtemail.getText().toString();
        Intent i=new Intent(Intent_1_Activity.this,Intent_2_Activity.class);
        i.putExtra("EMAIL",email);
        i.putExtra("FN",fn);
        i.putExtra("LN",ln);
        startActivity(i);
    }
}
