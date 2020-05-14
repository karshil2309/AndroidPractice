package ar.com.myapp_gen4_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OnActivity_Activity extends AppCompatActivity implements View.OnClickListener {

    Button btnNext;
    TextView tvData;
   // public static String TAG = OnActivity_Activity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_);
        btnNext = (Button)findViewById(R.id.btn_next);
        btnNext.setOnClickListener(this);
        tvData = (TextView)findViewById(R.id.tv_data);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_next:

                Intent i = new Intent(OnActivity_Activity.this,SetDataActivity.class);
                startActivityForResult(i,12);
                break;

        }

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 12 ){

            String strData = data.getStringExtra("NAME_KEY");
            tvData.setText(strData);
            tvData.setVisibility(View.VISIBLE);


        }


    }
}
