public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean saludable;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, int edad, double peso, boolean saludable) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.saludable = saludable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", saludable=" + saludable +
                '}';
    }

    // Metodos

    public int cumplirAnios (int nuevaEdad){
        this.edad+=nuevaEdad;
        return edad;
    }

    public double engordar(double nuevoPeso){
        this.peso+=nuevoPeso;
        return peso;
    }

    public double adelgazar(double nuevoPeso){
        this.peso-=nuevoPeso;
        return peso;
    }



    public boolean  recuperarSalud(){
         return true ;
    }

    public String mostrarFicha(){
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Especie: "+ this.getEspecie());
        System.out.println("Edad: "+ this.getEdad());
        System.out.println("Peso: "+this.getPeso());
        return "";
    }


}
