/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class IdadeCategoria {
    public static void main (String args[]){
        Scanner Categoria = new Scanner(System.in);
        
        int Idade;
        
        String nome;

            System.out.println("Informe seu Nome do Aluno:");
            nome = Categoria.nextLine();
            System.out.println("----------------------------------------");
            System.out.println("Informe a sua Idade:");
            Idade = Categoria.nextInt();
            System.out.println("----------------------------------------");
            System.out.println("           Categoria de Idades          ");
            System.out.println("----------------------------------------");
            System.out.println("             1 - Infantil A             ");
            System.out.println("             5 anos / 7 anos            ");
            System.out.println("             2 - Infantil B             ");
            System.out.println("             8 anos / 10 anos           ");
            System.out.println("             3 - Juvenil A              ");
            System.out.println("             11 anos / 13 anos          ");
            System.out.println("             4 - Juvenil B              ");
            System.out.println("             14 anos / 17 anos          ");
            System.out.println("             5 - Adulto                 ");
            System.out.println("             18 anos                    ");
            System.out.println("----------------------------------------");

            if((Idade <= 5 ) && (Idade <= 7)){
                System.out.println("----------------------------------------");
                System.out.println("O Aluno de nome " + nome);
                System.out.println("----------------------------------------");
                System.out.println("     Foi Classificado na Categoria:     ");
                System.out.println("----------------------------------------");
                System.out.println("               Infantil A               ");
                System.out.println("----------------------------------------");
            } else if((Idade <= 8 ) && (Idade <= 10)){
                System.out.println("----------------------------------------");
                System.out.println("O Aluno de nome " + nome);
                System.out.println("----------------------------------------");
                System.out.println("     Foi Classificado na Categoria:     ");
                System.out.println("----------------------------------------");
                System.out.println("               Infantil B               ");
                System.out.println("----------------------------------------");
            } else if((Idade <= 11 ) && (Idade <= 13)){
                System.out.println("----------------------------------------");
                System.out.println("O Aluno de nome " + nome);
                System.out.println("----------------------------------------");
                System.out.println("     Foi Classificado na Categoria:     ");
                System.out.println("----------------------------------------");
                System.out.println("               Juvenil A                ");
                System.out.println("----------------------------------------");
            } else if((Idade <= 14 ) && (Idade <= 17)){
                System.out.println("----------------------------------------");
                System.out.println("O Aluno de nome " + nome);
                System.out.println("----------------------------------------");
                System.out.println("     Foi Classificado na Categoria:     ");
                System.out.println("----------------------------------------");
                System.out.println("               Juvenil B                ");
                System.out.println("----------------------------------------");
            }else if((Idade <= 14 ) && (Idade <= 17)){
                System.out.println("----------------------------------------");
                System.out.println("O Aluno de nome " + nome);
                System.out.println("----------------------------------------");
                System.out.println("     Foi Classificado na Categoria:     ");
                System.out.println("----------------------------------------");
                System.out.println("               Juvenil B                ");
                System.out.println("----------------------------------------");
                
            }else if(Idade >= 18){
                System.out.println("----------------------------------------");
                System.out.println("O " + nome);
                System.out.println("----------------------------------------");
                System.out.println( "        NÂO é um aluno, Porque         ");
                System.out.println("     Foi Classificado na Categoria:     ");
                System.out.println("----------------------------------------");
                System.out.println("               Adulto                   ");
                System.out.println("----------------------------------------");     
            }    
            
    }
    
}