package com.company;

public class Emprestimo {

    public static String nomeUsuario = "Tulio Cesar";
    public static int idade = 20;
    public static double valorEmprestimo = 1532.50;
    public static double percentualJurosMes = 12.3;
    public static int mesesParaPagar = 60;

    public static void main(String[] args) {
        imprimir();
        System.out.println("Valor do emprestimo: " + calcularEmprestimo());
    }

    public static void imprimir(){
        System.out.println("Nome do usuario: " + nomeUsuario);
        System.out.println("Idade: " + idade);
        System.out.println("Valor do emprestimo e: " + valorEmprestimo);
        System.out.println("O percentual de juros e: " + percentualJurosMes);
        System.out.println("Quantidade de meses para pagar: " + mesesParaPagar);
    }

    public static double calcularEmprestimo(){
        if (idade >= 18 && idade < 23) {
            valorEmprestimo += (valorEmprestimo / mesesParaPagar) * percentualJurosMes;
        }
        if (idade >= 23 && idade <= 33) {
            valorEmprestimo = (valorEmprestimo * 10) / 100;
        }
        return valorEmprestimo;
    }
}
