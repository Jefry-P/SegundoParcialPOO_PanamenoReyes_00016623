package adapter;

public class Paypal extends PagoService implements Pagable{

    public Paypal(String usuario, String contrasena, String nombreEmpresa) {
        super(usuario, contrasena, nombreEmpresa);
    }

    @Override
    public void pagar() {
        System.out.println("Credenciales");
        System.out.println("Username: " + this.getUsuario());
        System.out.println("Contrasena: " + this.getContrasena());

    }
}
