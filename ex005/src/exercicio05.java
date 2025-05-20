public class exercicio05 {
    public static void main(String[] args) {
        System.out.println("números pares entre 01 e 20:");
        for (int n=1; n<=20; n++){ //laço de repetição, n igual a 1 e vai até n menor ou igual a 20, n++ aumenta 1 a cada repetiçao
            if (n%2==0){ // verificador n%2 calcula o resto da divisão , se o resto for zero é par
                System.out.println(n);
            }

            
        }
    }
}