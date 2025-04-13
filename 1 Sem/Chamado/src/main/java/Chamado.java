public abstract class Chamado{
    private int id;
    private String descricao;
    private Status status;

    public Chamado (int id, String descricao){
        this.id = id;
        this.descricao = descricao;
        this.status = Status.ABERTO;
    }

    public abstract void solucionarChamado();

    //GETTERS e SETTERS

    public int getId(){
        return id;
    }
    public String getDescricao(){
        return descricao;
    }
    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }

}

enum Status{
    ABERTO,
    EM_ANDAMENTO,
    ENCERRADO
}