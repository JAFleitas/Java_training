package Logica;

public class Charmander extends Pokemon implements IFire{
    public Charmander() {
    }

    @Override
    public void attackFireFist() {
        System.out.println("Charmander esta usando FireFist");
    }

    @Override
    public void attackFlamethrower() {
        System.out.println("Charmander esta usando Flamethrower");

    }

    @Override
    public void attackEmbers() {
        System.out.println("Charmander esta usando Embers");

    }

    @Override
    public void attackTackle() {
        System.out.println("Charmander esta usando Tackle");

    }

    @Override
    public void attackStratch() {
        System.out.println("Charmander esta usando Stratch");

    }

    @Override
    public void attackBitten() {

        System.out.println("Charmander esta usando Bitten");
    }
}
