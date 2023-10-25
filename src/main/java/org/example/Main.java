package org.example;

import java.util.Scanner;

//[visibilidade:public,private,protected]   [?static]   class [nome:*];
public class Main {
    //[visibilidade:public,private,protected]   [?static] [retorno:<QualquerTipo>] [nome:*]([...argumentos<tipos>]);
    public static void main(String[] args) {
        double peso, imc, altura; //número com vírgula

        Pessoa pessoa = new Pessoa();

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo ao Programa de IMC");

        System.out.print("Nome: ");
        pessoa.setNome(scan.nextLine());

        System.out.print("Idade: ");
        pessoa.setIdade(scan.nextInt());

        System.out.print("Peso: ");
        peso = scan.nextDouble();
        pessoa.setPeso(peso);

        System.out.print("Altura: ");
        altura = scan.nextDouble();
        pessoa.setAltura(altura);

        System.out.println("Executando Cálculos...");

        pessoa.calculaIMC();
        pessoa.setClassificacao(pessoa.classificaIMC());

        System.out.println("Olá, ".concat(pessoa.getNome()).concat("!"));
        System.out.println("Sua altura: ".concat(String.valueOf(pessoa.getAltura())).concat(" metros."));
        System.out.println("Seu peso: ".concat(String.valueOf(pessoa.getPeso())).concat(" quilogramas."));
        System.out.println("Você tem: ".concat(String.valueOf(pessoa.getIdade())).concat(" anos de idade!"));
        System.out.println("Seu IMC é: ".concat(String.valueOf(pessoa.getImc())));
        System.out.println(pessoa.getClassificacao());

    }


}
