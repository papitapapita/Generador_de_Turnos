package dataStructures;

/**
 * Interfaz que representa una cola
 * @param <E>
 */
public interface Queue<E>{
    /**
     * Inserta un elemento en la parte de atrás de la cola
     * @param e el elemento a insertar
     */
    void enqueue(E e);

    /**
     * Retorna pero no elimina el primer elemento de la cola
     * @return Retorna el primer elemento de la cola
     */
    E first();

    /**
     * Remueve y retorna el primer elemento de la cola (retorna null si está vacío)
     * @return Retorna el primer elemento de la cola
     */
    E dequeue();
}
