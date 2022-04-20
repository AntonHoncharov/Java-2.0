package src.lessonSix;

public class CarTwo extends Transport implements MaxDistance {

    private int releaseDateCarTwo = 2014;
    private double fuelTankVolumeCarTwo = 70;
    private double fuelConsumptionCarTwo = 12.5;

    public int getReleaseDateCarTwo() {
        return releaseDateCarTwo;
    }

    public double getFuelTankVolumeCarTwo() {
        return fuelTankVolumeCarTwo;
    }

    public double getFuelConsumptionCarTwo() {
        return fuelConsumptionCarTwo;
    }

    public CarTwo() {
    }

    public CarTwo(String name, String color, int releaseDate, double fuelTankVolume, double fuelConsumption) {
        super(name, color, releaseDate, fuelTankVolume, fuelConsumption);
    }

    public void maxDistance(double fuelConsumption, double fuelTankVolume) {
        double maxDistance = fuelConsumption / fuelTankVolume * 100;
        System.out.println(maxDistance);
    }

    @Override
    public String toString() {
        return " " +
                "release date = " + releaseDateCarTwo +
                ", fuel tank volume = " + fuelConsumptionCarTwo +
                ", fuel consumption = " + fuelConsumptionCarTwo;
    }
}
