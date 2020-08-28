
import java.awt.Color;
import java.util.Date;

public class Pais {
    private String Nombre, Himno;
    private Date Fundacion;
    private Color Bandera;

    public Pais() {
    }

    public Pais(String Nombre, String Himno, Date Fundacion, Color Bandera) {
        this.Nombre = Nombre;
        this.Himno = Himno;
        this.Fundacion = Fundacion;
        this.Bandera = Bandera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getHimno() {
        return Himno;
    }

    public void setHimno(String Himno) {
        this.Himno = Himno;
    }

    public Date getFundacion() {
        return Fundacion;
    }

    public void setFundacion(Date Fundacion) {
        this.Fundacion = Fundacion;
    }

    public Color getBandera() {
        return Bandera;
    }

    public void setBandera(Color Bandera) {
        this.Bandera = Bandera;
    }

    @Override
    public String toString() {
        return "Pais: " + Nombre + ", Con el Himno:" + Himno + ", Fundado en:" + Fundacion + ", Con Bandera Color: " + Bandera;
    }
    
    
    
}
