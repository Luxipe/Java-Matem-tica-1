import java.util.Scanner;
public class Matematica5 {
    public static void main(String[] args) {
        // o codigo vai definir  o raio do círculo e calcular
         double raio = 5.0;

        // vai Calcular a área do círculo usando a fórmula: área = π * raio * raio
        double area = Math.PI * raio * raio;

        // vai Exibir a área calculada no terminal
        System.out.println("A área do círculo com raio " + raio + " é: " + area);
    }
    Scanner leia = new Scanner(System.in);      
}
