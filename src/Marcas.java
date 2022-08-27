/**
 * Clase Marcas
 * <p>Objeto base utilizado para guardar marcas, precio y codigo de nuestra tienda</p>
 * @author Fabian
 *
 *
 */
public class Marcas {
    /**
     * Atributo para guardar el nombre de la marca
     */
    private String nombre;
    /**
     * Atributo para guardar el modelo de la marca
     */
    private String descripcion;
    /**
     * Atributo para guardar el precio del articulo
     */
    private Double precio;
    /**
     * Atributo para guardar el codigo del producto
     */
    private int codigo;
    /**
     * Constructor de la marca
     */
    public Marcas(String nombre, String descripcion, Double precio, int codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

