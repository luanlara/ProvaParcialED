package exercicio2;

public class Fila {

	No inicio, fim;
	
	// m�todo para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista) {
		No aux = new No(motorista);
		if(inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}
	
	// m�todo para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		No auxiliar = inicio;
		
		if(inicio == null) {
			System.out.println("N�o h� nenhum elemento para ser removido.");
		} else {
			inicio = auxiliar.dir;	
			inicio.esq = null;	
			auxiliar.dir = null;
		}
	}
	
	// m�todo para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		No auxiliar = inicio;
		while(auxiliar != null) {
			System.out.println("{nome: " + auxiliar.motorista.getNome() + " | placa: " + auxiliar.motorista.getPlaca() + "}");
			auxiliar = auxiliar.dir;
		}
	}
}
