package co.icesi.compunet_taller.model;

import java.util.Date;
import java.io.Serializable;


public class Vehicle implements Serializable {

    private String id;
    private String placa;
    private String cilindraje;
    private String tipo_combustible;
    private String numero_motor;
    private String marca;
    private int modelo;

    public Vehicle(String id, String placa, String cilindraje, String tipo_combustible, String numero_motor, String marca, int modelo) {
        this.id = id;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.tipo_combustible = tipo_combustible;
        this.numero_motor = numero_motor;
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public String getNumero_motor() {
        return numero_motor;
    }

    public void setNumero_motor(String numero_motor) {
        this.numero_motor = numero_motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

}
