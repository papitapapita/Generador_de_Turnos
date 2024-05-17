package dataStructures;

/**
 * Clase que representa un nodo en una lista enlazada.
 * @param <E> El tipo de elemento almacenado en el nodo.
 */
public class Node<E> {
    private E element;
    private Node<E> next;

    /**
     * Constructor de la clase Node.
     * @param element El elemento que se almacenará en el nodo.
     * @param next    El siguiente nodo en la lista.
     */
    public Node(E element, Node<E> next){
        this.element = element;
        this.next = next;
    }

    /**
     * Obtiene el elemento almacenado en el nodo.
     * @return El elemento almacenado en el nodo.
     */
    public E getElement(){
        return element;
    }

    /**
     * Obtiene el siguiente nodo en la lista.
     * @return El siguiente nodo en la lista.
     */
    public Node<E> getNext(){
        return next;
    }

    /**
     * Establece el siguiente nodo en la lista.
     * @param next El siguiente nodo en la lista.
     */
    public void setNext(Node<E> next){
        this.next = next;
    }

    /**
     * Establece el elemento almacenado en el nodo.
     * @param element El elemento que se almacenará en el nodo.
     */
    public void setElement(E element){
        this.element = element;
    }
}
