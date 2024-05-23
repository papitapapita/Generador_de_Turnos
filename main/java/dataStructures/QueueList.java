package dataStructures;

/**
 * Clase que implementa una lista dinámica de tipo cola
 * @param <E> El tipo de elemento que se almacenará en la lista
 */
public class QueueList<E> extends List<E> implements Queue<E>{
    public QueueList(){
        super();
    }

    /**
     * Inserta un elemento en la parte de atrás de la cola
     * @param e el elemento a insertar
     */
    public void enqueue(E e){
        // Crea un nuevo nodo con el elemento especificado y establece su siguiente nodo como nulo
        Node<E> newest = new Node<>(e, null);

        if (isEmpty())
            setHead(newest);
        else
            // Si la lista no está vacía, establece el siguiente nodo del nodo de la cola como el nuevo nodo
            getTail().setNext(newest);

        // Actualiza la cola para que apunte al nuevo nodo
        setTail(newest);

        // Incrementa el tamaño de la lista
        size++;
    }

    /**
     * Retorna pero no elimina el primer elemento de la cola
     * @return Retorna el primer elemento de la cola
     */
    public E first(){
        if(isEmpty())
            return null;
        return getHead().getElement();
    }

    /**
     * Remueve y retorna el primer elemento de la cola (retorna null si está vacío)
     * @return Retorna el primer elemento de la cola
     */
    public E dequeue(){
        if(isEmpty())
            return null;

        // Obtener el elemento del nodo de la cabeza
        E element = getHead().getElement();
        // Mover la cabeza al siguiente nodo
        setHead(getHead().getNext());

        // Si la nueva cabeza es null, la cola está vacía, por lo que también se debe
        // poner la cola en null
        if(getHead() == null)
            setTail(null);

        // Disminuir el tamaño de la cola
        size--;

        return element;
    }
}
