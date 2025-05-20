import java.util.Scanner; //faz com que o usuário possa informar dados no programa

public class exercicio02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //ativa o início do scanner
        System.out.println("informe um número:");
        int num = sc.nextInt();
            if (num % 2 == 0){ // o resto da divisão por 2 define se o número é par ou impar
                System.out.println("O número é par.");
            }
        else{
            System.out.println("O número é impar");
        }
        sc.close(); //fecha o scanner
    }
}