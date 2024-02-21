package it.epicode.w7d3.Adapter;

public class UserData implements DataSource {

    private String nomeCompleto;
    private int eta;

    public UserData() {}

    public UserData(String nomeCompleto, int eta) {
        this.nomeCompleto = nomeCompleto;
        this.eta = eta;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void getData() {
        nomeCompleto = getNomeCompleto();
        eta = getEta();
    }

    @Override
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public int getEta() {
        return eta;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", eta=" + eta +
                '}';
    }
}
