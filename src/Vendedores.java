/**
 * Clase Vendedores
 * <p>Objeto Base para crear los datos de los vendedores</p>
 * @author Fabian
 *
 *
 */


public class Vendedores {
    /**
     * Atributo para guardar el nombre del vendedor
     */
    private String nombreVendedor;
    /**
     * Atributo para guardar la cedula del vendedor
     */
    private String cedVendedor;
    /**
     * Atributo para guardar el horario del vendedor
     */
    private String horarioVendedor;
    /**
     * Atributo para guardar el pago del vendedor
     */
    private Double pagoVendedor;

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getCedVendedor() {
        return cedVendedor;
    }

    public void setCedVendedor(String cedVendedor) {
        this.cedVendedor = cedVendedor;
    }

    public String getHorarioVendedor() {
        return horarioVendedor;
    }

    public void setHorarioVendedor(String horarioVendedor) {
        this.horarioVendedor = horarioVendedor;
    }

    public Double getPagoVendedor() {
        return pagoVendedor;
    }

    public void setPagoVendedor(Double pagoVendedor) {
        this.pagoVendedor = pagoVendedor;
    }
    /**
     * Constructor de los vendedores
     */
    public Vendedores(String nombreVendedor, String cedVendedor, String horarioVendedor, Double pagoVendedor) {
        this.nombreVendedor = nombreVendedor;
        this.cedVendedor = cedVendedor;
        this.horarioVendedor = horarioVendedor;
        this.pagoVendedor = pagoVendedor;

    }
}
