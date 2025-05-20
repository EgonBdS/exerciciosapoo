import java.util.Scanner; //importação para o usuário mandar dados

public class exercicio09{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ativa o scanner
          System.out.println("Informe o primeiro número"); //le o primeiro número
            int n1 = sc.nextInt(); // guarda o primeiro número
          System.out.println("Selecione o operador: (+ , - , * , /)"); // escolhe o operador
            String operador = sc.next(); //guarda o operador
          System.out.println("Informe o segundo número"); // le o segundo número
            int n2 = sc.nextInt(); // guarda o segundo número
          switch(operador){ // switch substitui if e else em casos de muitos operadores. Escolhe o caso com base na escolha do operador do usuário
            case "+":
                System.out.println("o resultado é: " + (n1+n2));
            break; // encerra o caso

            case "-":
                System.out.println("o resultado é: " + (n1-n2));
            break;

            case"*":
                System.out.println("o resultado é: " + (n1*n2));
            break;

            case"/":
                System.out.println("o resultado é: " + (n1/n2));
            break;
            default: // para casos inválidos
            System.out.println("invalido");
        sc.close(); // fecha o scanner
        }
    }
}