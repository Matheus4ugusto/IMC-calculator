package org.example;

public class Pessoa extends Saude {
    //[visibilidade: public, protected, private] [tipo:<QualquerTipo>] [nome]
    private String nome;
    private int idade;
    private double altura, peso;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        super(0.0);
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (this.nome == null) {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void calculaIMC() {
        this.setImc(this.peso / Math.pow(this.altura, 2));
    }

    public String classificaIMC() {
        if (this.getImc() < 16) {
            return "Magreza grau III - Se bater vento voa...";
        }

        if (this.getImc() >= 16 && this.getImc() < 17) {
            return "Magreza grau II - Vai comer!";
        }

        if (this.getImc() >= 17 && this.getImc() < 18.5) {
            return "Magreza grau I - Faltou feijão aí?";
        }

        if (this.getImc() >= 18.5 && this.getImc() < 25) {
            return "Peso ideal - Parabéns";
        }

        if (this.getImc() >= 25 && this.getImc() < 30) {
            return "Sobrepeso - Cuidado, vai engordar.";
        }

        if (this.getImc() >= 30 && this.getImc() < 36) {
            return "Obesidade grau I - Está ficando perigoso.";
        }

        if (this.getImc() >= 35 && this.getImc() < 40.1) {
            return "Obesidade grau II - Vai fazer uma dieta.";
        }

        return "Obesidade grau III - Parabéns, alcançou a Thais Carla";
    }
}