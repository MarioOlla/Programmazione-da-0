package it.corso.collezioni.mylist.linked;

public class MyLinkedList<E> {
	private int size;
	private MyLinkedListElement<E> first;
	private MyLinkedListElement<E> last;
	
	public int size() {
		return this.size;
	}
	
	public MyLinkedListElement<E> getFirst(){
		return this.first;
	}
	
	public void add(E element) {
		MyLinkedListElement<E> nuovo = new MyLinkedListElement<E>(element);
		if(first == null) {
			this.first = nuovo;
			this.last = nuovo;
		} else {
			this.last.setNext(nuovo);
			this.last = nuovo;
		}
		this.size++;
	}
	
	public void remove(int index) {
		if(index >= 0 && index < this.size) {
			MyLinkedListElement<E> prev = null;
			MyLinkedListElement<E> current = this.first;
			int i = 0;
			while(i < index ) {
				prev = current;
				current = current.getNext();
				i++;
			}
			if(prev == null) {
				this.first = current.getNext();
			} else {
				prev.setNext(current.getNext());				
			}
			if(current.getNext() == null) {
				this.last = prev;
			} 
			this.size--;
		}
	}
	
	public void stampaContenuto() {
		MyLinkedListElement<E> elem = this.first;
		int i = 0;
		while (elem != null) {
			System.out.println("[" + i + "] : " + elem.getValue());
			elem = elem.getNext();
			i++;
		}
	}
	
	public void clear() {
		this.size = 0;
		this.first = null;
		this.last = null;
	}
	
	public void imposta(int index, E element) {
		if(index >= 0 && index < this.size) {
			MyLinkedListElement<E> elem = this.first;
			for ( int i = 0; i < index; i++) {
				elem = elem.getNext();
			}
			elem.setValue(element);
		}
	}
}
