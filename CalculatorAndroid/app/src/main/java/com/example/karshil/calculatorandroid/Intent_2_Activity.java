package com.example.karshil.calculatorandroid;

        import android.content.Intent;
import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.TextView;

//import androidx.appcompat.app.AppCompatActivity;

public class Intent_2_Activity extends AppCompatActivity {

    private TextView tvf,tvl,tve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_2_);
        tvf=(TextView)findViewById(R.id.tv_fname);
        tvl=(TextView)findViewById(R.id.tv_sname);
        tve=(TextView)findViewById(R.id.tv_em);
        Intent i1=getIntent();
        String getemail=i1.getStringExtra("EMAIL");
        String getfname=i1.getStringExtra("FN");
        String getsname=i1.getStringExtra("LN");
        tvf.setText(getfname);
        tvl.setText(getsname);
        tve.setText(getemail);
    }
}

