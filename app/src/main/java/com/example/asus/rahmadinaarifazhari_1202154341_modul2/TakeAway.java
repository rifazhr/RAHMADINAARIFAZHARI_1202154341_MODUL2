package com.example.asus.rahmadinaarifazhari_1202154341_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void onClickOrder(View view) { //jika dieksekusi maka akan langsung mengarah ke class Menu
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }

    public void onDate(View view) { //untuk mengatur tanggal pemesanan
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
    }

    public void onTime(View view) { //untuk mengatur waktu pemesanan
        DialogFragment newFragment = new TimePicker();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }
}
