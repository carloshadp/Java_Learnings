package EquipeF1.Operacoes;

public class Main {
    public static void main(String[] args){
        OperacoesChamado chamado1 = new ChamadoSuporte();
        chamado1.criarChamado("Problema no email", "Não consigo acessar meu email");
        chamado1.atenderChamado("Suporte geral");
        chamado1.fecharChamado();

        System.out.println("-----------------------");

        OperacoesChamado chamadoTI = new ChamadoTI();
        chamadoTI.criarChamado("Computador travando", "PC mt lento");
        chamadoTI.atenderChamado("TI");
        chamadoTI.fecharChamado();
    }
}
