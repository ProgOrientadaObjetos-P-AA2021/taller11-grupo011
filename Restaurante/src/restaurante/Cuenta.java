/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.util.ArrayList;
/**
 *
 * @author usuario
 */
public class Cuenta {
    
    protected String nomCliente;
    
    protected double iva;
    protected double valorTotal;
    protected double subTotal;
    protected ArrayList<Menu> menu = new ArrayList<>();
    
    public Cuenta(String n, ArrayList<Menu> lista,double i,
            double vT, double sT) {
        nomCliente = n;
        menu = lista;
    }
    
    public void establecerArriendos(ArrayList<Menu> lista) {
        menu = lista;
    }
    
    public void establecerNombreCliente(String tipo){
        nomCliente = tipo;
    }
    
    public void establecerIva(double tipo){
        iva = tipo;
    }
    public void establecerValorTotal(double tipo){
        valorTotal = tipo;
    }
    public void establecerSubTotal(double tipo){
        subTotal = tipo;
    }

    public void establecerMenu(ArrayList<Menu> lista) {
        menu = lista;
    }
    
    
    public String obtenerNombreCliente(){
        return nomCliente;
    }
    
    public double obtenerIva(){
        return iva;
    }
    public double obtenerValorTotal(){
        return valorTotal;
    }
    public double obtenerSubTotal(){
        return subTotal;
    }
    public ArrayList<Menu> obtenerMenu() {
        return menu;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Cuenta a pagar: \n"
                + "Nombre: %s\n"
                + "Menú:\n\n", obtenerNombreCliente());

        for (int i = 0; i < obtenerMenu().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerMenu().get(i));
        }
        cadena = String.format("\n%sValor Total a cancelar: %.2f\n"
                + "SubTotal: %.2f\n"
                + "Iva: %2.f\n",
                cadena,
                obtenerValorTotal(),obtenerSubTotal(),obtenerIva());
        return cadena;
    }
  
}
