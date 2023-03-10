/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class Calculadora {

    public static void main(String[] args) {

        //Se crea el objeto calculador de la clase calcularora, por medio de la palablra reservada "new" se llama al constructor de la clase
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
        //Cree nuevas variables para hacer la impresion de cada resultado mediante el llamado del mismo metodo varias veces (modularidad)
        int suma, resta, multi, divi;
        //Se asignan valores a los atributos de la clase
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2"));
        suma = calculadora.calcularSuma(calculadora.setNumero1(num1), calculadora.setNumero2(num2));
        resta = calculadora.calcularResta(num1, num2);
        multi = calculadora.calcularMultiplicacion(num1, num2);
        divi = calculadora.calcularDivision(num1, num2);
        //Hago el llamado del mismo metodo varias veces para la impresion (MODULARIDAD)
        calculadora.imprimir("Suma: ",suma);
        calculadora.imprimir("Resta: ",resta);
        calculadora.imprimir("Multiplicacion: ", multi);
        calculadora.imprimir("Division: ", divi);
         /*
        //Se ejecutan las operaciones
        //Suma
        JOptionPane.showMessageDialog(null, "Suma: " + calculadora.calcularSuma());
        //Resta
        JOptionPane.showMessageDialog(null, "Resta: " + calculadora.calcularResta());
        //Multiplicacion
        JOptionPane.showMessageDialog(null, "Multiplicación: " + calculadora.calcularMultiplicacion());
        //División
        JOptionPane.showMessageDialog(null, "División: " + calculadora.calcularDivision());
        */
         
         

    }
}
