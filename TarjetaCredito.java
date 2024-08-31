package sistemabancario;

public class TarjetaCredito extends ProductoBancario {
    private String fechaVencimiento;
    private double porcentajeInteres;
    private double cupo;
    private double valorUtilizado;

    public TarjetaCredito(Cliente cliente, String numeroCuenta, String fechaApertura, double saldo, String fechaVencimiento, double porcentajeInteres, double cupo, double valorUtilizado) {
        super(cliente, numeroCuenta, fechaApertura, saldo);
        this.fechaVencimiento = fechaVencimiento;
        this.porcentajeInteres = porcentajeInteres;
        this.cupo = cupo;
        this.valorUtilizado = valorUtilizado;
    }

    @Override
    public void calcularInteresMensual() {
        saldo += cupo - valorUtilizado;
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nFecha de Vencimiento: " + fechaVencimiento +
               "\nPorcentaje de Interés: " + porcentajeInteres + "%" +
               "\nCupo: " + formatearEnPesos(cupo) +
               "\nValor Utilizado: " + formatearEnPesos(valorUtilizado);
    }
    
    // Getters y Setters
    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    public double getPorcentajeInteres() { return porcentajeInteres; }
    public void setPorcentajeInteres(double porcentajeInteres) { this.porcentajeInteres = porcentajeInteres; }

    public double getCupo() { return cupo; }
    public void setCupo(double cupo) { this.cupo = cupo; }

    public double getValorUtilizado() { return valorUtilizado; }
    public void setValorUtilizado(double valorUtilizado) { this.valorUtilizado = valorUtilizado; }
}
