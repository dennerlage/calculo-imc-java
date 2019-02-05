
package CalculoImc;

import java.text.DecimalFormat;

public class Imc {
    
    public double calcular( double peso, double altura){
        double fim = 0;
        fim = peso / (altura * altura);
        return fim;
        
    }
    
}
