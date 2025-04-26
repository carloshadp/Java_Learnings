package DiagnosticoHospitalar;

public class DiagnosticoCovid extends Diagnostico{
    public DiagnosticoCovid(String[] sintomasComuns){
        super(sintomasComuns);
    }

    @Override
    public void avaliarPaciente(String[] sintomasInformados){
        int media = sintomasComuns.length / 2;
        int qtdSintomas = 0;

        for (var sintoma : sintomasComuns){
            for(var informe: sintomasInformados){
                if (informe.equals(sintoma)){
                    qtdSintomas+=1;
                }
            }
        }

        if (qtdSintomas >= media){
            System.out.println("\nAfirmativo para Covid! Repouse e va ao medico!");
        } else{
            System.out.println("\nProbabilidade baixa de Covid\nFaca novamente o diagnostico\npara um resultado mais preciso\ncaso de novamente probabilidade baixa,\nmuito provavel de nao estar com Covid.\nSintomas:"+qtdSintomas);
        }
    }
}
