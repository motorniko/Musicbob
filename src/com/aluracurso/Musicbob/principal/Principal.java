package com.aluracurso.Musicbob.principal;

import com.aluracursos.Musicbob.modelos.Cancion;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();

        miCancion.setTitulo("Pricetack");
        miCancion.setDuracion(240);
        miCancion.setArtista("Jessie J");
        miCancion.setAlbum("Alive");
        miCancion.setGenero("Pop");
        miCancion.setFechaDeLanzamiento(2013);

        System.out.println("Titulo: " + miCancion.getTitulo());


    }
}
