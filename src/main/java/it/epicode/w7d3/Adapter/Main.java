package it.epicode.w7d3.Adapter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UserData userData = new UserData("Giulio Marinelli", 28);
        InfoAdapter infoAdapter = new InfoAdapter("Giulio", "Marinelli", LocalDate.parse("1991-06-16"));
        System.out.println(userData.toString() + "\n" + infoAdapter.toString());
        System.out.println(userData.getNomeCompleto());
        System.out.println(userData.getEta());
        System.out.println(infoAdapter.getNomeCompleto());
        System.out.println(infoAdapter.getEta());
    }
}
