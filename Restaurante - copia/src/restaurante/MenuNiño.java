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
    
    public MenuNiño(String n,double vT, double sT,double i, String nom,
            double vI, double Vm,double vH,double vP){
        super( n, vT,sT, i,  nom,vI,Vm);
    }
    
    @Override
    public void establecerNombrePlato(String tipo){
        nombrePlato = tipo;
    }
    @Override
    public void establecerValorMenu(double tipo){
        valorMenu = tipo;
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

    
}
