package it.epicode.w7d3.Adapter;

import java.time.LocalDate;

public class InfoAdapter implements DataSource {

    private Info info;

    public  InfoAdapter() {}
    public InfoAdapter(String nome, String cognome, LocalDate dataDiNascita) {
        info = new Info(nome, cognome, dataDiNascita);
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return LocalDate.now().getYear() - info.getDataDiNascita().getYear();
    }

    @Override
    public String toString() {
        return "InfoAdapter{" +
                info +
                '}';
    }
}
