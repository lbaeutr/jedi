public class Jedi {
    private String nombre;
    private int edad;
    private String[] habilidades;
    private String colorSableLaser;

    public Jedi(String nombre, int edad, String[] habilidades, String colorSableLaser) {
        this.nombre = nombre;
        this.edad = edad;
        this.habilidades = habilidades;
        this.colorSableLaser = colorSableLaser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    public String getColorSableLaser() {
        return colorSableLaser;
    }

    public void setColorSableLaser(String colorSableLaser) {
        this.colorSableLaser = colorSableLaser;
    }

    public void entrenarEnHabilidad(String habilidad) {
        System.out.println(this.nombre + " está entrenando en " + habilidad);
    }

    public void usarLaFuerza() {
        System.out.println(this.nombre + " está usando la Fuerza!");
    }

    public void atacar() {
        System.out.println(this.nombre + " está atacando con un sable de luz " + this.colorSableLaser + "!");
    }
}
