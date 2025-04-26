import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chamado {
    private int id;
    private String descricao;
    private String responsavel;
    private LocalDate dataAbertura;
    private LocalDate dataFechamento;


    /**
     *
     * @param id do Chamado
     * @param descricao do Chamado
     * @param responsavel pelo chamado
     * @param dataAbertura do Chamado
     */
    public Chamado(int id, String descricao, String responsavel, LocalDate dataAbertura) {
        this.id = id;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = null;
    }

    /**
     *
     * @param dataFechamento o Atributo dataFechamento recebe a data de fechamento/conclusao do chamado
     */
    public void fecharChamado(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    /**
     *
     * @return Retorna a condicao da data do fechamento, se ela for diferente de null retornara Falso, ja
     * que o chamado foi concluido.
     */
    public boolean estaAberto() {
        return dataFechamento == null;
    }

    /**
     *
     * @return Metodo GET para pegar o ID do chamado
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return Metodo GET para pegar a descricao do chamado
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     *
     * @return Metodo GET para saber o responsavel pelo chamado
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     *
     * @return Metodo GET para pegar a data de abertura do chamado
     */
    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    /**
     *
     * @return Metodo GET para pegar o horario de fechamento do chamado
     */
    public LocalDate getDataFechamento() {
        return dataFechamento;
    }

    /**
     *
     *
     * @return Retorna os dias entre a abertura e fechamento para saber a duracao do chamado
     */
    public long getDuracao() {
        if (dataFechamento != null) {
            return ChronoUnit.DAYS.between(dataAbertura, dataFechamento);
        } else {
            return -1;
        }
    }
}