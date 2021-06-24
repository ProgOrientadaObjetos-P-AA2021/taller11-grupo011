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
public class MenudelDia extends Restaurante{
    protected String nombrePlato;
    protected double valorMenu;
    protected double valIniMenu;
    protected double valorPostre;
    protected double valorBebida;
    
    public void establecerNombrePlato(String n){
        nombrePlato= n;
    }
    
    public void establecerValorMenu(double n){
        valorMenu=n;
    }
    
    public void establecerValIniMenu(double n){
        valIniMenu=n;
    }
    
    public void establecerValorPostre(double n){
        valorPostre=n;
    }
    
    public void establecerValBebidas(double n){
        valorBebida=n;
    }
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
    public double obtenerValIniMenu(){
        return valIniMenu;
    }
    
    public double obtenerValorPostre(){
        return valorPostre;
    }
    public double obtenerValBebidas(){
        return valorBebida;
    }
}
