package Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author EMERSON
 */
public class Menu {

    private int op;
    Cola cola = new Cola();

    public void mostrarMenu() {
        while (op != 5) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n"
                    + "1. Ingresar clientes\n"
                    + "2. Atender clientes\n"
                    + "3. Mostrar clientes\n"
                    + "4.Reporte\n"
                    + "5. Salir\n"
                    + "_Digite su opción deseada: "));

            switch (op) {
                case 1:
                    cola.encolar();
                    break;
                case 2:
                    cola.atender();
                    break;
                case 3:
                    cola.mostrar();
                    break;
                case 4:
                    cola.reporte();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
            }
        }
    }

}
