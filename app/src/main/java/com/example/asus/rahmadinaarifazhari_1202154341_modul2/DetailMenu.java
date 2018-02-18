package com.example.asus.rahmadinaarifazhari_1202154341_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    TextView tv_food, tv_price; //membuat variabel
    ImageView iv_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent();
        //mengambil data
        String food = intent.getStringExtra("food");
        Integer price = intent.getIntExtra("price",0);
        Integer view = intent.getIntExtra("view",0);

        Log.d("getIntExtra", ""+price+view); //untuk menampilkan pada logcat

        tv_food = (TextView)findViewById(R.id.tv_detailFood);
        tv_price = (TextView)findViewById(R.id.tv_detailPrice);
        iv_view = (ImageView)findViewById(R.id.iv_detailView);

        tv_food.setText(food); //mendapatkan data dari getStringExtra
        tv_price.setText("Rp. "+price);
        iv_view.setImageResource(view);
    }
}
