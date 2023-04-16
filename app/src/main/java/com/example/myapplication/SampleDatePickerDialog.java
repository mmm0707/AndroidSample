package com.example.myapplication;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

//ユーザーが日付を設定したときにコールバックを受け取る DatePickerDialog.OnDateSetListener インターフェースを実装する。
public class SampleDatePickerDialog extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    private DatePickerDialog.OnDateSetListener listener;
    @NonNull
    @Override
    //DatePickerDialog のインスタンスを返す onCreateDialog() メソッドを定義する。
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        //現在カレンダーを取得する
        //※　getInstance():あるクラスのインスタンスが常にたった1つしか存在していない
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        //DatePickerDialogのインスタンス作成し、インスタンスを返す
        return new DatePickerDialog(getActivity(), listener, year, month, day);
    }

    //implementsでエラーになるので、とりあえず書いているもの。中身不要のため、メソッドのみ。
    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

    }
}
