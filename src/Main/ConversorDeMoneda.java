/*
 Realizar la clase java Conversor de Moneda que permite por el
momento, realizar las cuatro operaciones convertir una moneda en
otra (1000$ * 1200 U$S), calcular cotización (si me dan 1620U$S por
$1800000, a cuanto cotiza?), aumentar saldos (en mi cuenta tengo
U$S500, actualizo lo comprado), si luego retiro dólar físico como
queda (es decir, extraigo en billetes de U$S 100, los U$S2100 que tengo)
 */
package Main;


public class ConversorDeMoneda {

    public ConversorDeMoneda() {
    }
    
    
    
    public double convertirDolares(double dolares){
        return dolares * 1000;
    }
    
    public double convertirPesos(double pesos){
        return pesos * 0.001;
    }
    
    public double calcularCotizacion(double pesos, double dolares){
         if (dolares == 0.0) {
        throw new ArithmeticException("División por cero");
    }
        return pesos / dolares;
    }
    
    public double aumentarSaldo(double saldo, double dolares){
        return saldo + dolares;
    }
    
    public int cantBilletesExtraidos(double montoExtraer, int denominacion){
        return (int) (montoExtraer / denominacion);
    }
    
    
}
