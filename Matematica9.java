import java.util.Scanner;

public class Matematica9 {
    public static void main(String[] args) {
        double ladoBase = 6.0; //o lado da base é 6
        double altura = 8.0; // a altura é 8.

        double volume = (1.0 / 3) * Math.pow(ladoBase, 2) * altura; // vai calcular a soma.

        System.out.println("O volume da pirâmide é: " + volume); // vai falar a soma do calculo da piramide.
    }
    Scanner leia = new Scanner(System.in);
}
