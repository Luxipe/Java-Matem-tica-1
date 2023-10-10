import java.util.Scanner;

public class Matematica8 {
    public static void main(String[] args) {
        double aresta = 7.0; // aresta vai ser 7.0 

        double volume = Math.pow(aresta, 3); //vai calcular o volume.
        double areaSuperficie = 6 * Math.pow(aresta, 2); // vai calcular a area da superfície.

        System.out.println("O volume do cubo é: " + volume); // vai falar no terminal o total do volume do cubo no terminal.
        System.out.println("A área da superfície do cubo é: " + areaSuperficie); // vai falar o total da área da superfície do cubo no terminal.
    }
    Scanner leia = new Scanner(System.in);
}
