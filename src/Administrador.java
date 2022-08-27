/**
 * Clase Administrador
 * <p>Objeto base para crear al administrador</p>
 * @author Fabian
 */

public class Administrador {
    /**
     * Atributo para guardar el nombre del Administrador
     */
    private String nombre;
    /**
     * Atributo para guardar el horario del administrador
     */
    private String horario;
    /**
     * Atributo para guardar la tienda del administrador
     */
    private String sucursal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    /**
     * Constructor del administrador
     */
    public Administrador(String nombre, String horario, String sucursal) {
        this.nombre = nombre;
        this.horario = horario;
        this.sucursal = sucursal;

    }
}
