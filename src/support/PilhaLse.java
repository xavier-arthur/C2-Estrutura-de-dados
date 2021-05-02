package pilha;

import lista.Item;
import lista.No;

public class PilhaLse {
	private No prim;
	private int nElem;
	/**
	 * 
	 */
	public PilhaLse() {
		this.nElem = 0;
	}
	/*
	 * 1 - Verificar se a pilha está vazia 
	 */
	public boolean eVazia() {
		return (this.nElem==0);
	}

	/*
	 * Retornar o tamanho da pilha
	 */
	public int tamanho () {
		return this.nElem;
	}

	/* 
	 * Retorna o elemento do topo da pilha
	 */
	public No topo () {
		return this.prim;
	}
	
	/*
	 * Empilhar (Inserir um elemento no topo da pilha)
	 */
	public void push (Item info) {
		No novoNo = new No(info);
		novoNo.setProx(prim);
		prim = novoNo;
		this.nElem++;
	}

	/* 
	 * Desempilhar (Remover o elemento do topo da pilha)
	 */
	public No pop () {
		No aux = prim;
		if (!eVazia()) {
			prim = prim.getProx();
			this.nElem--;
		}
		return aux;
	}

	
	

}
