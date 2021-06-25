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
public class MenudelDia extends Menu{

    protected double valorPostre;
    protected double valorBebida;
    
    public MenudelDia(String nom,double vI,double vP,double vB){
        super(nom,vI);
        establecerValorPostre(vP);
        establecerValBebidas(vB);
    }

    @Override
    public void establecerValorMenu(){
        valorMenu=valorInicial+valorPostre+valorBebida;
    }
    
    public void establecerValorPostre(double n){
        valorPostre=n;
    }
    
    public void establecerValBebidas(double n){
        valorBebida=n;
    }
    
    public double obtenerValorPostre(){
        return valorPostre;
    }
    public double obtenerValBebidas(){
        return valorBebida;
    }
    @Override
    public String toString() {

        String cadena = String.format("Menú del Dia: \n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor Menú: %.2f\n"
                + "Valor postre: %.2f\n"
                + "Valor bebida: %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerValorMenu(),
                obtenerValorPostre(),
                obtenerValBebidas()); 
        return cadena;
    }
}
