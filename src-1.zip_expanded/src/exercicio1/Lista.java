package exercicio1;

public class Lista {
	No inicio, fim;
	
	// insere um n� no final da lista. Esse m�todo ser� chamado pelo m�todo inserir
	private void inserirFim(No aux) {
		if(inicio == null) {
			inicio = aux;
		} else {
			fim.prox = aux;
		}
		fim = aux;
	}

	//esse m�todo dever� ser implementado de acordo com o enunciado do exerc�cio
	private void inserirPrioridade(No aux) {
		
		No auxiliar = inicio;
		No auxiliar2 = null, auxiliar3 = null;
		
		if(aux.cor.equals("amarelo")) {
			if(inicio.cor.equalsIgnoreCase("verde")) {
				aux.prox = inicio;
				inicio = aux;
			} else if (inicio == null) {
				inicio = fim = aux; 
			} else{
				while(auxiliar != null) {
					if(auxiliar.cor.equalsIgnoreCase("verde")) {
						auxiliar2 = auxiliar;
						break;
					}
					auxiliar3 = auxiliar;
					auxiliar = auxiliar.prox;
				}
				auxiliar3.prox = aux;
				aux.prox = auxiliar2;
			}
		}
	}
	
	
	// m�todo inserir. Esse m�todo ser� chamado a partir da classe Main
	public void inserir(int numero, String cor) {
		No aux = new No(numero, cor);
		if(cor.equalsIgnoreCase("verde")) {
			inserirFim(aux);
		} else {
			inserirPrioridade(aux);
		}
	}
	
	// m�todo utilizado para imprimir os dados da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.numero);
			aux = aux.prox;
		}
	}
}
