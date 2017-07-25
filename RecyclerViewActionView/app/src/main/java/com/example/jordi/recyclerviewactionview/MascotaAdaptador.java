package com.example.jordi.recyclerviewactionview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Jordi on 24/07/2017.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {
    ArrayList <Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_macota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder holder, int position) {
        final Mascota mascota = mascotas.get(position);
        holder.imgFoto.setImageResource(mascota.getFoto());
        holder.tvNombreCV.setText(mascota.getNombre());
        holder.ranking.setText(mascota.getRanking());

        holder.huesoBlanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Diste like a " + mascota.getNombre(),Toast.LENGTH_LONG).show();
            }
        });


    }


    @Override
    public int getItemCount() {

        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private TextView tvNombreCV;
        private TextView ranking;
        private ImageView huesoBlanco;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombreCV = (TextView) itemView.findViewById(R.id.nombreCV);
            ranking = (TextView) itemView.findViewById(R.id.ranking);
            huesoBlanco = (ImageView) itemView.findViewById(R.id.huesoBlanco);

        }
    }
}
