package operadoresaritméticos;

public class OperadoresAritméticos {

    public static void main(String[] args) {
      /*
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        
        System.out.println("A média é igual a " + m);
      */
        
      /*
        int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);
      */
      
      /*
        int x = 4;
        x += 2; // x = x + 2
        x *= 2; // x = x * 2
        System.out.println(x);
      */
      
      /*
        float v = 8.7f;
        int ar = (int) Math.round(v);
        System.out.println(ar);
      */
      
        double rand = Math.random();
        int n = (int) (15 + rand * (50 - 15));
        System.out.println(n);
    }
    
}
