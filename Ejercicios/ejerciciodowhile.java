import java.util.Scanner;
public class ejerciciodowhile {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System. in);
    int numero;

    do{
        System.out.println("Ingresa el numero 5: ");
        numero = scanner.nextInt();

    } while(numero != 5);
    System.out.println("¡Correcto! Has ingresado el numero 5");
}

    
}
