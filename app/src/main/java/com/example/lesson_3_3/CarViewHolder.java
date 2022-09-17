package com.example.lesson_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {


    private TextView tv_car;


    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_car = itemView.findViewById(R.id.tv_car);
    }

    public void bind(String name_country){
        tv_car.setText(name_country);
    }
}

