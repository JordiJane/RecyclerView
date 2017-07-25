package com.example.jordi.recyclerviewactionview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas2 = (RecyclerView) findViewById(R.id.RVmascotas2);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas2.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }
    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotas2.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.dog_icon2,"Boby","3"));
        mascotas.add(new Mascota(R.drawable.perroicono,"Perry","2"));
        mascotas.add(new Mascota(R.drawable.dog_icon,"Toby","1"));
        mascotas.add(new Mascota(R.drawable.dog_icon5,"Buggie","5"));
        mascotas.add(new Mascota(R.drawable.dog_icon3,"Doki","4"));


    }

}
