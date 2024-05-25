package adapter;

public class Proveedor implements Pagable{
    private Paypal adaptee;


    public Proveedor(Paypal adaptee, String nombreEmpresa) {
        this.adaptee = adaptee;
    }

    public Paypal getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Paypal adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void pagar(){
        System.out.println("Credenciales");
        System.out.println("Username: " + adaptee.getUsuario());
        System.out.println("Contrasena: " + adaptee.getContrasena());
        System.out.println("Token: " + adaptee.getUsuario() + ":" + adaptee.getNombreEmpresa());
    }
}
