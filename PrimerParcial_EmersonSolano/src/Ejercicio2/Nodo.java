package Ejercicio2;

/**
 *
 * @author EMERSON
 */
public class Nodo {

    private Dato elemento;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    /**
     * @return the elemento
     */
    public Dato getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
