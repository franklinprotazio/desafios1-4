import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		List<Integer> listaPares = new ArrayList<>();
		List<Integer> listaImpares = new ArrayList<>();

		// Entrada dos números
		System.out.println("Entrada:");

		for (int i = 0; i < 10; i++) {

			int numeroDigitado = teclado.nextInt();
			if (numeroDigitado % 2 == 0) {
				listaPares.add(numeroDigitado);
			} else {
				listaImpares.add(numeroDigitado);
			}
		}

		// Ordenação dos números
		Collections.sort(listaPares);
		Collections.sort(listaImpares, Collections.reverseOrder());

		// Saída dos números
		System.out.println("Saída:");

		imprimirLista(listaPares);
		imprimirLista(listaImpares);

		teclado.close();
	}

	//Método para impressão da lista
	private static void imprimirLista(List<Integer> lista) {
		for (int numero : lista) {
			System.out.println(numero);
		}

	}

}
