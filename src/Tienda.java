/**
 * Clase Registro
 * <p>Objeto base usado para crear las tiendas</p>
 * @author Fabian
 *
 */

public class Tienda {
    /**
     * Atributo para guardar el nombre de la tienda
     */
    private String nombreTienda;
    /**
     * Atributo para guardar el horario de la tienda
     */
    private String horario;
    /**
     * Atributo para guardar el aforo de la tienda
     */
    private int numPersonas;
    /**
     * Atributo para guardar la direccion de la tienda
     */
    private String direccion;
    /**
     * Atributo para guardar las marcas
     */
    private Marcas lasMarcas[];
    /**
     * Atributo para guardar los vendedores
     */
    private  Vendedores losVendedores[];
    /**
     * Atributo para guardar la informacion del administrador
     */
    public Administrador elAdministrador;

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Marcas[] getLasMarcas() {
        return lasMarcas;
    }

    public void setLasMarcas(Marcas[] lasMarcas) {
        this.lasMarcas = lasMarcas;
    }

    public Vendedores[] getLosVendedores() {
        return losVendedores;
    }

    public void setLosVendedores(Vendedores[] losVendedores) {
        this.losVendedores = losVendedores;
    }

    public Tienda(String nombreTienda, String horario, int numPersonas, Marcas[] lasMarcas, Vendedores[] losVendedores) {
        /**
         * Constructor de la tienda
         */
        this.nombreTienda = nombreTienda;
        this.horario = horario;
        this.numPersonas = numPersonas;
        this.direccion = direccion;
        this.lasMarcas = lasMarcas;
        this.losVendedores = losVendedores;
        this.elAdministrador = new Administrador("", "","");


    }
}



