import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Informe a temperatura em celcius para conversão:");
                double c = sc.nextDouble(); // usado double para ser mais preciso na conversão, se não pode dar diferença
                double f=(c*9/5)+32;
            System.out.println("A temperatura é "+f+" Fahrenheit");
    }
}