import java.util.Scanner;

public class Matematica2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite os valores de a, b e c da equação:3x^2 - 7x + 2 = 0");

            double a, b, c;

            // Validando entrada para 'a'
            while (true) {
                System.out.print("a: ");
                a = input.nextDouble();
                if (a != 0) {
                    break; // vai sair do loop se a letra 'a'  for diferente de zero
                }
                System.out.println("O valor de 'a' não pode ser zero. Digite novamente."); // vai digitar isto se o numero for 0
            }

            System.out.print("b: ");
            b = input.nextDouble();
            System.out.print("c: ");
            c = input.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Raízes reais: x1 = " + root1 + ", x2 = " + root2); // vai contar as raizes
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Raiz real única: x = " + root); // vai contar as raizes unica
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Raízes complexas: x1 = " + realPart + " + " + imaginaryPart + "i, x2 = " + realPart + " - " + imaginaryPart + "i");
            }
        } catch (java.util.InputMismatchException e) { //é usada para indicar que o elemento solicitado não existe
            System.out.println("Entrada inválida. Certifique-se de que você inseriu números válidos."); // vai falar isto se o numero nao for valido ou for 0.
        }
    }
    Scanner leia = new Scanner(System.in);
}
