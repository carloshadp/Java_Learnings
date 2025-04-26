package DiagnosticoHospitalar;

public abstract class Diagnostico {
    protected String[] sintomasComuns;

    public Diagnostico(String[] sintomasComuns){
        this.sintomasComuns = sintomasComuns;
    }


    public void exibirSintomasComuns(){
        System.out.println("\nSINTOMAS COMUNS");
        for (var sintoma : sintomasComuns){
            System.out.println(" -"+sintoma);
        }
    }
    public abstract void avaliarPaciente(String[] sintomasInformados);
}
