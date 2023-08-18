package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Motor {
    public int numeroCilindros;
    public String tipo;
    public int registro;
    
    public void cambiarRegistro(int reg){
        this.registro = reg;
    }
    
    public void asignarTipo(String tip){
        if (tip == "electrico" || tip == "gasolina"){
            this.tipo = tip;
        }
    }
}
