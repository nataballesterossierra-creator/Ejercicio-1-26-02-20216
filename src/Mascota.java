public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean saludable;

    public Mascota() {
    }
    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;

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
        return "Mascota : " + "Nombre:" + nombre + " ||"+" Especie: " + especie + '\'' +  " ||"+" Edad:" + edad + " ||"+
                "Peso:" + peso + " ||"+"Esta Saludable: " + saludable + " ||";
    }

    // Metodos

    public int cumplirAnios (int nuevaEdad){
        this.edad+=nuevaEdad;
        return edad;
    }

    public double engordar(double nuevoPesoe){
        this.peso+=nuevoPesoe;
        return peso;
    }

    public double adelgazar(double nuevoPesoa){
        this.peso-=nuevoPesoa;
        return peso;
    }


    public String evaluarSalud(int indice) {

        if (indice <= 40) {
            this.saludable = false;
            return "Crítico";
        } else {
            this.saludable = true;
            return "Bueno";
        }
    }


    public String mostrarFicha(){
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Especie: "+ this.getEspecie());
        System.out.println("Edad: "+ this.getEdad()+" AÑOS");
        System.out.println("Peso: "+this.getPeso()+ " Kg");
        System.out.println("Saludable: "+ this.isSaludable());
        return "";
    }


}
