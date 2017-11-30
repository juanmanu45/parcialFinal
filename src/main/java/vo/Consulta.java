/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author Juan Manuel
 */
public class Consulta {
    
    private int kilos;
    private String municipio;
    private int idColmena;

    public Consulta(int kilos, String municipio, int idColmena) {
        this.kilos = kilos;
        this.municipio = municipio;
        this.idColmena = idColmena;
    }

    public Consulta() {
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }
    
    
    
    
}
