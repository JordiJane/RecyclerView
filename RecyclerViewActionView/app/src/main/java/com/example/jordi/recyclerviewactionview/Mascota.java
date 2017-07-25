package com.example.jordi.recyclerviewactionview;

/**
 * Created by Jordi on 24/07/2017.
 */

public class Mascota {

    private int foto;
    private String nombre;
    private String ranking;

    public Mascota(int foto, String nombre, String ranking) {
        this.foto = foto;
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
}
