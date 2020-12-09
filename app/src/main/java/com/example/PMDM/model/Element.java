package com.example.PMDM.model;

import android.os.Parcelable;
import android.os.Parcel;

public class Element implements Parcelable
{
    public static final String TAG = "Elemento";
    private String titulo;
    private int imagen;
    private String autor;
    private String editorial;
    private String sinopsis;
    private String fecha;

    public Element(int imagen, String titulo, String autor, String editorial, String fecha, String sinopsis) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.autor = autor;
        this.editorial = editorial;
        this.sinopsis = sinopsis;
        this.fecha = fecha;
    }

    protected Element(Parcel in) {
        titulo = in.readString();
        imagen = in.readInt();
        autor = in.readString();
        editorial = in.readString();
        sinopsis = in.readString();
        fecha = in.readString();
    }

    public static final Creator<Element> CREATOR = new Creator<Element>() {
        @Override
        public Element createFromParcel(Parcel in) {
            return new Element(in);
        }

        @Override
        public Element[] newArray(int size) {
            return new Element[size];
        }
    };

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(titulo);
        dest.writeInt(imagen);
        dest.writeString(autor);
        dest.writeString(editorial);
        dest.writeString(sinopsis);
        dest.writeString(fecha);
    }
}
