import java.util.Scanner;

public class QuartoDesafio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		imprimir("Digite um valor");
		int valorDigitado = teclado.nextInt();

		String[] frases = new String[valorDigitado];

		for (int i = 0; i < frases.length; i++) {
			imprimir("Insira um texto");
			frases[i] = teclado.next();
			
			if (frases[i].length() < 2 && frases[i].length() >= 100) {
				imprimir("O texto deve ter no minimo 2 caracteres ou o máximo de 100 caracteres.");
				//frases[i] = teclado.nextLine();
			}
			
			StringBuilder parteUm = new StringBuilder(frases[i].substring(0, frases[i].length() / 2));
			StringBuilder parteDois = new StringBuilder(frases[i].substring(frases[i].length() / 2));
			parteUm.reverse();
			parteDois.reverse();
			frases[i] = parteUm.toString() + parteDois.toString();

		}

		imprimir("---------");

		for(String frasesEmbaralhadas: frases) {
			imprimir(frasesEmbaralhadas);
		}
		

		
		teclado.close();
	}

	private static void imprimir(String texto) {
		System.out.println(texto);
	}

}
