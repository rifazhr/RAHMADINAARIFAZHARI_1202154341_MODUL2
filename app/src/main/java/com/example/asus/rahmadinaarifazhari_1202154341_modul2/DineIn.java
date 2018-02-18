package com.example.asus.rahmadinaarifazhari_1202154341_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class DineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener { //agar dropdown nya dapat dipilih

    private Spinner spinner; // membuat variabel spinner

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        // membuat spinner
        spinner = (Spinner) findViewById(R.id.spinner_table); // menginisiasi id spinner

        // membuat ArrayAdapter (yg menampung isi konten) dengan menggunakan string array dan default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tables_array, android.R.layout.simple_spinner_item);
        // menspesifikan layout ketika memilih list yang muncul
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // menampilkan isi adapter ketika menggunakan spinner
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void onClickOrder(View view) {
        String a = spinner.getSelectedItem().toString();

        if (a.equalsIgnoreCase("Meja 1")) {
            Toast.makeText(this, "Anda Memilih Meja 1", Toast.LENGTH_SHORT).show();
            Intent b = new Intent(DineIn.this, Menu.class); //jika sudah dipilih maka akan mengarah ke class Menu
            startActivity(b);

        } else if (a.equalsIgnoreCase("Meja 2")) {
            Toast.makeText(this, "Anda Memilih Meja 2", Toast.LENGTH_SHORT).show();
            Intent b = new Intent(DineIn.this, Menu.class);
            startActivity(b);

        } else if (a.equalsIgnoreCase("Meja 3")) {
            Toast.makeText(this, "Anda Memilih Meja 3", Toast.LENGTH_SHORT).show();
            Intent b = new Intent(DineIn.this, Menu.class);
            startActivity(b);

        } else if (a.equalsIgnoreCase("Meja 4")) {
            Toast.makeText(this, "Anda Memilih Meja 4", Toast.LENGTH_SHORT).show();
            Intent b = new Intent(DineIn.this, Menu.class);
            startActivity(b);

        } else if (a.equalsIgnoreCase("Meja 5")) {
            Toast.makeText(this, "Anda Memilih Meja 5", Toast.LENGTH_SHORT).show();
            Intent b = new Intent(DineIn.this, Menu.class);
            startActivity(b);

        }

    }
}