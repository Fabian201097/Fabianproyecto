import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Creacion del arreglo de objetos Registros
        Registro elRegistro[] = new Registro[1];
        for (int i = 0; i < elRegistro.length; i++) {
            elRegistro[i] = new Registro("", "");
            JOptionPane.showMessageDialog(null, "Bienvenido a la zona de registro");
            elRegistro[i].setUsuario(JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario a registrar"));
            elRegistro[i].setContraseña(JOptionPane.showInputDialog(null, "Ingrese la contraseña a asignar del usario"));
        }


        //Creacion del arreglo de objetos Marcas
        Marcas lasMarcas[] = new Marcas[2];
        for (int i = 0; i < lasMarcas.length; i++) {
            lasMarcas[i] = new Marcas("", "", 0.0, 0);
            lasMarcas[i].setNombre(JOptionPane.showInputDialog(null, "Ingrese la marca del articulo: "));
            lasMarcas[i].setDescripcion(JOptionPane.showInputDialog(null, "Ingrese el modelo: "));
            lasMarcas[i].setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del articulo: ")));
            lasMarcas[i].setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Codigo: ")));
        }


        //Creacion del arreglo de objetos Vendedores
        Vendedores losVendedores[] = new Vendedores[2];
        for (int i = 0; i < losVendedores.length; i++) {
            losVendedores[i] = new Vendedores("", "", "", 0.0);
            losVendedores[i].setNombreVendedor(JOptionPane.showInputDialog(null, "Ingrese el nombre del vendedor: "));
            losVendedores[i].setCedVendedor(JOptionPane.showInputDialog(null, "Ingrese el numero de cedula del vendedor: "));
            losVendedores[i].setHorarioVendedor(JOptionPane.showInputDialog(null, "Indique el horario del vendedor: "));
            losVendedores[i].setPagoVendedor(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el pago por hora del vendedor: ")));
        }


        //Creacion del arreglo de objetos Tienda
        Tienda laTienda[] = new Tienda[2];
        for (int i = 0; i < laTienda.length; i++) {
            laTienda[i] = new Tienda("","",0,lasMarcas,losVendedores);
            laTienda[i].setNombreTienda(JOptionPane.showInputDialog(null, "Cual es el nombre de la Tienda: "));
            laTienda[i].setHorario(JOptionPane.showInputDialog(null, "Cual es el horario de la tienda: "));
            laTienda[i].setNumPersonas(Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es el aforo maximo de personas: ")));
            laTienda[i].setDireccion(JOptionPane.showInputDialog(null, "Cual es la direccion exacta de la tienda ?: "));
            laTienda[i].elAdministrador.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del administrador: "));
            laTienda[i].elAdministrador.setSucursal(JOptionPane.showInputDialog(null, "Ingrese la sucursal del administrador: "));
            laTienda[i].elAdministrador.setHorario(JOptionPane.showInputDialog(null, "Ingrese el horario del administrador: "));

        }
        System.out.println(laTienda[1].getHorario());
        System.out.println(laTienda[1].getNumPersonas());
        System.out.println(laTienda[1].getDireccion());
        System.out.println(laTienda[1].getHorario());

    }
}























