package it.fi.itismeucci;

public class Biglietto {

    private int identificativo;         //numero id
    private String numerobiglietto;     //numerobiglietto 

    public Biglietto() {
    }

    public Biglietto(int identificativo, String numerobiglietto) {
        this.identificativo = identificativo;
        this.numerobiglietto = numerobiglietto;
    }

    public int getIdentificativo() {
        return identificativo;
    }
    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }
    public String getNumerobiglietto() {
        return numerobiglietto;
    }
    public void setNumerobiglietto(String numerobiglietto) {
        this.numerobiglietto = numerobiglietto;
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + getIdentificativo() + "'" +
            ", numeroB='" + getNumerobiglietto() + "'" +
            "}";
    }
    

    
}
