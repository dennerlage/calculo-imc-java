
package CalculoImc;

public class Imc {
    
    /**
     * 
     * Calcula o IMC
     */
    // e isso
    public double calcular( double peso, double altura){
        double fim = 0;
        fim = peso / (altura * altura);
        return fim;
        
    }
    
}
