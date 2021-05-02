package fila;

import lista.Item;
import lista.No;

public class Fila {
	/*
	 * 1 - Verificar se a fila está vazia
	 * 2 - enqueue (Inserir um elemento no final da fila)
	 * 3 - dequeue (Remover o elemento do início da fila)
	 * 4 - Retornar o tamanho da fila
	 * 5 - Retornar o elemento do início da fila
	 */

	private No head, tail;
	private int nElem;
	/**
	 * 
	 */
	public Fila() {
		this.nElem = 0;
	}
	/*
	 * 1 - Verificar se a fila está vazia
	 */
	public boolean eVazia() {
		if (this.nElem==0) {
			return true;
		}else {
			return false;
		}
	}
	/*
	 * Retornar o tamanho da fila
	 */
	public int tamanho() {
		return this.nElem;
	}
	
	/*
	 * Retornar o elemento do início da fila
	 */
	public No head () {
		return this.head;
	}
	
	/*
	 * enqueue (Inserir um elemento no final da fila)
	 */
	public void enqueue (Item info) {
		No novoNo = new No(info);
		if (this.eVazia()) {
			this.head = novoNo;
		}else {
			this.tail.setProx(novoNo);
		}
		this.tail = novoNo;
		this.nElem++;
		
	}
	/*
	 * dequeue (Remover o elemento do início da fila)
	 */
	public No dequeue () {
		No aux = this.head;
		if (this.eVazia()) {
			return null;
		}else {
			if (this.nElem==1) {
				this.tail = null;
			}
			this.head = this.head.getProx();
			this.nElem--;
			return aux;
		}
	}
	
}
