package it.epicode.w7d3.Composite;

import java.util.ArrayList;
import java.util.List;



public class SottoSezione implements EntitaLibro {

    private final List<EntitaLibro> pagine = new ArrayList<>();

    @Override
    public void stampa() {

    }

    @Override
    public int getNumero() {
        return pagine.size();
    }

    public void add(EntitaLibro e) {
        pagine.add(e);
    }

    public List<EntitaLibro> getPagine() {
        return pagine;
    }
}