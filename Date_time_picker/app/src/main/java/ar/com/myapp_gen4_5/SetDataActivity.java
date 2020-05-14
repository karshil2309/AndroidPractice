package ar.com.myapp_gen4_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetDataActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText edtName;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_data);

        edtName = (EditText)findViewById(R.id.edt_name);
        btnResult = (Button)findViewById(R.id.btn_setresult);
        btnResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String strData = edtName.getText().toString().trim();
        Intent i = new Intent();
        i.putExtra("NAME_KEY",strData);
        setResult(12,i);
        finish();



    }
}
