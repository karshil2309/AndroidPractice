package ar.com.myapp_gen4_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataDisplayActivity extends AppCompatActivity {

    TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_display);

        tvData = (TextView)findViewById(R.id.tv_data);
        Intent i = getIntent();
        String strEmail = i.getStringExtra("EMAIL_KEY");
        tvData.setText(strEmail);

    }
}
