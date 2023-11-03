import java.util.Scanner;


// a.ii. Crea las clases que implementan la interfaz FiguraGeometrica


// b.i. Crea un programa principal que cree un arreglo de objetos de tipo FiguraGeometrica


public class App {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(3, 4);
        figuras[2] = new Triangulo(2, 3);

        Scanner scanner = new Scanner(System.in);

        // b.ii. Utiliza un bucle para recorrer el arreglo y mostrar el área y el perímetro de cada figura geométrica
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
        }

        // b.iii. Proporciona una interfaz de línea de comandos para que el usuario pueda interactuar con las figuras creadas.
        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular el área de una figura");
            System.out.println("2. Calcular el perímetro de una figura");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione una figura:");
                    System.out.println("1. Circulo");
                    System.out.println("2. Rectangulo");
                    System.out.println("3. Triangulo");

                    int figuraSeleccionada = scanner.nextInt();

                    switch (figuraSeleccionada) {
                        case 1:
                            System.out.println("Ingrese el radio del circulo:");
                            double radio = scanner.nextDouble();
                            Circulo circulo = new Circulo(radio);
                            System.out.println("El área del circulo es: " + circulo.calcularArea());
                            break;
                        case 2:
                            System.out.println("Ingrese la base del rectangulo:");
                            double base = scanner.nextDouble();
                            System.out.println("Ingrese la altura del rectangulo:");
                            double altura = scanner.nextDouble();
                            Rectangulo rectangulo = new Rectangulo(base, altura);
                            System.out.println("El área del rectangulo es: " + rectangulo.calcularArea());
                            break;
                        case 3:
                            System.out.println("Ingrese la base del triangulo:");
                            double baseTriangulo = scanner.nextDouble();
                            System.out.println("Ingrese la altura del triangulo:");
                            double alturaTriangulo = scanner.nextDouble();
                            Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                            System.out.println("El área del triangulo es: " + triangulo.calcularArea());
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Seleccione una figura:");
                    System.out.println("1. Circulo");
                    System.out.println("2. Rectangulo");
                    System.out.println("3. Triangulo");

                    int figuraSeleccionada2 = scanner.nextInt();

                    switch (figuraSeleccionada2) {
                        case 1:
                            System.out.println("Ingrese el radio del circulo:");
                            double radio = scanner.nextDouble();
                            Circulo circulo = new Circulo(radio);
                            System.out.println("El perímetro del circulo es: " + circulo.calcularPerimetro());
                            break;
                        case 2:
                            System.out.println("Ingrese la base del rectangulo:");
                            double base = scanner.nextDouble();
                            System.out.println("Ingrese la altura del rectangulo:");
                            double altura = scanner.nextDouble();
                            Rectangulo rectangulo = new Rectangulo(base, altura);
                            System.out.println("El perímetro del rectangulo es: " + rectangulo.calcularPerimetro());
                            break;
                        case 3:
                            System.out.println("Ingrese la base del triangulo:");
                            double baseTriangulo = scanner.nextDouble();
                            System.out.println("Ingrese la altura del triangulo:");
                            double alturaTriangulo = scanner.nextDouble();
                            Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                            System.out.println("El perímetro del triangulo es: " + triangulo.calcularPerimetro());
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}

