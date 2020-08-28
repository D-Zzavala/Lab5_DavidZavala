public class Persona {
    private String Nacionalidad, Nombre, Apellido, Genero, Vocacion, Titulo;
    private int Edad;
    private boolean Contagiado;

    public Persona() {
    }

    public Persona(String Nacionalidad, String Nombre, String Apellido, String Genero, String Vocacion, String Titulo, int Edad, boolean Contagiado) {
        this.Nacionalidad = Nacionalidad;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Genero = Genero;
        this.Vocacion = Vocacion;
        this.Titulo = Titulo;
        this.Edad = Edad;
        this.Contagiado = Contagiado;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getVocacion() {
        return Vocacion;
    }

    public void setVocacion(String Vocacion) {
        this.Vocacion = Vocacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public boolean isContagiado() {
        return Contagiado;
    }

    public void setContagiado(boolean Contagiado) {
        this.Contagiado = Contagiado;
    }

    @Override
    public String toString() {
        return "La Persona"+ Nombre +" "+ Apellido + ", de " + Nacionalidad +", de:" + Edad +" años de edad, Genero:" + Genero + ", con Vocacion de:" + Vocacion + ", y Titulo:" + Titulo + ", resultó: " + Contagiado + "para la prueba del Covid-19}";
    }
    
    
    
}
