package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);
    Cliente refListCliente = new Cliente();
    Funcionario refListFuncionario = new Funcionario();
    Veiculo refListVeiculo = new Veiculo();
    Venda objVenda = new Venda();

    public void menu(){

        boolean continuar = true;

        while(continuar){

            System.out.println("----------------------------");
            System.out.println("----------   Menu  ---------");
            System.out.println("----------------------------");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Cadastar Veiculo");
            System.out.println("3- Cadastar Funcionario");
            System.out.println("4- Realizar Venda");
            System.out.println("5- Listar Veiculos");
            System.out.println("6- Listar Clientes");
            System.out.println("7- Listar Funcionarios");
            System.out.println("8- Pesquisar veiculos");
            System.out.println("9- Sair");
            System.out.println("Escolha uma Opçao: ");
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");

            int escolhaUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (escolhaUsuario){

                case 1:
                    Cliente objCliente = new Cliente();
                    objCliente.cadastrarCliente();
                    refListCliente.adicionarCliente(objCliente);
                    break;

                case 2:
                    Veiculo objVeiculo = new Veiculo();
                    objVeiculo.cadastarVeiculo();
                    refListVeiculo.adicionarVeiculo(objVeiculo);
                    break;

                case 3:
                    Funcionario objFuncionario = new Funcionario();
                    objFuncionario.cadastrarFuncionario();
                    refListFuncionario.adicionarFuncionarios(objFuncionario);
                    break;

                case 4:

//                    boolean validaVenda = objVenda.realizarVenda(objVeiculo, objCliente);
//
//                    if (validaVenda){
//                        objCliente.dinheiroDisponivel -= objVeiculo.preco;
//                        System.out.println("O saldo do cliente é: " + objCliente.dinheiroDisponivel);
//                    }

                    break;

                case 5:
                    refListVeiculo.listarVeiculos();
                    break;

                case 6:
                    refListCliente.listarCliente();
                    break;


                case 7:
                    refListFuncionario.listarFuncionario();
                    break;

                case 8:
                    System.out.println("Informe o modelo do veiculo:  ");
                    String veiculoPesquisado = teclado.nextLine();
                    boolean validaVeiculo = false;

                    if(veiculoPesquisado != null && veiculoPesquisado != "") {
                        validaVeiculo = refListVeiculo.pesquisarVeiculo(veiculoPesquisado);
                    }

                    if (validaVeiculo) {
                        System.out.println("Veiculo Disponivel para Compra !!");
                    }else{
                        System.out.println("Veiculo Indisponivel !!");
                    }
                    break;

                case 9:
                    continuar = false;

                    break;

            }

            if (escolhaUsuario < 1 || escolhaUsuario > 5){
                System.out.println("Escolha uma opção Válida !");
            }

        }



    }

}