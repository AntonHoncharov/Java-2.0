package src.lessonSix;

public class Transport extends Go {
    private String name;
    private String color;
    private int releaseDate;
    private double fuelTankVolume;
    private double fuelConsumption;

    public Transport(String name, String color, int releaseDate, double fuelTankVolume, double fuelConsumption) {
        this.name = name;
        this.color = color;
        this.releaseDate = releaseDate;
        this.fuelTankVolume = fuelTankVolume;
        this.fuelConsumption = fuelConsumption;
    }

    public Transport() {
    }
}
