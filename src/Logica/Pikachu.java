package Logica;

public class Pikachu extends Pokemon implements IElectric {

    public Pikachu() {
    }

    @Override
    public void attackThunderFist() {
        System.out.println("Pikachu esta usando ThunderFist");
    }

    @Override
    public void attackThundershock() {
        System.out.println("Pikachu esta usando Thundershock");
    }

    @Override
    public void attackTackle() {
        System.out.println("Pikachu esta usando Tackle");
    }

    @Override
    public void attackStratch() {
        System.out.println("Pikachu esta usando Stratch");
    }

    @Override
    public void attackBitten() {
        System.out.println("Pikachu esta usando Bitten");
    }
}
