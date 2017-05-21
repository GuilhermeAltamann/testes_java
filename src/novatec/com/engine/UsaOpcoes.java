package novatec.com.engine;

public class UsaOpcoes {

	public enum Opcoes {

		COMPACTAR("Compactacao", 0), // regra (i)
		DESCOMPACTAR("Descompactacao", 1);

		private final String nome; // regra (ii)
		private final int valor;

		Opcoes(String n, int v) { // regra (iii)
			nome = n;
			valor = v;
		}

		public int getValor() {
			return this.valor;
		}

		public String getNome() {
			return this.nome;
		}

		public String toString() {
			return nome + "(" + this.valor + ")";
		}
	}

	public static void main(String[] args) {

		for (Opcoes constante : Opcoes.values()) {

			System.out.printf("%-25s #%02d: %-20s\n", constante, constante.getValor(), constante.getNome());

			switch (constante) {

			case COMPACTAR:
				System.out.println("Opção de compactação");
				break;
			case DESCOMPACTAR:
				System.out.println("Opção de descompactação");
				break;
			}
		}
	}
}
