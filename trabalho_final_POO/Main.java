import aplicacao.ACMERobots ;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ACMERobots acmerobots = new ACMERobots();
		acmerobots.executar();
		Scanner input = new Scanner(System.in);
		System.out.println("Gravando em arquivo texto...");
		acmerobots.gravaLinhasTexto();
		System.out.print("Digite algo para continuar: ");
		String str = input.nextLine();
		System.out.println("Lendo do arquivo texto...");
		acmerobots.leLinhasTexto();
		input.close();

	}

}

//Nomes: Jully Anne, Gabriel Kowa, Rafael Spumberg
