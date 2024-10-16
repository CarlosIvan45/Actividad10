import java.util.Scanner;

class Perro {

    private String nombre;
    private String raza;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer(String comida, double cantidad) {
        System.out.println(nombre + " está comiendo " + cantidad + " gramos de " + comida);
    }

    public String ladrar() {
        return "Guau guau!";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        System.out.print("Ingrese el nombre del perro 1: ");
        perro1.setNombre(scanner.nextLine());

        System.out.print("Ingrese el nombre del perro 2: ");
        perro2.setNombre(scanner.nextLine());

        perro1.comer("croquetas", 200);
        System.out.println(perro1.ladrar());

        perro2.comer("hueso", 150);
        System.out.println(perro2.ladrar());
    }
}