package it.epicode.w7d3.Composite;

import java.util.ArrayList;
import java.util.List;

public class Libro implements EntitaLibro {

    private final List<String> autori = new ArrayList<>();



    @Override
    public void stampa() {

    }

    @Override
    public int getNumero() {
        return 0;
    }
}
