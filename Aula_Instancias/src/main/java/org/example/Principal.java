package org.example;
import java.util.Scanner;

public class Principal {
    private static Scanner scanner;
    // Construtor que inicializa o Scanner
    public Principal() {
        this.scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {

        // Criar uma instância da classe Principal
        //Ação necessária para viabilizar o acesso ao construtor
        Principal principal = new Principal();

        //Passo 1 - Executar o método capturarNota e o obter os valores de nota1, nota2 e notaTrabalho
        double retornoNota1 = principal.capturarNota("Informar valor da nota 1: ");
        double retornoNota2 = principal.capturarNota("Informar valor da nota 2: ");
        double retornoNotaTrabalho = principal.capturarNota("Informar valor da nota do trabalho: ");

        Pessoa pessoa = new Pessoa();

        //Passo2 - Executar o método calcularMediaSemestral e obter o valor da Média Semestral do aluno(a)
        double retornoCalcularMediaSemestral = pessoa.calcularMediaSemestral(retornoNota1, retornoNota2, retornoNotaTrabalho);

        //Passo 3 - Validar Média Semestral do Aluno(a) - MS >= 7
        //Desvio Condicional Composto
        if(retornoCalcularMediaSemestral >= 7) {
            System.out.println("Aluno(a) aprovado(a) na disciplina. A média semestral é: " + retornoCalcularMediaSemestral);
        }else{
            System.out.println("Aluno(a) deverá realizar exame da disciplina. A média semestral é:" + retornoCalcularMediaSemestral);

            //Passo 4
            double retornoCalcularNotaCorte = pessoa.calcularNotaCorte(retornoCalcularMediaSemestral);
            System.out.println("A nota de corte para aprovação na disciplina é: " + retornoCalcularNotaCorte);

            //Passo 5 - Capturar o valor da nota do exame
            double retornoNotaExame = capturarNota("Informar valor da nota do exame: ");

            //Passo 6 - Calcular Média do Exame
            //retornoCalcularMediaSemestral = mediaSemestral
            //retornoNotaExame = notaExame
            double retornoCalcularMediaExame = pessoa.calcularMediaExame(retornoCalcularMediaSemestral, retornoNotaExame);

            //Passo 7 - Validar Média do Exame do Aluno(a) - ME >= 5
            //Desvio Condicional Composto
            if(retornoCalcularMediaExame >= 5){
                System.out.println("Aluno(a) aprovado no exame da disciplina");
            }else{
                System.out.println("Aluno(a) reprovado no exame da disciplina");
            }
            principal.closeScanner();
        }
    }
    //O método capturarNota será responsável por caputar a nota1, nota2, notaTrabalho e notaExame
    private static double capturarNota(String notaInput){
        System.out.print(notaInput);
        double nota = scanner.nextDouble();
        return nota;
    }
    // Método para fechar o Scanner
    private static void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}