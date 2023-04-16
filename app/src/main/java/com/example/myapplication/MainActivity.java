package com.example.myapplication;

import android.app.DatePickerDialog;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.DatePicker;
import android.widget.EditText;

import java.time.Year;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

//    private AppBarConfiguration appBarConfiguration;
//    private ActivityMainBinding binding;

    private EditText datePickerEditText;
    private DatePickerDialog.OnDateSetListener listener;

    @Override
    //①最初に呼ばれる
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePickerEditText.findViewById(R.id.datePickerEditText);
        datePickerEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });
    }

    @Override
    //※　onDateSet:ユーザが選択した日付で何かする
    public void onDateSet (DatePicker datepicker,int year, int month, int day){
        String dateStr = String.format(Locale.JAPAN,  year + "/" + month + "/" + day);
        datePickerEditText.setText(dateStr);
    };

    public void showDatePickerDialog (View v){
        DialogFragment  datePickerDialog = new DialogFragment();
        datePickerDialog.show(getSupportFragmentManager(), "sampleDatePickerDialog");
    };

};