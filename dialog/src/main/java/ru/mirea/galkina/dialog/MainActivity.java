package ru.mirea.galkina.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onTimeClicked(View view) {
        MyTimeDialogFragment timeDialogFragment = new MyTimeDialogFragment();
        new TimePickerDialog(this, timeDialogFragment.t, timeDialogFragment.time.get(Calendar.HOUR_OF_DAY),
                timeDialogFragment.time.get(Calendar.MINUTE), true).show();
    }

    public void onDateClicked(View v) {
        MyDateDialogFragment dateDialogFragment = new MyDateDialogFragment();
        new DatePickerDialog(MainActivity.this, dateDialogFragment.d, dateDialogFragment.date.get(Calendar.YEAR),
                dateDialogFragment.date.get(Calendar.MONTH), dateDialogFragment.date.get(Calendar.DAY_OF_MONTH)).show();

    }

    public void onProgressClicked(View view) {
        ProgressDialog myProgressDialog = new ProgressDialog(MainActivity.this);;
        MyProgressDialogFragment.onProgress(myProgressDialog);
    }
}