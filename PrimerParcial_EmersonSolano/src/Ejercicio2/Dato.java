package Ejercicio2;

/**
 *
 * @author EMERSON
 */
public class Dato {

    private String tipoCombustible;
    private double monto;

    public Dato() {
        this.tipoCombustible = " ";
        this.monto = 0.00d;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;

    }

}
