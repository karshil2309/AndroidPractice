package ar.com.myapp_gen4_5;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class AActivity extends AppCompatActivity {

    Button btnNext;
    private static String TAG = AActivity.class.getName();
    RatingBar ratingBar;
    TextView tvrating, tvSeekbar;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        init();
        }

    private void init() {

        btnNext = (Button) findViewById(R.id.btn_next);
        ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        tvrating = (TextView) findViewById(R.id.tv_rating);

        seekBar = (SeekBar) findViewById(R.id.seekbar);
        tvSeekbar = (TextView) findViewById(R.id.tv_seekbar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                tvSeekbar.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                tvrating.setText(String.valueOf(rating));
            }
        });


        Log.e("AActivity", "ONCREATE");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(AActivity.this, BActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e(TAG, "onDestroy");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");

    }

}
