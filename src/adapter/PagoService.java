package adapter;

public class PagoService {
    private String usuario;
    private String contrasena;
    private String nombreEmpresa;

    public PagoService(String usuario, String contrasena, String nombreEmpresa) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
