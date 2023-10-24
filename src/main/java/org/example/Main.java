package org.example;

import java.util.Scanner;

//[visibilidade:public,private,protected]   [?static]   class [nome:*];
public class Main {
    //[visibilidade:public,private,protected]   [?static] [retorno:<QualquerTipo>] [nome:*]([...argumentos<tipos>]);
    public static void main(String[] args) {
        String nome; //Texto
        double peso, imc, altura; //número com vírgula
        int idade; //número sem vírgula: 1

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo ao Programa de IMC");

        System.out.print("Nome: ");
        nome = scan.nextLine();

        System.out.print("Idade: ");
        idade = scan.nextInt();

        System.out.print("Peso: ");
        peso = scan.nextDouble();

        System.out.print("Altura: ");
        altura = scan.nextDouble();

        System.out.println("Executando Cálculos...");

        imc = peso / Math.pow(altura, 2);

        System.out.println("Olá, ".concat(nome).concat("!"));
        System.out.println("Você tem: ".concat(String.valueOf(idade)).concat(" anos de idade!"));
        System.out.println("Seu IMC é: ".concat(String.valueOf(imc)));
        System.out.println(classificaIMC(imc));

    }

    public static String classificaIMC(double imc) {
        if (imc < 16) {
            return "Magreza grau III - Se bater vento voa...";
        }

        if (imc >= 16 && imc < 17) {
            return "Magreza grau II - Vai comer!";
        }

        if (imc >= 17 && imc < 18.5) {
            return "Magreza grau I - Faltou feijão aí?";
        }

        if (imc >= 18.5 && imc < 25) {
            return "Peso ideal - Parabéns";
        }

        if (imc >= 25 && imc < 30) {
            return "Sobrepeso - Cuidado, vai engordar.";
        }

        if (imc >= 30 && imc < 36) {
            return "Obesidade grau I - Está ficando perigoso.";
        }

        if (imc >= 35 && imc < 40.1) {
            return "Obesidade grau II - Vai fazer uma dieta.";
        }

        return "Obesidade grau III - Parabéns, alcançou a Thais Carla";
    }
}