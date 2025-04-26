package EquipeF1.Operacoes;

public interface OperacoesChamado {
    void criarChamado(String titulo, String descricao);
    void atenderChamado(String tipo);
    void fecharChamado();
}
