package it.fi.itismeucci;

import java.util.ArrayList;

public class Messaggio {
    private ArrayList<Biglietto> lista;

    public Messaggio(ArrayList<Biglietto> lista) {
        this.lista = lista;
    }
    public Messaggio() {
    }
    public ArrayList<Biglietto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Biglietto> lista) {
        this.lista = lista;
    }
    
}
