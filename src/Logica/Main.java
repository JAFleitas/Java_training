package Logica;

public class Main {
    public static void main(String[] args) {
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        pikachu.attackThundershock();
        charmander.attackFlamethrower();
        bulbasaur.attackRazorblades();
        squirtle.attackHydropump();
    }
}
