/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author ASUS
 */



public class MenualaCarta extends Menu{


    protected double valorGuarnicion;
    protected double valorBebida;
    protected double valorAdicion;
    
    public MenualaCarta(String nom,double vI,double vg,
            double vB,double vA){
        super(nom,vI);
        establecerValorGuarnicion(vg);
        establecerValBebidas(vB);
        establecerValorAdicion(vA);
    }
    
    @Override
    public void establecerNombrePlato(String n){
        nombrePlato= n;
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorGuarnicion+valorBebida+ 
                valorInicial+(valorInicial*(valorAdicion/100));
    }    

    @Override
    public void establecerValorInicial(double n){
        valorInicial=n;
    }

    
    public void establecerValorGuarnicion(double n){
        valorGuarnicion=n;
    }
    
    public void establecerValBebidas(double n){
        valorBebida=n;
    }
    
    public void establecerValorAdicion(double n){
        valorAdicion=n;
    }
    
    public double obtenerValorGuarnicion(){
        return valorGuarnicion;
    }
    public double obtenerValBebidas(){
        return valorBebida;
    }
    
    public double obtenerValorAdicion(){
        return valorAdicion;
    }
    @Override
    public String toString() {

        String cadena = String.format("Menú a la carta: \n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor Menú: %.2f\n"
                + "Valor por guarnición: %.2f\n"
                + "Valor por bebida: %.2f\n"
                + "Valor adicional: %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerValorMenu(),
                obtenerValorGuarnicion(),
                obtenerValBebidas(),
               obtenerValorAdicion()); 
        return cadena;
    }
}
