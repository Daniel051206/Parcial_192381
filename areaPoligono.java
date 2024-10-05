import java.util.Scanner;
public class areaPoligono {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione tipo de poligono que quiera evaluar:");
        System.out.println("1. Triangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        
        int tipoPoligono = scanner.nextInt();

        switch (tipoPoligono) {
            case 1:
                System.out.println("Ingrese la medida de la base de su triangulo: ");
                double baseTriangulo= scanner.nextDouble();
                System.out.println("Ingrese la medida de la altura de su triangulo: ");
                double alturaTriangulo= scanner.nextDouble();

                double areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
                System.out.println("El area de su triangulo es: " + areaTriangulo);
                break;
            case 2:
                System.out.println("Ingrese la mediada de uno de los lados de su cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();

                double areaCuadrado = ladoCuadrado*ladoCuadrado;
                System.out.println("El area de su cuadrado es: "+areaCuadrado);
                break;
            case 3:
            System.out.println("Ingrese la medida de la base de su rectangulo: ");
            double baseRectangulo= scanner.nextDouble();
            System.out.println("Ingrese la medida de la altura de su rectangulo: ");
            double alturaRectangulo = scanner.nextDouble();
            double areaRectangulo = baseRectangulo*alturaRectangulo;
            System.out.println("El area de su rectangulo es: "+areaRectangulo);
            break;
            default:
                System.out.println("¡ERROR! Ingrese un valor valido");
                break;
        }
    }
}