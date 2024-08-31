package sistemabancario;

public class CuentaCorriente extends ProductoBancario {
    private double porcentajeInteres;
    private double valorSobregiro;

    public CuentaCorriente(Cliente cliente, String numeroCuenta, String fechaApertura, double saldo, double porcentajeInteres, double valorSobregiro) {
        super(cliente, numeroCuenta, fechaApertura, saldo);
        this.porcentajeInteres = porcentajeInteres;
        this.valorSobregiro = valorSobregiro;
    }

    @Override
    public void calcularInteresMensual() {
        saldo += saldo * porcentajeInteres / 100;
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nPorcentaje de Interés: " + porcentajeInteres + "%" +
               "\nValor Sobregiro: " + formatearEnPesos(valorSobregiro);
    }

    // Getters y Setters
    public double getPorcentajeInteres() { return porcentajeInteres; }
    public void setPorcentajeInteres(double porcentajeInteres) { this.porcentajeInteres = porcentajeInteres; }

    public double getValorSobregiro() { return valorSobregiro; }
    public void setValorSobregiro(double valorSobregiro) { this.valorSobregiro = valorSobregiro; }
}
