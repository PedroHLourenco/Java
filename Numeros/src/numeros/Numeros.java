package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int num, soma = 0;
        String resposta;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            
            num = teclado.nextInt();
            soma += num;
            
            System.out.println("Quer continuar? (S/N)");
            
            resposta = teclado.next();
        } while (resposta.equals("S"));
        
        System.out.println("A soma de todos os valores é: " + soma);
    }

}
