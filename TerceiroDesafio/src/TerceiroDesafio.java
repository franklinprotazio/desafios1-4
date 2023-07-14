import java.util.Scanner;

public class TerceiroDesafio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Entrada de dados
		imprimir("Digite tamanho da array");
		int numero = teclado.nextInt();

		imprimir("Digite o valor alvo");
		int valorAlvo = teclado.nextInt();

		int[] sequenciaDeNumeros = new int[numero];

		// 
		for (int i = 0; i < sequenciaDeNumeros.length; i++) {
			imprimir("Digite um valor");
			sequenciaDeNumeros[i] = teclado.nextInt();
		}

		int contador = 0;

		for (int u = 0; u < sequenciaDeNumeros.length; u++) {

			for (int j = 0; j < sequenciaDeNumeros.length; j++) {
				if (sequenciaDeNumeros[u] - sequenciaDeNumeros[j] == valorAlvo) {
					contador++;
				}
			}
		}
		imprimir("" + contador);

		teclado.close();
	}

	private static void imprimir(String texto) {
		System.out.println(texto);
	}
}
