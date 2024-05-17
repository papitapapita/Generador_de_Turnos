package dataStructures;

public class StackList<E> extends List<E> implements Stack<E>{

    public StackList(){
        super();
    }

    /**
     * Inserta un elemento en la parte de arriba de la pila
     * @param e
     */
    public void push(E e){
        // Crea un nuevo nodo con el elemento especificado y establece su siguiente nodo como el actual nodo de la cabeza
        Node<E> newest = new Node<>(e, getHead());

        // Si la lista estaba vacía, actualiza la cola para que apunte al nuevo nodo
        if(isEmpty())
            setTail(getHead());

        // Incrementa el tamaño de la lista
        size++;
    }

    /**
     * Retorna pero no elimina el elemento más arriba de la pila
     * @return el elemento más arriba de la pila
     */
    public E top(){
        if(isEmpty())
            return null;
        return getHead().getElement();
    }

    /**
     * Remueve y retorna el elemento más arriba de la pila
     * @return el elemento más arriba de la pila
     */
    public E pop(){
        if(isEmpty())
            return null;
        E answer = getTail().getElement();
        Node<E> aux = getHead();
        while(aux.getNext() != getTail())
            aux = aux.getNext();

        setTail(aux);
        size--;

        return answer;
    }

}
