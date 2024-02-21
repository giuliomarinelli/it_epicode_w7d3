package it.epicode.w7d3.Composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements EntitaLibro {

    private final List<EntitaLibro> sottosezioni = new ArrayList<>();

    @Override
    public void stampa() {

    }

    @Override
    public int getNumero() {
        return 0;
    }

    public void add(EntitaLibro e) {
        sottosezioni.add(e);
    }

    public List<EntitaLibro> getSottosezioni() {
        return sottosezioni;
    }

    public int getNumeroPagine() {
        return sottosezioni.stream().mapToInt(EntitaLibro::getNumero).sum();
    }
}
