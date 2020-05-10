package ar.com.myapp_gen4_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgLogo;
    private EditText edtEmail, edtPassword;
    Button btnLogin,btnRegister;
    private static String TAG = MainActivity.class.getName();
    TextView tvData;
    CheckBox checkBox;
    private RadioGroup radiogrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {

        imgLogo = (ImageView) findViewById(R.id.img_logo);
        edtEmail = (EditText) findViewById(R.id.edt_username);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);

        checkBox = (CheckBox) findViewById(R.id.chb);
        radiogrp = (RadioGroup) findViewById(R.id.radiogrp);
        tvData = (TextView) findViewById(R.id.tv_data);
        btnRegister = (Button)findViewById(R.id.btn_login1);
        btnRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_login:
                if (checkBox.isChecked()) {

                    int radioid = radiogrp.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton)findViewById(radioid);

                    String strEmail = edtEmail.getText().toString().trim();
                    String strradio = radioButton.getText().toString();
                    tvData.setText(strEmail);
                    //tvData.setText(R.string.email);
                    imgLogo.setImageResource(R.drawable.ahmedabad);
                    Toast.makeText(MainActivity.this, "Email id is" + strEmail+"Radio "+strradio, Toast.LENGTH_LONG).show();

                    Log.e(TAG, "Email id is" + strEmail);
                    Log.w(TAG, "Email id is" + strEmail);
                    Log.i(TAG, "Email id is" + strEmail);
                    Log.d(TAG, "Email id is" + strEmail);
                    Log.v(TAG, "Email id is" + strEmail);

                } else {

                    Toast.makeText(this, "No data Found", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btn_login1:

                Intent i = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);
                break;
        }

    }
}

