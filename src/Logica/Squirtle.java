package Logica;

public class Squirtle extends Pokemon implements IWater{
    public Squirtle() {
    }

    @Override
    public void attackHydropump() {
        System.out.println("Squirtle esta usando Hydropump");
    }

    @Override
    public void attackBubble() {
        System.out.println("Squirtle esta usando Bubble");
    }

    @Override
    public void attackWatergun() {
        System.out.println("Squirtle esta usando Watergun");
    }

    @Override
    public void attackTackle() {
        System.out.println("Squirtle esta usando Tackle");
    }

    @Override
    public void attackStratch() {
        System.out.println("Squirtle esta usando Stratch");
    }

    @Override
    public void attackBitten() {
        System.out.println("Squirtle esta usando Bitten");
    }
}
