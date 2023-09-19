package br.senai.sp.jandira.model;

public class Venda {

    public boolean realizarVenda(Veiculo objVeiculo, Cliente objCliente){

        if(objCliente.dinheiroDisponivel >= objVeiculo.preco) {

            System.out.println("-------Parabens---------");
            System.out.println("Ola " + objCliente.nome);
            System.out.println("Voce acaba de adquirir um " + objVeiculo.modelo);
            System.out.println("No precinho de " + objVeiculo.preco);
            System.out.println("-----------------------------");

            return true;

        } else{

            System.out.println("Escolha um veiculo mais compativel com sua realidade!!");

            return false;

        }

    }
}
