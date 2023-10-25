package org.example;

public class Saude {
    private double imc;
    private String classificacao;

    public Saude() {
    }

    public Saude(double imc) {
        this.imc = imc;
    }

    public double getImc() {
        return imc;
    }

    protected void setImc(double imc) {
        this.imc = imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    protected void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
