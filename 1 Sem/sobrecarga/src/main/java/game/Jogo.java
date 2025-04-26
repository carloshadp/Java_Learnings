package game;

public class Jogo {
    public static void main(String[] args){
        Personagem p1 = new Mago("Merlin", 100);
        Personagem p2 = new Guerreiro("Arthur", 120);

        p1.mover();
        p1.atacar();

        p2.mover();
        p2.atacar();
    }
}
