package ar.com.myapp_gen4_5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentActivity extends AppCompatActivity implements
        View.OnClickListener {

    EditText edtEmail,edtPassword;
    Button btnNext,btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        edtEmail = (EditText)findViewById(R.id.edt_email);
        edtPassword = (EditText)findViewById(R.id.edt_password);
        btnNext = (Button)findViewById(R.id.btn_next);
        btnNext.setOnClickListener(this);
        btnSend = (Button)findViewById(R.id.btn_send);
        btnSend.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_next:

                String strEmail = edtEmail.getText().toString().trim();
                String strPass = edtPassword.getText().toString().trim();

                Intent i = new Intent(IntentActivity.this,DataDisplayActivity.class);
                i.putExtra("EMAIL_KEY",strEmail);

                startActivity(i);

                break;
            case R.id.btn_send:

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(intent);


                break;

        }
    }
}
