import java.math.BigDecimal;
import java.util.Scanner;

public class SegundoDesafio {
	
	// Constantes para os valores fixos
	private static final BigDecimal[] NOTAS = {
			new BigDecimal("100.0"),
			new BigDecimal("50.0"),
			new BigDecimal("20.0"),
			new BigDecimal("10.0"),
			new BigDecimal("5.0"),
			new BigDecimal("2.0")
		};

		private static final BigDecimal[] MOEDAS = {
			new BigDecimal("1.0"),
			new BigDecimal("0.50"),
			new BigDecimal("0.25"),
			new BigDecimal("0.10"),
			new BigDecimal("0.05"),
			new BigDecimal("0.01")
		};

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			// Entrada de valores
			imprimir("Insira o valor: ");
			BigDecimal valor = scanner.nextBigDecimal();
			valor = valor.multiply(new BigDecimal("100")).add(new BigDecimal("0.05"));

			imprimir("NOTAS:");
			calcularQuantidade(valor, NOTAS, "nota");

			imprimir("MOEDAS:");
			calcularQuantidade(valor, MOEDAS, "moeda");

			scanner.close();
		}	

		// Metodo para fazer a separação das celulas e saida de impressão
		private static void calcularQuantidade(BigDecimal valor, BigDecimal[] valores, String tipo) {
			for (BigDecimal valorAtual : valores) {
				int quantidade = valor.divide(valorAtual.multiply(new BigDecimal("100"))).intValue();
				valor = valor.remainder(valorAtual.multiply(new BigDecimal("100")));
				System.out.printf("%d %s(s) de R$ %.2f%n", quantidade, tipo, valorAtual);
			}
		}
		
		private static void imprimir(String texto) {
			System.out.println(texto);
		}

	
}
