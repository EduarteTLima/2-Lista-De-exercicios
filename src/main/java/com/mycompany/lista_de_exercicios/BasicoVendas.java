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
public class BasicoVendas {
    public static void main(String args[]){
        Scanner Vendas = new Scanner(System.in);
        
        int Produto, Compra, Quantidade;
        float Pro1 = (float) 125.00;
        float Pro2 = (float) 50.00;
        float Pro3 = (float) 150.00;
        float Pro4 = (float) 200.00;
        
        System.out.println("----------------------------------------");
        System.out.println("                 TekFor                 ");
        System.out.println("----------------------------------------");       
        System.out.println("           Lista de Produtos            ");
        System.out.println("----------------------------------------");
        System.out.println("        1 - Perifericos                 ");
        System.out.println("        2 - Formatação                  ");
        System.out.println("        3 - Manutenção                  ");
        System.out.println("        4 - Peças Para Computador       ");
        System.out.println("----------------------------------------");
        
        System.out.println("   Dijite o Cod do Produto Desejado:    ");
        System.out.println("----------------------------------------");
        
        Produto = Vendas.nextInt();
        
        if (Produto == 1){
            System.out.println("----------------------------------------");
            System.out.println("              Perifericos               ");
            System.out.println("----------------------------------------");       
            System.out.println("   Digite a Quantidade de Perifericos:   ");
            Quantidade = (int) Vendas.nextFloat();
            Compra = (int) (Pro1 * Quantidade);
            System.out.println("----------------------------------------");
            System.out.println("Seu Pedido Consiste em");
            System.out.println(" " + Quantidade + "de Perifericos");
            System.out.println("No volar em R$" + Compra);
            System.out.println("----------------------------------------");
        
        }else if (Produto == 2){
            System.out.println("----------------------------------------");
            System.out.println("              Formatação                ");
            System.out.println("----------------------------------------");       
            System.out.println("         Digite a Quantidade de         ");
            System.out.println("    Aparelhos que serao Formatados:     ");
            Quantidade = (int) Vendas.nextFloat();
            Compra = (int) (Pro2 * Quantidade);
            System.out.println("----------------------------------------");
            System.out.println("Seu Pedido Consiste em");
            System.out.println(" " + Quantidade + "de Formatação");
            System.out.println("No volar em R$" + Compra);
            System.out.println("----------------------------------------");
        
        }else if (Produto == 3){
            System.out.println("----------------------------------------");
            System.out.println("              Manutenção                ");
            System.out.println("----------------------------------------");       
            System.out.println("         Digite a Quantidade de         ");
            System.out.println("       Aparelhos para a Manutenção:     ");
            Quantidade = (int) Vendas.nextFloat();
            Compra = (int) (Pro3 * Quantidade);
            System.out.println("----------------------------------------");
            System.out.println("Seu Pedido Consiste em");
            System.out.println(" " + Quantidade + "de Manutenção");
            System.out.println("No volar em R$" + Compra);
            System.out.println("----------------------------------------");
        
        }else if (Produto == 4){
            System.out.println("----------------------------------------");
            System.out.println("          Pecas de Computador           ");
            System.out.println("----------------------------------------");       
            System.out.println("      Digite a contidade de Peças:      ");
            Quantidade = (int) Vendas.nextFloat();
            Compra = (int) (Pro4 * Quantidade);
            System.out.println("----------------------------------------");
            System.out.println("Seu Pedido Consiste em");
            System.out.println(" " + Quantidade + " de Pecas de Computador");
            System.out.println("No volar em R$" + Compra);
            System.out.println("----------------------------------------");
        
        }else{
            System.out.println("----------------------------------------");
            System.out.println("           Desculpa mais não            ");
            System.out.println("         Oferesemos esse Serviço        ");
            System.out.println("----------------------------------------");       
        
        }
        
    }

}
