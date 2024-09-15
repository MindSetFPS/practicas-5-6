package com.example.app;

import java.util.ArrayList;
import java.util.List;

public class CoinCounter {
    /*
     * Indique el número de monedas de cada cantidad que deben de devolverse como
     * parte de una operación comercial de tal forma que se devuelvan el
     * mínimo número de piezas (monedas) posibles. Las denominaciones de monedas con
     * las que se cuenta son las siguientes.
     * ▪ 100 pesos
     * ▪ 50 pesos
     * ▪ 20 pesos
     * ▪ 10 pesos
     * ▪ 5 pesos
     * ▪ 1 peso
     * ▪ 50 centavos
     * ▪ 20 centavos
     * ▪ 1 centavo
     * 
     * Por ejemplo, si se ingresa la cantidad de 73.26 pesos y se paga con 100 pesos
     * el sistema debe devolver que el
     * vuelto o cambio es de 26.74 y debe de entregarse de la siguiente manera que
     * cumple que se utiliza el mínimo
     * número de monedas posible:
     * ▪ 0 monedas de 100 pesos
     * ▪ 0 monedas de 50 pesos
     * ▪ 1 moneda de 20 pesos
     * ▪ 0 monedas de 10 pesos
     * ▪ 1 moneda de 5 pesos
     * ▪ 1 moneda de 1 peso
     * ▪ 1 moneda de 50 centavos
     */

    public double calculate(double paid, List<Double> numList) {
        List<Double> denominations = new ArrayList<>(numList);

        if(denominations.size() == 0){
            return 0.0;
        }
        
        if(paid != 0){
            if(paid >= denominations.get(0)){
                System.out.println("1 moneda de " + denominations.get(0));
                paid = paid - denominations.get(0); 
            }
            
            if(paid > 0){
                if(paid < denominations.get(0)) denominations.remove(0);
                calculate(paid, denominations);
            } else {
                return paid;
            }
            
            return paid;
        } else {
            System.out.println("terminar");
            return paid;
        } 

    }
}