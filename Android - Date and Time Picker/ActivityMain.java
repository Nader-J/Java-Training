package timepicker.jalayeri.net.timepicker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* TimePickerDialog dialog = new TimePickerDialog(ActivityMain.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(ActivityMain.this,"you set : " + hourOfDay + " : " + minute,Toast.LENGTH_LONG).show();
            }
        },00,00,true);
        dialog.show(); */
        DatePickerDialog dialog = new DatePickerDialog(ActivityMain.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Toast.makeText(ActivityMain.this,"you set : " + year + " / " + month + " / " + dayOfMonth,Toast.LENGTH_LONG).show();
            }
        },2017,05,04);
        dialog.show();
    }
}
