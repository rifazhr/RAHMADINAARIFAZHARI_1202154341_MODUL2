package com.example.asus.rahmadinaarifazhari_1202154341_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

public class MenuAdapter extends
        RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{ //MenuViewHolder mengeksekusi MenuAdapter

    private final LinkedList<String> mFoodList; //membuat variabel dengan LinkedList yang berbentuk String dengan nama mFoodList
    private final LinkedList<Integer> mPriceList;
    private final LinkedList<Integer> mViewList;
    private LayoutInflater mInflater; //menampung isi dari activity_menu_adapter.xml

    public MenuAdapter(Context context, LinkedList<String> foodList, LinkedList<Integer> priceList, LinkedList<Integer> photoList) {
        mInflater = LayoutInflater.from(context);
        this.mFoodList = foodList; //mFoodList memanggil isi dari foodList
        this.mPriceList = priceList;
        this.mViewList = photoList;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //memanggil ovveride MenuViewHolder
        View mItemView = mInflater.inflate(R.layout.activity_menu_adapter, parent, false);
        return new MenuViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) { //mengatur urutan berdasarkan posisi
        String mCurrentFood = mFoodList.get(position); //
        Integer mCurrentPrice = mPriceList.get(position);
        Integer mCurrentPhoto = mViewList.get(position);
        holder.foodItemView.setText(mCurrentFood);
        holder.priceItemView.setText("Rp."+mCurrentPrice.toString());
        holder.viewItemView.setImageResource(mCurrentPhoto);
    }

    @Override
    public int getItemCount() {
        return mFoodList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{ //
        public final TextView foodItemView;
        public final TextView priceItemView;
        public final ImageView viewItemView;

        final MenuAdapter mAdapter;
        public MenuViewHolder(final View itemView, MenuAdapter adapter) {
            super(itemView);
            foodItemView = (TextView)itemView.findViewById(R.id.tv_food); //menginisiasi berdasarkan id
            priceItemView = (TextView)itemView.findViewById(R.id.tv_price);
            viewItemView = (ImageView)itemView.findViewById(R.id.iv_view);
            viewItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) { //mengklik menu yang ada
                    // mengatur posisi item ketika dipilih
                    int mPosition = getLayoutPosition();
                    // digunakan untuk mengakses item yang sudah di setting
                    String food = mFoodList.get(mPosition);
                    Integer price = mPriceList.get(mPosition);
                    Integer photo = mViewList.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(),DetailMenu.class);
                    //membawa data yang dipilih
                    intent.putExtra("food",food);
                    intent.putExtra("price",price);
                    intent.putExtra("view",photo);
                    itemView.getContext().startActivity(intent); //memulai perpindahan ke layout berikutnya yaitu DetailMenu
                }
            });
            this.mAdapter = adapter;
        }

        @Override
        public void onClick(View view) {

        }
    }
}
