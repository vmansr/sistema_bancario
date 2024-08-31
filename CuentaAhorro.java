package sistemabancario;

public class CuentaAhorro extends ProductoBancario {
    private double porcentajeInteres;

    public CuentaAhorro(Cliente cliente, String numeroCuenta, String fechaApertura, double saldo, double porcentajeInteres) {
        super(cliente, numeroCuenta, fechaApertura, saldo);
        this.porcentajeInteres = porcentajeInteres;
    }

    @Override
    public void calcularInteresMensual() {
        saldo += saldo * porcentajeInteres / 100;
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nPorcentaje de Interés: " + porcentajeInteres + "%";
    }
    
    // Getters y Setters
    public double getPorcentajeInteres() { return porcentajeInteres; }
    public void setPorcentajeInteres(double porcentajeInteres) { this.porcentajeInteres = porcentajeInteres; }
}
