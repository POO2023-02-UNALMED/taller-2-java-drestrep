package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;
    
    public int cantidadAsientos(){
        int c = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                c++;
            }
        }
        return c;
    }
    public String verificarIntegridad(){
        for (Asiento asiento : asientos) {
            if (asiento != null && this.registro != asiento.registro) {
                return("Las piezas no son originales");
            }
        }
        if (this.registro != motor.registro){
            return("Las piezas no son originales");
        }else{
            return("Auto original");
        }
    }
    
    
}
