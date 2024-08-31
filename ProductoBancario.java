package sistemabancario;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class ProductoBancario {
    protected Cliente cliente;
    protected String numeroCuenta;
    protected String fechaApertura;
    protected double saldo;

    public ProductoBancario(Cliente cliente, String numeroCuenta, String fechaApertura, double saldo) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }
    public abstract void calcularInteresMensual(); 
    
    public String formatearEnPesos(double valor) {
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        return formatoMoneda.format(valor);
    }

    @Override
    public String toString() {
        return "Número de Cuenta: " + numeroCuenta +
               "\nFecha de Apertura: " + fechaApertura +
               "\nSaldo: " + formatearEnPesos(saldo);
    }
    
}

