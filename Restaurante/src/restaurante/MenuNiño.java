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
public class MenuNiño extends Menu{
    

    protected double valorPorHela;
    protected double valorPorPastel;
    
    public MenuNiño(String nom,double vI,double vH,double vP){
        super(nom,vI);
        establecerValorPorHela(vH);
        establecerValorPorPastel(vP);
    }
    
    @Override
    public void establecerNombrePlato(String tipo){
        nombrePlato = tipo;
    }
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial+valorPorHela+valorPorPastel;
    }
    @Override
    public void establecerValorInicial(double tipo){
        valorInicial = tipo;
    }
    public void establecerValorPorHela(double tipo){
        valorPorHela = tipo;
    }
    public void establecerValorPorPastel(double tipo){
        valorPorPastel = tipo;
    }
    
    public double obtenerValorPorHela(){
        return valorPorHela;
    }
    public double obtenerValorPorPastel(){
        return valorPorPastel;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menú Niño: \n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor Menú: %.2f\n"
                + "Valor por helado: %.2f\n"
                + "Valor por pastel: %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerValorMenu(),
                obtenerValorPorHela(),
                obtenerValorPorPastel()); 
        return cadena;
    }
    
}
