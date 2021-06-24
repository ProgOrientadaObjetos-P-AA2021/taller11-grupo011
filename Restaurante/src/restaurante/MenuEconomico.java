/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author usuario
 */
public class MenuEconomico {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;
    protected double descuento;
    
    public void establcerNombrePlato(String tipo){
        nombrePlato = tipo;
    }
    public void establcerValorMenu(double tipo){
        valorMenu = tipo;
    }
    public void establcerValorInicial(double tipo){
        valorInicial = tipo;
    }
    public void establecerDescuento(double tipo){
        descuento=tipo;
    }
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    public double obtenerValorMenu(){
        return valorMenu;
    }
    public double obtenerValorInicial(){
        return valorInicial;
    }
    public double obtenerDescuento(){
        return descuento;
    }
}
