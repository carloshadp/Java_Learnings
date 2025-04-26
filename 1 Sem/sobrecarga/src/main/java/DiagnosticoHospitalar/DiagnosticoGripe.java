package DiagnosticoHospitalar;

public class DiagnosticoGripe extends Diagnostico{
    public DiagnosticoGripe(String[] sintomasComuns){
        super(sintomasComuns);
    }

    @Override
    public void avaliarPaciente(String[] sintomasInformados){
        int media = sintomasComuns.length / 2;
        int qtdSintomas = 0;

        for (var informe : sintomasInformados){
            for(var sintoma: sintomasComuns){
                if (informe.equals(sintoma)){
                    qtdSintomas+=1;
                }
            }
        }

        if (qtdSintomas > media){
            System.out.println("\nAfirmativo para Gripe! Repouse e va ao medico!");
        } else{
            System.out.println("\nProbabilidade baixa de Gripe\nFaca novamente o diagnostico\npara um resultado mais preciso\ncaso de novamente probabilidade baixa,\nmuito provavel de nao estar com Gripe.\nSintomas: "+qtdSintomas+ " Media- "+media);
        }
    }
}

