package Exercicioob2;

public class Testeaviao {
			public static void main(String [] args) {
			Aviao aviao1 = new Aviao();
			aviao1.ano = 1948;
			aviao1.marca = "Teco-teco";
			aviao1.modelo = "Airforce";
			aviao1.imprimir();
			aviao1.decolar(20);
			System.out.println("Velocidade da decolagem : " + aviao1.velocidade);
			}
}
