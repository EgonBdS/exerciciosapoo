import java.util.Scanner; // importando biblioteca scanner

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //ativa scanner
          System.out.println("Informe a primeira nota:"); // solicita primeira nota
          float n1 = sc.nextFloat();
           System.out.println("Informe a segunda nota:"); // solicita segunda nota
             float n2 = sc.nextFloat();
           System.out.println("Informe a terceira nota:"); // solicita terceira nota
              float n3 = sc.nextFloat();
                float media = n1+n2+n3/3; //calcula a media
           System.out.println("A média é: "+ media); //exibe o resultado
        sc.close();
    }
}