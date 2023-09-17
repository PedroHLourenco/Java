package vetor01;

public class Vetor01 {

    public static void main(String[] args) {
        int[] n = {3,2,8,5,7,4};
        
        System.out.println("Total de casas de N: " + n.length);
        
        for(int cont = 0; cont <= n.length - 1; cont++){
            System.out.println("Na posição " + cont + " temos o valor " + n[cont]);
        }
    }
    
}
