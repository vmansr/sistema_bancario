package sistemabancario;

public class SistemaBancario {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("16.885.250", "Victor Sánchez", "victor.sanchez@mail.com", "311 222 88 55 ", "Calle 123 No. 15-125");

        // Imprimir los datos del cliente una vez
        System.out.println(cliente);

        // Crear e imprimir los productos bancarios
        CuentaAhorro cuentaAhorro = new CuentaAhorro(cliente, "0001", "01/01/2023", 10000000, 1.3);
        cuentaAhorro.calcularInteresMensual();
        System.out.println("\nDetalles del Producto: Cuenta Ahorro\n" + cuentaAhorro);

        CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente, "0011", "20/03/2022", 5000000, 2.0, 1000000);
        cuentaCorriente.calcularInteresMensual();
        System.out.println("\nDetalles del Producto: Cuenta Corriente\n" + cuentaCorriente);

        CDT cdt = new CDT(cliente, "0111", "17/09/2021", 10050000, 12, 3.0);
        System.out.println("\nDetalles del Producto: CDT\n" + cdt);

        TarjetaCredito tarjetaCredito = new TarjetaCredito(cliente, "1111", "20/08/2023", 0, "20/08/2025", 2.5, 50000000, 20000000);
        tarjetaCredito.calcularInteresMensual();
        System.out.println("\nDetalles del Producto: Tarjeta de Crédito\n" + tarjetaCredito);
    }
}
