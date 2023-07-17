import java.util.Scanner;

public class QuartoDesafio {

	private static final int TAMANHO_MINIMO = 2;
	private static final int TAMANHO_MAXIMO = 100;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de casos de teste: ");
		int n = Integer.parseInt(scanner.nextLine());

		String[] frases = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite a frase " + (i + 1) + " para decifrar: ");
			String line = scanner.nextLine();
			frases[i] = line;
		}

		System.out.println("Frases decifradas:");

		for (String frase : frases) {
			if (frase.length() < TAMANHO_MINIMO || frase.length() > TAMANHO_MAXIMO) {
				System.out.println("A frase \"" + frase + "\" deve ter no mínimo " + TAMANHO_MINIMO + " caracteres e no máximo " + TAMANHO_MAXIMO + " caracteres.");
				continue;
			}

			String decipheredLine = decipherLine(frase);
			System.out.println(decipheredLine);
		}

		scanner.close();
	}

	private static String decipherLine(String line) {
		int length = line.length();
		int middle = length / 2;

		StringBuilder decipheredLine = new StringBuilder();

		for (int i = middle - 1; i >= 0; i--) {
			decipheredLine.append(line.charAt(i));
		}

		for (int i = length - 1; i >= middle; i--) {
			decipheredLine.append(line.charAt(i));
		}

		return decipheredLine.toString();
	}

}
