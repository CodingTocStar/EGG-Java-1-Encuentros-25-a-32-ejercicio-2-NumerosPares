/*
Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:

 */
package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author MiriamNahuel
 */
public class ParDeNumerosService {
    
    //a) Método mostrarValores que muestra cuáles son los dos números
    //guardados.

    public void CrearParDeNumeros (ParDeNumeros numeros){
        System.out.println("El numero 1 es: " + numeros.getNum1());
        System.out.println("El numero 2 es: " + numeros.getNum2());
    }
    
    //b) Método devolverMayor para retornar cuál de los dos atributos tiene
    //el mayor valor

    public double devolverMayor(ParDeNumeros numeros) {
        if (numeros.getNum1() > numeros.getNum2()) {

            return numeros.getNum1();

        } else if (numeros.getNum1() < numeros.getNum2()) {

            return numeros.getNum2();

        } else {
            
            System.out.println("Son iguales!");
            return 0;
        }
    }
    
    /*c) Método calcularPotencia para calcular la potencia del mayor valor de
    la clase elevado al menor número. Previamente se deben redondear
    ambos valores.*/
    
    public double calcularPotencia(ParDeNumeros numeros){
        long numero1 = Math.round(numeros.getNum1());
        long numero2 = Math.round(numeros.getNum2());
        
        if (numero1 > numero2) {
            
            return Math.pow(numero1, numero2);
            
        } else {
            
            return Math.pow(numero2, numero1);
            
        }
    }
    
    /*d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
    dos valores. Antes de calcular la raíz cuadrada se debe obtener el
    valor absoluto del número.*/
    
    public double calculaRaiz(ParDeNumeros numeros){
        
        double numero1 = Math.abs(numeros.getNum1());
        double numero2 = Math.abs(numeros.getNum2());
        
        if (numero1>numero2) {
            
            return Math.sqrt(numero2);
            
        } else {
        
            return Math.sqrt(numero1);
            
        }
        
    }
    
    //------------------------------------------------------------------------------------------------
}
