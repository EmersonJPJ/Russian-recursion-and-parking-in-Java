import java.util.Scanner;

/**
 *
 * @author EMERSON
 */
public class Multi {

    /**
     * @param args the command line arguments
     */
    int x;
    int y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los numeros para evaluarlos");
        try{
        int x = sc.nextInt();
        int y = sc.nextInt();
        Multi m = new Multi(x, y);
        System.out.println("El resultado utilizando el metodo ruso es de: " + m.Multi(x, y));
        }catch(Exception e){
            System.out.println("No ingreso los datos correctamente "+e.getMessage());
        }          
    }

    public Multi(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int Multi(int x, int y) {
        if (x == 1) {
            return (y);

        }
        if (x % 2 != 0) {
            return y + Multi(x / 2, y * 2);
        } else {
            return Multi(x / 2, y * 2);
        }

    }

}
