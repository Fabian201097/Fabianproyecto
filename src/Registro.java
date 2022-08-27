/**
 * Clase Registro
 * <p>Objeto base usado para registro de usuarios de la tienda</p>
 * @author Fabian
 *
 */


public class Registro {
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    /**
     * Constructor del registro
     */
    public Registro(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    /**
     * Atributo para guardar el usuario y la contraseña del registro
     */
    private String usuario;
    private String contraseña;

}
