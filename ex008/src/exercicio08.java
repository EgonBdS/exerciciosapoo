import java.util.Scanner; // usando scanner para o usuário conseguir inserir dados

public class exercicio08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //liga o scanner
        System.out.println("informe uma palavra"); //solicita ao usuário a palavra
        String palavra = sc.nextLine(); // leitura da palavra
        int contador = 0; // conta quantas letras tem a palavra
        for (char x = 0; x < palavra.length(); x++) { //lenght é o metodo que retorna a quantidade de caracteresx
            char letra = palavra.charAt(x);
            letra = Character.toLowerCase(letra); // para diferenciar letra maiuscula de minuscula
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') { // || ou
                contador++;
            }
            System.out.println("numero de vogais é" + contador);
            sc.close(); //fecha o scanner
        }
    }
}