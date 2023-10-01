package br.com.fiap.main;
import javax.swing.JOptionPane;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;


public class TesteCliente {

	public static void main(String[] args) {
		
		//Instanciar objeto
		Cliente objetoCliente = new Cliente(); //chamar set e get da classe Cliente
		Endereco objetoEndereco = new Endereco(); //criação do objeto Endereco
		
		//Entrada (input) objetoCliente.set
		objetoCliente.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		objetoCliente.setEmail(JOptionPane.showInputDialog("Digite o email: "));
		objetoCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
		objetoCliente.setValorConsulta(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da consulta:")));
		objetoEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro: "));
		objetoEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")));
		objetoEndereco.setBairro(JOptionPane.showInputDialog("Digite o bairro: "));
		objetoEndereco.setEstado(JOptionPane.showInputDialog("Digite o estado: "));
		
		//Saída (output) sysout
		System.out.println("Nome: " + objetoCliente.getNome() +
				"\nEmail: " + objetoCliente.getEmail() +
				"\nIdade: " + objetoCliente.getIdade() +
				"\nValor da Consulta: " + objetoCliente.getValorConsulta() +
				"\nLogradouro: " + objetoEndereco.getLogradouro() +
				"\nNumero: " + objetoEndereco.getNumero() +
				"\nBairro: " + objetoEndereco.getBairro() +
				"\nEstado " + objetoEndereco.getEstado());
		
		
		
	}

}
