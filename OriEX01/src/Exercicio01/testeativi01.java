package Exercicio01;

public class testeativi01 {
	
        public static void main(String[] args) {
            Orienta01 objetoCliente = new Orienta01(); 
            objetoCliente.nome = "Alecsander";
            objetoCliente.endereço = "Vila Izabel";
            objetoCliente.cidade = "Guarulhos";
            objetoCliente.cpf = "12345678910";
            objetoCliente.idade = 25;

            objetoCliente.imprimirInfo();

            objetoCliente.alterar();
            objetoCliente.imprimirInfo();
        }
}

