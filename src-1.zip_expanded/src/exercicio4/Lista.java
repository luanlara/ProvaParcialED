package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		
		No aux = new No(dado);
		No auxiliar = inicio;
		if(inicio == null) {
			inicio = aux;
			fim = aux;
		} else if (inicio == fim) {
			if(aux.dado > fim.dado ){ 
				fim.dir = aux;
				aux.esq = fim;
				fim = aux;
			} else { 
				fim.esq = aux;
				aux.dir = fim;
				inicio = aux;
			}
		} else {
			if(aux.dado > fim.dado) {
				fim.dir = aux;
				aux.esq = fim;
				fim = aux;
			} else if (aux.dado < inicio.dado) {
				inicio.esq = aux;
				aux.dir = inicio;
				inicio = aux;
			} else {
				while(auxiliar != null) {
					if (aux.dado <= auxiliar.dir.dado && aux.dado >= auxiliar.dado) {
						aux.esq = auxiliar;
						auxiliar.dir.esq = aux;
						aux.dir = auxiliar.dir;
						auxiliar.dir = aux;
						break;
					}
					auxiliar = auxiliar.dir;
				}
			}
		}
	}
	
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}