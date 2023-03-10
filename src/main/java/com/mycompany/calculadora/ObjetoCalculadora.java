/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class ObjetoCalculadora {
   
    //Se declaran los atributos de este objeto y se les da la visibilidad de publico a todos
    private int numero1;
    private int numero2;
    
    //Se crea el constructor de la clase, y se le asignan los atributos al constructor por medio de herencia
    public ObjetoCalculadora() {
        super();
    }

    public ObjetoCalculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int getNumero1() {
        return numero1;
    }

    public int setNumero1(int numero1) {
        if(numero1 > 0){
            this.numero1 = numero1;
        }else{
            JOptionPane.showMessageDialog(null, "El primer numero ingresado no puede ser 0", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return this.numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int setNumero2(int numero2) {
        if(numero2 > 0){
            this.numero2 = numero2;
        }else{
            JOptionPane.showMessageDialog(null, "El segundo numero ingresado no puede ser 0", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return this.numero2;
    }
    
    //Se realizan los metodos u operaciones que va a accionar la calculadora
    public int calcularSuma(int nume1, int nume2) {
        this.numero1 = nume1;
        this.numero2 = nume2;
        return this.numero1 + this.numero2;
        
    }

    public int calcularResta(int nume1, int nume2) {
        this.numero1 = nume1;
        this.numero2 = nume2;
        return this.numero1 - this.numero2;
    }

    public int calcularMultiplicacion(int nume1, int nume2) {
        this.numero1 = nume1;
        this.numero2 = nume2;
        return this.numero1 * this.numero2;
    }

    public int calcularDivision(int nume1, int nume2) {
        this.numero1 = nume1;
        this.numero2 = nume2;
        if (this.numero2 != 0);
        return this.numero1 / this.numero2;
    }

    public void imprimir(String operacion, int dato){
        JOptionPane.showMessageDialog(null,operacion + dato);
    }
    
}
