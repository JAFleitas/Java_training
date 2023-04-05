package Logica;

public abstract class Pokemon {
    protected int pokedexNum;
    protected String name;
    protected double weight;
    protected String gender;
    protected int seasonNum;

    public Pokemon() {
    }

    public Pokemon(int pokedexNum, String name, double weight, String gender, int seasonNum) {
        this.pokedexNum = pokedexNum;
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.seasonNum = seasonNum;
    }

    public abstract void attackTackle();

    public abstract void attackStratch();

    public abstract void attackBitten();
}

