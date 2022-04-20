package src.lessonSix;

public class CarOne extends Transport implements MaxDistance {

    private int releaseDateCarOne = 2002;
    private double fuelTankVolumeCarOne = 60;
    private double fuelConsumptionCarOne = 7.5;

    public int getReleaseDateCarOne() {
        return releaseDateCarOne;
    }

    public double getFuelTankVolumeCarOne() {
        return fuelTankVolumeCarOne;
    }

    public double getFuelConsumptionCarOne() {
        return fuelConsumptionCarOne;
    }

    public CarOne() {
    }

    public CarOne(String name, String color, int releaseDate, double fuelTankVolume, double fuelConsumption) {
        super(name, color, releaseDate, fuelTankVolume, fuelConsumption);
    }

    public void maxDistance(double fuelConsumption, double fuelTankVolume) {
        double maxDistance = fuelConsumption / fuelTankVolume * 100;
        System.out.println(maxDistance);
    }

    @Override
    public String toString() {
        return " " +
                "release date = " + releaseDateCarOne +
                ", fuel tank volume = " + fuelTankVolumeCarOne +
                ", fuel consumption = " + fuelConsumptionCarOne;
    }
}

