package Exercicio01;
import java.util.Scanner;
public class Orienta01 {

		    String nome;
		    String endereço;
		    String cidade;
		    String cpf;
		    int idade;

		    
		    void imprimirInfo () {
		        System.out.println("Cliente: " + nome);
		        System.out.println("Endereço do cliente: " + endereço);
		        System.out.println("Nome da Cidade: " + cidade);
		        System.out.println("Seu CPF: " + cpf);
		        System.out.println("Sua Idade: " + idade);
		    }

		    void alterar() {
		        Scanner leia = new Scanner(System.in);
		        System.out.println("Alterar o nome: ");
		        nome = leia.next();
		    }

		
	}


