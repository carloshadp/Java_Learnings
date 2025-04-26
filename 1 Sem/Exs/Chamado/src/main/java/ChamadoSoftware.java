public class ChamadoSoftware extends Chamado{
    private String equipamento;

    public ChamadoSoftware(int id, String descricao, String equipamento){
        super(id, descricao);
        this.equipamento = equipamento;
    }

    @Override
    public void solucionarChamado(){
        System.out.println("Chanado de Hardware resolvido: "+ this.getDescricao() +
                "relacionado ao equipamento: "+ equipamento);
        this.setStatus(Status.ENCERRADO);
    }

    public String getEquipamento(){
        return equipamento;
    }

    public void setEquipamento(String equipamento){
        if ((equipamento != null) && (!equipamento.trim().isEmpty())){
            this.equipamento = equipamento;
        }else{
            throw new IllegalArgumentException("O equipamento não pode ser nulo.");
        }
    }
}
