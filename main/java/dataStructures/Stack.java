package dataStructures;

public interface Stack<E> {
    /**
     * Inserta un elemento en la parte de arriba de la pila
     * @param e
     */
    void push(E e);

    /**
     * Retorna pero no elimina el elemento más arriba de la pila
     * @return el elemento más arriba de la pila
     */
    E top();

    /**
     * Remueve y retorna el elemento más arriba de la pila
     * @return el elemento más arriba de la pila
     */
    E pop();
}
