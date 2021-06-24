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
public class MenualaCarta extends Restaurante{
    protected String nombrePlato;
    protected double valorMenu;
    protected double valIniMenu;
    protected double valorGuarnicion;
    protected double valorBebida;
    protected double valorAdicion;
    
    public void establecerNombrePlato(String n){
        nombrePlato= n;
    }
    
    public void establecerValorMenu(double n){
        valorMenu=n;
    }
    
    public void establecerValIniMenu(double n){
        valIniMenu=n;
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
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
    public double obtenerValIniMenu(){
        return valIniMenu;
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
}
