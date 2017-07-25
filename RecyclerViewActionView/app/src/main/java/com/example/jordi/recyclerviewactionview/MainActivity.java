package com.example.jordi.recyclerviewactionview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(R.id.RVmascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.star:
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);


        }
        return super.onOptionsItemSelected(item);
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.perroicono,"Perry","2"));
        mascotas.add(new Mascota(R.drawable.dog_icon,"Toby","1"));
        mascotas.add(new Mascota(R.drawable.dog_icon2,"Boby","3"));
        mascotas.add(new Mascota(R.drawable.dog_icon3,"Doki","4"));
        mascotas.add(new Mascota(R.drawable.dog_icon5,"Buggie","5"));

    }
}
