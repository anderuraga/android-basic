package com.example.ander.drawer.vo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ur00 on 16/06/2016.
 */
public class Cancion implements Parcelable {

    private String nombre;
    private String artista;
    private String duracion;
    private String imagen;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Cancion(String nombre, String artista, String duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.imagen ="http://loremflickr.com/200/200/music";
    }

    protected Cancion(Parcel in) {
        nombre = in.readString();
        artista = in.readString();
        duracion = in.readString();
    }

    public static final Creator<Cancion> CREATOR = new Creator<Cancion>() {
        @Override
        public Cancion createFromParcel(Parcel in) {
            return new Cancion(in);
        }

        @Override
        public Cancion[] newArray(int size) {
            return new Cancion[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(artista);
        dest.writeString(duracion);
        dest.writeString(imagen);
    }
}
