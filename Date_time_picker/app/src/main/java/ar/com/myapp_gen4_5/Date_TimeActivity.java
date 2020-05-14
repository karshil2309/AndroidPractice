package ar.com.myapp_gen4_5;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Date_TimeActivity extends AppCompatActivity implements
        View.OnClickListener {

    Button btnDate;
    TextView tvDate;
    int date,month,year;
    private Button btnTime;
    private TextView tvTime;
    private int minute;
    private int hour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date__time);
        btnDate = (Button)findViewById(R.id.btn_date);
        tvDate = (TextView)findViewById(R.id.tv_date);
        btnDate.setOnClickListener(this);

        btnTime = (Button)findViewById(R.id.btn_time);
        tvTime = (TextView)findViewById(R.id.tv_time);
        btnTime.setOnClickListener(this);


        Calendar calendar = Calendar.getInstance();
        date = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        minute = calendar.get(Calendar.MINUTE);
       hour = calendar.get(Calendar.HOUR_OF_DAY);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_date:

                DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                        tvDate.setText(dayOfMonth+"-"+(month+1)+"-"+year);
                    }

                },year,month,date);
                datePickerDialog.show();
                break;

            case R.id.btn_time:

                TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        tvTime.setText(hourOfDay+":"+minute);
                    }
                },hour,minute,true);

                timePickerDialog.show();
                break;
        }
    }
}
