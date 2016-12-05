package tpe.collections.iterator;

import java.util.Iterator;

/**
 * Eine einfache, naive Stack Implementierung.
 *
 * @param <T> Typ, der gespeichert werden soll.
 */
public class SimpleStack<T> implements Iterable<T>{
// TODO: implements Iterable<T> hinzufügen

    private T[] stack;
    private int pos;

    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int pos = 0;

            public boolean hasNext() {
                return pos < stack.length;
            }

            public T next() {
                pos++;
                return peek();
            }
        };
    }


    /**
     * Legt einen neuen Stack mit der gegebenen Größe an.
     *
     * @param size Größe des Stacks.
     */
    @SuppressWarnings("unchecked")
    public SimpleStack(int size) {
        stack = (T[]) new Object[size];
        pos = 0;
    }

    /**
     * Fügt dem Stack ein neues Element hinzu.
     *
     * @param o Element, das hinzugefügt werden soll.
     */
    public void push(T o) {
        stack[pos++] = o;
    }

    /**
     * Holt das oberste Element und entfernt es.
     *
     * @return das oberste Element
     */
    public T pop() {
        return stack[--pos];
    }

    /**
     * Gibt das oberste Element zurück, ohne es zu entfernen.
     *
     * @return das oberste Element
     */
    public T peek() {
        return stack[pos - 1];
    }

    // TODO: Interface Iterable<T> implementieren
}
