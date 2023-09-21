/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Percentual {

    public static void main(String[] args) {
        Scanner Percentual = new Scanner(System.in);
        
        int num1, percentual, resultado;
        
        System.out.println("----------------------------------------");
        System.out.println("Calculadora de Percentual");
        System.out.println("----------------------------------------");
        System.out.println("Informe o numero desejado");
        num1 = Percentual.nextInt();
        System.out.println("----------------------------------------");
        System.out.println("Informe o numero Percentual");
        percentual = Percentual.nextInt();
        System.out.println("----------------------------------------");
        System.out.println("Percentual Total: 100%");
        System.out.println("----------------------------------------");
        
        resultado = (num1 * percentual)/100;
        
        System.out.println("----------------------------------------");
        System.out.println("o pernsentual de " + num1 + " e " + percentual + " é: " + resultado);
        System.out.println("----------------------------------------");
        
    }
}
