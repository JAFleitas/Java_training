package Logica;

public class Bulbasaur extends Pokemon implements IPlant {
    public Bulbasaur() {
    }

    @Override
    public void attackAbsorb() {
        System.out.println("Bulbasaur esta usando Absorb");
    }

    @Override
    public void attackRazorblades() {
        System.out.println("Bulbasaur esta usando Razorblades");
    }

    @Override
    public void attackTackle() {
        System.out.println("Bulbasaur esta usando Tackle(");
    }

    @Override
    public void attackStratch() {
        System.out.println("Bulbasaur esta usando Stratch");
    }

    @Override
    public void attackBitten() {
        System.out.println("Bulbasaur esta usando Bitten");
    }
}
