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
public class MenuNiño extends Restaurante{
    

    protected double valorPorHela;
    protected double valorPorPastel;
    
    public void establcerNombrePlato(String tipo){
        nombrePlato = tipo;
    }
    public void establcerValorMenu(double tipo){
        valorMenu = tipo;
    }
    public void establcerValorInicial(double tipo){
        valorInicial = tipo;
    }
    public void establcerValorPorHela(double tipo){
        valorPorHela = tipo;
    }
    public void establcerValorPorPastel(double tipo){
        valorPorPastel = tipo;
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
    public double obtenerValorPorHela(){
        return valorPorHela;
    }
    public double obtenerValorPorPastel(){
        return valorPorPastel;
    }
    
}
