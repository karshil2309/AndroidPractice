package ar.com.myapp_gen4_5;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAlertDialog, btncustomDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        btnAlertDialog = (Button) findViewById(R.id.btn_Alert_Dialog);
        btnAlertDialog.setOnClickListener(this);

        btncustomDialog = (Button) findViewById(R.id.btn_custom_Dialog);
        btncustomDialog.setOnClickListener(this);

    }
/*

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(R.string.alert));
        builder.setMessage("Do you want to exit??");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
                // Toast.makeText(DialogActivity.this, "yes is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(DialogActivity.this, "No is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNeutralButton("finish", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
                Toast.makeText(DialogActivity.this, "Finish is Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();

    }
*/

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_Alert_Dialog:


                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(getResources().getString(R.string.alert));
                builder.setMessage("Do you want to exit??");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();
                        // Toast.makeText(DialogActivity.this, "yes is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(DialogActivity.this, "No is clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNeutralButton("finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                        Toast.makeText(DialogActivity.this, "Finish is Clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.show();
                break;

            case R.id.btn_custom_Dialog:

                AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = layoutInflater.inflate(R.layout.row_custom_dialog, null, false);
                final EditText edtEmail = (EditText) view.findViewById(R.id.edt_email);
                TextView tvLogin = (TextView) view.findViewById(R.id.tv_login);

                tvLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String strEmail = edtEmail.getText().toString();
                        Toast.makeText(DialogActivity.this, "Email "+strEmail, Toast.LENGTH_SHORT).show();
                    }
                });
                builder1.setView(view);

                builder1.show();

                break;
        }
    }
}
