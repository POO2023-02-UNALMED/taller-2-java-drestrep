package test;

import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Asiento {
    public String color;
    public int precio;
    public int registro;
    String[] l = {"rojo", "verde", "amarillo", "negro", "blanco"};
    List lcolor = Arrays.asList(l);
    
    public void cambiarColor(String x){
        if (lcolor.contains(x)){
            this.color = x;
        }
    }
}
