package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {
    /** Declarar Variaveis **/


    String nome, email, endereco;

    long telefone, cpf, rg;


    /** Instancia o scanner **/

    Scanner teclado = new Scanner(System.in);

    public void CadastrarCliente(){
        System.out.println("------Cadastro Cliente -------");
        System.out.println("Qual e o nome do cliente: ");
        nome = teclado.nextLine();
        System.out.println("Informe seu CPF: ");
        cpf = teclado.nextLong();
        System.out.println("Informe o RG: ");
        rg = teclado.nextLong();
        System.out.println("informe o telefone: ");
        telefone = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Informe o seu email: ");
        email = teclado.nextLine();
        System.out.println("informe o endereco: ");
        endereco = teclado.nextLine();
        System.out.println("-------Cadastro Finalizado--------");
        System.out.println("-----------------------------------");

        teclado.close();


    }
}
