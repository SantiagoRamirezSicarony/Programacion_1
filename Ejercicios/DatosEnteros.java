public class DatosEnteros {
    public static void main(String[] args) {
        int edad1;
        int segundos;
        int dias1, dias2, segundos2, diferencia, suma, edad2;
        double division;

        edad1 = 18;

        edad2 = 24;

        dias1 =  edad1 * 365;
        segundos = dias1 * 86400;

        dias2 = edad2 * 365;
        segundos2 = dias2 * 86400;

        diferencia =  edad1 - edad2;

        suma = edad1 + edad2;

        division = edad1 /edad2;



        System.out.println("De la edad 1 han pasado");
        System.out.println(segundos);


        System.out.println("------------------------");
        System.out.println("de la edad 2 han pasado");
        System.out.println(segundos2);


        System.out.println("------------------------");
        System.out.println(diferencia);
        System.out.println(suma);
        System.out.println(division);




    }
    
}
