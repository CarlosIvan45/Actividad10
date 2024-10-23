import java.util.Scanner;

class Paciente {
    private String nombre;
    private double peso;
    private double altura;

    public Paciente(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC() {
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            return "BAJO PESO";
        } else if (imc < 25) {
            return "PESO NORMAL";
        } else if (imc < 30) {
            return "SOBREPESO";
        } else if (imc < 35) {
            return "OBESIDAD TIPO 1";
        } else if (imc < 40) {
            return "OBESIDAD TIPO 2";
        } else {
            return "OBESIDAD TIPO 3";
        }
    }

    // Getters y setters (no incluidos por brevedad)
}

class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese su peso en kg: ");
            double peso = scanner.nextDouble();
            System.out.print("Ingrese su altura en metros: ");
            double altura = scanner.nextDouble();

            Paciente paciente = new Paciente(nombre, peso, altura);
            String diagnostico = paciente.calcularIMC();
            System.out.println(nombre + ", su IMC indica: " + diagnostico);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Asegúrese de ingresar valores numéricos válidos.");
        }
    }
}