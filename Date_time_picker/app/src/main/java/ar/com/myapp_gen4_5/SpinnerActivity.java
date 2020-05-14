package ar.com.myapp_gen4_5;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    String strLang[] = {"Select Item", "Android", "java", ".net", "PHP", "IOS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, strLang) {

            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                TextView tvData = (TextView) super.getDropDownView(position, convertView, parent);
                if (position == 0) {
                    tvData.setTextColor(Color.GRAY);

                } else {
                    tvData.setTextColor(Color.RED);
                }
                return tvData;
            }
        };
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                } else {

                    String strData = parent.getItemAtPosition(position).toString();
                    // LayoutInflater layoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    LayoutInflater layoutInflater = getLayoutInflater();
                    View view1 = layoutInflater.inflate(R.layout.raw_toast_spinner, null,
                            false);
                    Toast toast = new Toast(SpinnerActivity.this);
                    TextView textView = (TextView) view1.findViewById(R.id.tvData);
                    textView.setText(strData);
                    toast.setView(view1);
                    toast.setGravity(Gravity.HORIZONTAL_GRAVITY_MASK, 0, 1);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();
                    //         Toast.makeText(SpinnerActivity.this, "Data is "+strData, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
