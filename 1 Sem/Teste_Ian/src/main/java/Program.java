import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.*;

public class Program {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite um número quebrado: ");
        double valor = scanner.nextDouble();

        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        simbolos.setDecimalSeparator('.');

        DecimalFormat formato = new DecimalFormat("#.##", simbolos);
        String valorFormatado = formato.format(valor);

        System.out.println("Valor formatado: " + valorFormatado);

    }
}
