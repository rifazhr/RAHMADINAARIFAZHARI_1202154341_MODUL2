package com.example.asus.rahmadinaarifazhari_1202154341_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //mengarahkan ke layout
    }
    public void onClickOrder(View view) { //berasal dari button yang ada di layout activity_main.xml
        if (((RadioButton)findViewById(R.id.rb_DineIn)).isChecked()){ //kondisi saat DineIn dipilih
            Intent intent = new Intent(this, DineIn.class); //intent digunakan untuk pindah layout
            Toast.makeText(this,"Dine In",Toast.LENGTH_SHORT).show();
            startActivity(intent);

        }else if (((RadioButton)findViewById(R.id.rb_TakeAway)).isChecked()){ //kondisi saat TakeAway dipilih
            Intent intent = new Intent(this, TakeAway.class); //intent digunakan untuk pindah ke layout TakeAway
            Toast.makeText(this,"Take Away",Toast.LENGTH_SHORT).show();
            startActivity(intent);

        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show(); //Jika belum memilih salah satu kondisi, maka muncul pop up messages
        }
    }
}
