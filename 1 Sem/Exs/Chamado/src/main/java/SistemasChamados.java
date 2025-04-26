import java.util.*;

public class SistemasChamados {
    private List<Chamado> chamadoList;

    public SistemasChamados(){
        this.chamadoList = new ArrayList<>();
    }

    public void adicionarChamado(Chamado chamado){
        chamadoList.add(chamado);
    }
    public Chamado buscarChamadoPorId(int id){
        for (Chamado chamado : chamadoList){
            if (chamado.getId() == id){
                return chamado;
            }
        }
        return null;
    }

    public void listarChamados(){
        for (Chamado chamado : chamadoList){
            System.out.println("ID: "+chamado.getId()+
                    "\nDescrição"+chamado.getDescricao()+
                    "\nStatus"+chamado.getStatus());
        }
    }
}
