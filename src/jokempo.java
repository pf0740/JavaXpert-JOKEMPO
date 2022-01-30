import java.util.Random;
import java.util.Scanner;

public class jokempo {

	public static void main(String[] args) {
		// Variáveis
		
		int escolhaJogador;
		int escolhaComputador;
		
		// Apresentando a tela
		
		System.out.println("----------------------------\r\n"
				+ "      J O K E N P O\r\n"
				+ "----------------------------\r\n"
				+ "1 - Pedra\r\n"
				+ "2 - Papel\r\n"
				+ "3 - Tesoura\r\n"
				+ "----------------------------\r\n"
				+ "Escolha sua opção: ");
		
		// Lendo a opção do usuário
		
		Scanner leitor = new Scanner(System.in);
		escolhaJogador = leitor.nextInt();
		leitor.close();
		if (escolhaJogador == 1) {
			System.out.println("1 - PEDRA");
		} else if (escolhaJogador == 2) {
			System.out.println("2 - PAPEL");
		} else if (escolhaJogador == 3) {
			System.out.println("3 - TESOURA");
		}
		
		// escolha do computador
		
		System.out.println("O Computador escolheu: ");
		Random random= new Random();
		escolhaComputador = random.nextInt(3) + 1;
		
		if (escolhaComputador == 1) {
			System.out.println("1 - PEDRA");
		} else if (escolhaComputador == 2) {
			System.out.println("2 - PAPEL");
		} else if (escolhaComputador == 3) {
			System.out.println("3 - TESOURA");
		}
		
		if (escolhaJogador == 1 && escolhaComputador == 1 || escolhaJogador == 2 && escolhaComputador == 2 || escolhaJogador == 3 && escolhaComputador == 3) {
			System.out.println("Deu empate!");
		} else if (escolhaJogador == 1 && escolhaComputador == 2 || escolhaJogador == 2 && escolhaComputador == 3 || escolhaJogador == 3 && escolhaComputador == 1) {
			System.out.println("O Computador ganhou essa!");
		} else if (escolhaJogador == 2 && escolhaComputador == 1 || escolhaJogador == 3 && escolhaComputador == 2 || escolhaJogador == 1 && escolhaComputador == 3) {
			System.out.println("Você ganhou! Parabéns!");
		}
	}

}
