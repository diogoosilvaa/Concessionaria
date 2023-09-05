package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Veiculo;

public class App {
    public static void main(String[] args) {


        /** Instancia Cliente */

        Cliente objCliente = new Cliente();

        objCliente.CadastrarCliente();


         /** instancia Veiculo */
        Veiculo objVeiculo = new Veiculo();
        objVeiculo.CadastrarVeiculo();


    }
}
