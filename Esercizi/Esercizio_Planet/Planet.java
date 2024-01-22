package Esercizio_Planet;

public class Planet {
    private String name;
    private double mass;
    private double volume;
    private double density;
    private double radius;
    private boolean life;
    private long population;
    private boolean gasGiant;
    private int satellites;
    private double albedo;

    public Planet(String name, double mass, double volume, double density, double radius, boolean life, long population, boolean gasGiant, int satellites, double albedo) {
        this.name = name;
        this.mass = mass;
        this.volume = volume;
        this.density = density;
        this.radius = radius;
        this.life = life;
        this.population = population;
        this.gasGiant = gasGiant;
        this.satellites = satellites;
        this.albedo = albedo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public boolean isGasGiant() {
        return gasGiant;
    }

    public void setGasGiant(boolean gasGiant) {
        this.gasGiant = gasGiant;
    }

    public int getSatellites() {
        return satellites;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public double getAlbedo() {
        return albedo;
    }

    public void setAlbedo(double albedo) {
        this.albedo = albedo;
    }

    public double getGravitationalAcceleration(double g) {
        return g * mass / Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", volume=" + volume +
                ", density=" + density +
                ", radius=" + radius +
                ", life=" + life +
                ", population=" + population +
                ", gasGiant=" + gasGiant +
                ", satellites=" + satellites +
                ", albedo=" + albedo +
                '}';
    }
}

