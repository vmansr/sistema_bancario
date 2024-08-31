package sistemabancario;

public class Cliente {
    private String documento;
    private String nombre;
    private String correo;
    private String celular;
    private String direccion;

    public Cliente(String documento, String nombre, String correo, String celular, String direccion) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.direccion = direccion;
    }
    // Sobrescribimos el método toString
    @Override
    public String toString() {
        return "Cliente: " +
                "\nDocumento: " + documento +
                "\nNombre: " + nombre +
                "\nCorreo: " + correo +
                "\nCelular: " + celular +
                "\nDirección: " + direccion;
    }
    
    // Getters y Setters
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    
    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }
    
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}
