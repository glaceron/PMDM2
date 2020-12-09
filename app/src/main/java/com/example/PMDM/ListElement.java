package com.example.PMDM;


import java.util.ArrayList;

public class ListElement
{
    public int imagen;
    public String titulo;
    public String autor;
    public String editorial;
    public String fecha;
    public String sinopsis;


    public ListElement(int imagen, String titulo, String autor, String editorial, String fecha, String sinopsis) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fecha = fecha;
        this.sinopsis = sinopsis;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public static ArrayList<ListElement> createContactList()
    {
        ArrayList<ListElement> elements = new ArrayList<>();
        elements.add(new ListElement(R.drawable.quijote, "Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", "1605", "El ingenioso hidalgo don Quijote de la Mancha narra las aventuras de Alonso Quijano, un hidalgo pobre que de tanto leer novelas de caballería acaba enloqueciendo y creyendo ser un caballero andante, nombrándose a sí mismo como don Quijote de la Mancha."));
        elements.add(new ListElement(R.drawable.tambor, "El tambor de hojalata", "Günter Grass", "Danzig Trilogy", "1959", "La novela es contada desde la perspectiva de su protagonista,Oscar Matzerath, un enano deforme que voluntariamente decidió dejar de crecer al cumplir los tres años. Nos cuenta su historia desde la habitación de un sanatorio y nos lleva de la mano para descubrir una Alemania asolada por el nazismo y la intolerancia."));
        elements.add(new ListElement(R.drawable.gilga, "Poema de Gilgamesh", "Anónimo", "Sîn-lēqi-unninni", "2100 a.C.", "El poema cuenta la historia de las aventuras del rey Gilgamesh de Uruk."));
        elements.add(new ListElement(R.drawable.divina, "Divina Comedia", "Dante Alighieri", "-", "1304", "La Divina Comedia relata el viaje de Dante por el Infierno, el Purgatorio y el Paraíso, guiado por el poeta romano Virgilio. "));
        elements.add(new ListElement(R.drawable.cocina, "La buena cocina", "Karlos Arguiñano", "Editorial Planeta", "2018", "En este nuevo recetario de Karlos Arguiñano descubrirás qué ingredientes usar en tu día a día cuidando tu salud y con lo que tengas más a mano en la despensa o el frigorífico."));
        elements.add(new ListElement(R.drawable.blanco, "Rey blanco", "Juan Gómez-Jurado", "B", "2019", "¿JUGAMOS? Cuando Antonia Scott recibe este mensaje, sabe muy bien quién se lo envía. También sabe que ese juego es casi imposible de ganar. Pero a Antonia no le gusta perder. Después de todo este tiempo huyendo, la realidad ha acabado alcanzándola. Antonia es cinturón negro en mentirse a sí misma, pero ahora tiene claro que si pierde esta batalla, las habrá perdido todas. -La reina es la figura más poderosa del tablero -dice el Rey Blanco-. Pero por poderosa que sea una pieza de ajedrez, nunca debe olvidar que hay una mano que la mueve. -Eso ya lo veremos-, responde Antonia"));
        elements.add(new ListElement(R.drawable.linea, "Línea de fuego", "Arturo Pérez-Reverte", "Alfaguara", "2020", "Julio de 1938, miles de jóvenes combaten en la trágica batalla del Ebro. Sus nombres no son los que recuerda la Historia, pero cuanto les sucedió forma parte de nuestra memoria."));
        elements.add(new ListElement(R.drawable.oceano, "Un Océano para llegar a ti", "Sandra Barneda", "Editorial Planeta", "2019", "Una novela tierna y atrevida sobre los secretos familiares y las emociones silenciadas."));
        elements.add(new ListElement(R.drawable.roja, "Reina roja", "Juan Gómez-Jurado", "B", "2019", "Nunca ha empuñado un arma ni llevado una placa, y, sin embargo, ha resuelto decenas de crímenes."));

        return elements;
    }


}


