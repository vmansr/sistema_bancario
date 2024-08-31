package sistemabancario;

public class CDT extends ProductoBancario {
    private int plazoMeses;
    private double interesMensual;

    public CDT(Cliente cliente, String numeroCuenta, String fechaApertura, double saldo, int plazoMeses, double interesMensual) {
        super(cliente, numeroCuenta, fechaApertura, saldo);
        this.plazoMeses = plazoMeses;
        this.interesMensual = interesMensual;
    }

    public double calcularValorFinal() {
        return saldo + (saldo * interesMensual / 100 * plazoMeses);
    }
    @Override
    public void calcularInteresMensual() {
        // Como el CDT aplica intereses al final del plazo, este método podría no hacer nada
        // o se puede usar para actualizar algún estado si es necesario
    }
    

    @Override
    public String toString() {
        return super.toString() +
               "\nPlazo (Meses): " + plazoMeses +
               "\nInterés Mensual: " + interesMensual + "%" +
               "\nValor Final: " + formatearEnPesos(calcularValorFinal());
    }

    // Getters y Setters
    public int getPlazoMeses() { return plazoMeses; }
    public void setPlazoMeses(int plazoMeses) { this.plazoMeses = plazoMeses; }

    public double getInteresMensual() { return interesMensual; }
    public void setInteresMensual(double interesMensual) { this.interesMensual = interesMensual; }
}
