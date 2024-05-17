package dataStructures;

public class List<E> {
    private Node<E> head = null; // La cabecera de la lista
    private Node<E> tail = null; // La cola de la lista
    protected int size = 0; // El tamaño de la lista

    /**
     * Constructor predeterminado de la clase SinglyLinkedList.
     * Crea una lista enlazada vacía.
     */
    public List(){}

    /**
     * Devuelve el número de elementos en la lista enlazada.
     *
     * @return El número de elementos en la lista enlazada.
     */
    public int size() {
        return  size;
    }

    /**
     * Verifica si la lista enlazada está vacía.
     *
     * @return true si la lista enlazada está vacía, false de lo contrario.
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * Devuelve el elemento en la posición especificada en la lista enlazada.
     * @param index El índice del elemento que se desea obtener.
     * @return El elemento en la posición especificada, o null si la lista está vacía o el índice está fuera de rango.
     */
    public E getElementAt(int index){
        return getNodeAt(index).getElement();
    }

    /**
     * Devuelve el nodo en la posición especificada de la lista enlazada.
     * @param index La posición del nodo que se desea obtener.
     * @return El nodo en la posición especificada.
     */
    public Node<E> getNodeAt(int index) {
        // Verifica si la lista está vacía o si el
        // índice está fuera de los límites válidos
        if (isEmpty() || index < 0 || index >= size())
            return null;

        // Si el índice es 0, devuelve el nodo de la cabeza
        if (index == 0)
            return head;

        // Si el índice es igual al tamaño de la lista - 1,
        // devuelve el nodo de la cola
        if (index == size() - 1)
            return tail;

        // Inicializa un nodo auxiliar y un índice auxiliar
        Node<E> aux = head;
        int auxIndex = 0;

        // Avanza a través de la lista hasta llegar al nodo
        // en la posición especificada
        while (aux.getNext() != null && auxIndex < index) {
            aux = aux.getNext();
            auxIndex++;
        }

        // Devuelve el nodo en la posición especificada
        return aux;
    }


    /**
     * Devuelve el nodo de la cabeza de la lista enlazada.
     * @return El nodo de la cabeza de la lista.
     */
    public Node<E> getHead() {
        return head;
    }

    /**
     * Establece el nodo de la cabeza de la lista enlazada.
     * @param head El nodo de la cabeza que se desea establecer.
     */
    public void setHead(Node<E> head) {
        this.head = head;
    }

    /**
     * Devuelve el nodo de la cola de la lista enlazada.
     * @return El nodo de la cola de la lista.
     */
    public Node<E> getTail() {
        return tail;
    }

    /**
     * Establece el nodo de la cola de la lista enlazada.
     * @param tail El nodo de la cola que se desea establecer.
     */
    public void setTail(Node<E> tail) {
        this.tail = tail;
    }
}
