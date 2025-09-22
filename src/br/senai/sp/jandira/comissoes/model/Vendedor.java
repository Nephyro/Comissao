package br.senai.sp.jandira.comissoes.model;

import java.util.Scanner;

public class Vendedor {
    String nomeVendedor;
    double totalDeVendas;
    double percetualDaComissao;
    double valorDaComissaoEmReais;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("** CALCULADORA DE COMISSÕES **");
        System.out.println("-----------------------------------");

        // Obtendo o nome do vendedor
        System.out.print("Qual o nome do vendedor?: ");
        nomeVendedor = leitor.nextLine();


        // Obtendo o total de vendas do vendedor
        System.out.print("Qual o total de vendas do(a) vendedor(a) " + nomeVendedor + "?: ");
        totalDeVendas = leitor.nextDouble();

        calcularComissao();
    }

    public void calcularComissao(){
        if (totalDeVendas < 20000){
          percetualDaComissao = 5;
        } else {
         percetualDaComissao = 10;
        }

        valorDaComissaoEmReais = (totalDeVendas * percetualDaComissao / 100);

        exibirResultados();
    }

    public void exibirResultados() {
        System.out.println("------------------------------------");
        System.out.println("** R E S U L T A D O S **");
        System.out.println("------------------------------------");
        System.out.println("VENDEDOR(A): " + nomeVendedor);
        System.out.println("TOTAL DE VENDAS: R$" + totalDeVendas);
        System.out.println("PERCENTUAL DA COMISSÃO: " + percetualDaComissao + "%");
        System.out.println("VALOR DA COMISSÃO PAGA: R$" + valorDaComissaoEmReais);
        System.out.println("------------------------------------");

        continuidade();

    }

    public void continuidade() {

        double retornar;
        Scanner leitor = new Scanner(System.in);
        System.out.println("  ");
        System.out.println("---------------------------------------");
        System.out.println("Calcular a comissão de outro vendedor?");
        System.out.print("Digite 1 para sim e 0 para sair: ");
        retornar = leitor.nextDouble();
        System.out.println("---------------------------------------");
        System.out.println("  ");

        if (retornar == 1) {
            obterDados();
        } else {
            System.out.println("Bye!");
        }
    }
}
