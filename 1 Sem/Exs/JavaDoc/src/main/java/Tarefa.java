import java.util.ArrayList;
import java.util.List;

public class Tarefa {

    private String titulo;
    /**
     * @  Propriedade que recebera a descricao da tarefa.
     */
    private String descricao;
    private boolean concluida;

    /**
     *
     * @param titulo Informar titulo da tarefa
     * @param descricao Informar descrição da tarefa
     */
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }


    public void concluir(){
        this.concluida = true;
    }
    public void reabrir(){
        this.concluida = false;
    }

    /**
     *
     * @return Metoto para retornar o andamento da tarefa, retorna um boolean se está ou não true / false
     */
    public boolean estaConcluida(){
        return concluida;
    }

    /**
     *
     * @return Retorna o título da tarefa
     */
    public String getTitulo(){
        return titulo;
    }

    /**
     *
     * @return Retorna a descrição da tarefa
     */
    public String getDescricao(){
        return descricao;
    }
}
