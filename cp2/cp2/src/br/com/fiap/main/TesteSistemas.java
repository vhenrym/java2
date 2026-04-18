package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteSistemas {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        //String nome, String cpf, int idade, double altura
        Cliente objCliente = new Cliente(
                texto("Informações do Cliente  Nome"),
                texto("CPF"),
                inteiro("Idade"),
                real("Altura")
        );

        //String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String estado
        Endereco objEndCliente = new Endereco(
                texto("Endereço do Cliente  Logradouro"),
                inteiro("Número"),
                texto("Complemento"),
                texto("CEP"),
                texto("Bairro"),
                texto("Cidade"),
                texto("Estado")
        );

        objCliente.setEndereco(objEndCliente);

        //int codigo, String tipo, String marca, double preco
        Produto objProduto = new Produto(
                inteiro("Produto do Cliente  Código"),
                texto("Tipo do Produto"),
                texto("Marca do Produto"),
                real("Preço")
        );

        System.out.println(
                objCliente + "" + objProduto
        );

    }
}
