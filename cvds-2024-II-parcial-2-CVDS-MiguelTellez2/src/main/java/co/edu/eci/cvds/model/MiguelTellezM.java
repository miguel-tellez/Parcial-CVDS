package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MIGUEL_TELLEZ")
public class MiguelTellezM {
    @Id
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "LETRA")
    private String letra;
    @Column(name = "RAZON")
    private String razon;

    public MiguelTellezM() {
    }

    public MiguelTellezM(String numero, String letra, String razon) {
        this.numero = numero;
        this.letra = letra;
        this.razon = razon;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String valor) {
        this.letra = letra;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    @Override
    public String toString() {
        return "Configuration [propiedad = " + numero + ", valor = " + letra + ",razon =" + razon + "]";
    }
}