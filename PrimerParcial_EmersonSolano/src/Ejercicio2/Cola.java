package Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author EMERSON
 */
public class Cola {

    private Nodo inicio;
    private Nodo fin;
    public int cantidad;
    public double montito;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void encolar() {
        Dato d = new Dato();
        d.setTipoCombustible(JOptionPane.showInputDialog("Ingrese el tipo de combustible del carro: "));
        d.setMonto(Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el monto de combustible que va a usar: ")));

        Nodo nuevo = new Nodo();
        nuevo.setElemento(d);
        cantidad = cantidad + 1;
        montito = montito + d.getMonto();
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void atender() {
        if (!vacia()) {
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "El cliente fue atendido");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede atender a ningun cliente, cola vacía");
        }
    }

    public void mostrar() {
        if (!vacia()) {
            String s = "";
            Nodo aux = inicio;
            while (aux != null) {
                s = s + aux.getElemento().getTipoCombustible() + " / "
                        + aux.getElemento().getMonto() + " <- ";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No existen clientes para atender, cola vacía");
        }
    }

    public void reporte() {
        JOptionPane.showMessageDialog(null, "El monto total que se recolecto de la cola es de: " + montito
                + "\nCon la cantidad de " + cantidad + " de carros atendidos");

    }

}
