package it.epicode.w7d3.Composite;

import java.util.ArrayList;
import java.util.List;

public class Pagina implements EntitaLibro {

    private String pagina;

    @Override
    public void stampa() {

    }

    @Override
    public int getNumero() {
        return 1;
    }

    public void setPagina(String p) {
        pagina = p;
    }

    public String getPagina() {
        return pagina;
    }
}