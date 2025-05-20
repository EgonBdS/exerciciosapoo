import java.util.Scanner; //importação para usuario conseguir digitar os números

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //ativa o scanner
        System.out.println("Informe um número inteiro:");
        int pn = sc.nextInt(); //salva a entrada do usuário
        System.out.println("Informe mais um número inteiro:");
        int sn = sc.nextInt(); //salva a entrada do usuário
        sc.close(); //fecha o scanner
        int soma = pn+sn;
        System.out.println("a soma dos números é: "+soma);
        }
    }

