package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        int num, soma = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
            soma += num;
        } while (num != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Somatório vale " + soma + "</html>");
    }

}
