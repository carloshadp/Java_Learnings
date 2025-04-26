package DiagnosticoHospitalar;

public class Pricipal {
    public static void main(String[] args){
        Diagnostico covid = new DiagnosticoCovid(new String[]{"Falta de ar", "Tosse", "Fadiga"});
        Diagnostico gripe = new DiagnosticoGripe(new String[]{"Coriza", "Febre", "Dor"});

        covid.avaliarPaciente(new String[]{"Tosse", "Fadiga"});
        gripe.avaliarPaciente(new String[]{"Coriza"});
    }
}
