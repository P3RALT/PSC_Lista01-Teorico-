/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.Scanner;
public class Lista_1 {

 
    public static void main(String[] args) {
        System.out.println("Ola! Mundo");
        Scanner Ler = new Scanner(System.in);
        System.out.println("Qual Seu nome? ");
        String nome = Ler.next();
        System.out.println("Bem vindo " + nome);
        System.out.println("Quantos anos vc tem? ");
        int idade = Ler.nextInt(); 
        System.out.println("idade");
        System.out.println("Qual a sua Altura e Peso: ");
        double Altura = Ler.nextDouble();
        double Peso = Ler.nextDouble();
        System.out.println("--- Carteira ---" + "\nNomeCompleto: " + nome + " Idade: " + idade + "\nSua Altura: " + Altura + " Seu Peso: " + Peso);
    }
    
}
