import java.util.Scanner; // importação para o usuário mandar dados

public class exercicio06 {
    public static void main(String[] args) {
        int[] n = new int[5]; // array para 5 posições
        Scanner sc = new Scanner(System.in); //ativa o scanner
        for (int c = 0; c < 5; c++) { // estrutura de repetiçao, para
            System.out.println("Informe números");
            n[c] = sc.nextInt(); // guarda o valor no array
        }
        for (int c = 0; c < 5; c++) { // caça os valores informados no for anterior
            System.out.println("os números digitados são: " +n[c]); // exibe os números guardados dentro do array
        }
    }
}