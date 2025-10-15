package it.corso.collezioni.mylist.linked;

public class MyLinkedListElement <E>{
	
	private E value;
	private MyLinkedListElement<E> next;

	public MyLinkedListElement(E element) {
		this.value = element;
	}
	

	public E getValue() {
		return value;
	}



	public void setValue(E value) {
		this.value = value;
	}



	public MyLinkedListElement<E> getNext() {
		return next;
	}



	public void setNext(MyLinkedListElement<E> nuovo) {
		this.next = nuovo;
	}


	public boolean hasNext() {
		return this.next != null;
	}
	
	

}
