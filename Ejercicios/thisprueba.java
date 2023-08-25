public class thisprueba {
    String nombre;
    int edad;

    //constructor
    thisprueba(String nombre, int edad){
        this.nombre= nombre;
        this.edad = edad;

    }
    public void mostrarDatos(){
        System.out.println("Nombre: " +  nombre + ", edad " + edad);
    }

    public static void main(String[] args) {
        thisprueba p = new thisprueba("juan", 30);
        p.mostrarDatos();
        
    }


    
}
