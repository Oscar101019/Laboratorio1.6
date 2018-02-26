package com.ejemplo.recyclerviewcv1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<DataProvider> productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();



        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Aquí va la adición de elementos a la lista
        productList.add(
                new DataProvider("Dance & House", "Random Accesses Memories",R.drawable.imagen1)
        );
        productList.add(
                new DataProvider("Electronica", "Discovery",R.drawable.imagen2)
        );
        productList.add(
                new DataProvider(" Alternativa/Independiente", "Demon Days",R.drawable.imagen3)
        );
        productList.add(
                new DataProvider("Electroni/R&B/Hip Hop", "Humanz",R.drawable.imagen4)
        );
        productList.add(
                new DataProvider("Alternative metal", "Toxicity",R.drawable.imagen5)
        );
        productList.add(
                new DataProvider("Heavy Metal", "Hypnotize",R.drawable.imagen6)
        );
        productList.add(
                new DataProvider("Nu Metal, ", "Murdered Love",R.drawable.imagen7)
        );
        productList.add(
                new DataProvider("Heavy metal", "Nightmare",R.drawable.imagen8)
        );
        productList.add(
                new DataProvider("Metal Progresivo", "City of Evil",R.drawable.imagen9)
        );

        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);



    }



}
