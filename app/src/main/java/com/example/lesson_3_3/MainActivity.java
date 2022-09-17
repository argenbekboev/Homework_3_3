package com.example.lesson_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_car);

        arrayList.add("Mercedes");
        arrayList.add("BMW");
        arrayList.add("Honda");
        arrayList.add("Audi");
        arrayList.add("Bentley");
        arrayList.add("Bugatti");
        arrayList.add("Cadillac");
        arrayList.add("Chevrolet");
        arrayList.add("Dodge");
        arrayList.add("Ferrari");
        arrayList.add("Ford");
        arrayList.add("Lada");
        arrayList.add("Lamborghini");
        arrayList.add("Lexus");
        arrayList.add("Mazda");
        arrayList.add("Kia");
        arrayList.add("Jeep");
        arrayList.add("Jaguar");
        arrayList.add("Hyundai");
        arrayList.add("Hummer");


        CarAdapter carAdapter = new CarAdapter(arrayList);

        recyclerView.setAdapter(carAdapter);

    }
}

