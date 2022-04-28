package exercicio2;

public class Fila {

	No inicio, fim;
	
	// método para inserir um elemento no final da fila (enfileirar)
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
	
	// método para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		No auxiliar = inicio;
		inicio = auxiliar.dir;	
		inicio.esq = null;	
		auxiliar.dir = null;
	}
	
	// método para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		No auxiliar = inicio;
		while(auxiliar != null) {
			System.out.println(auxiliar.motorista.getNome());
			auxiliar = auxiliar.dir;
		}
	}
}
