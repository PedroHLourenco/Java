package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Pedro";
        String nome2 = "Pedro";
        String nome3 = new String("Pedro");
        String res;
        
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        
        System.out.println(res);
    }
    
}
