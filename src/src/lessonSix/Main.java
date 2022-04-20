package src.lessonSix;

public class Main {
    public static void main(String[] args) {

        CarOne carOne = new CarOne();
        CarTwo carTwo = new CarTwo();

        CarOne audi = new CarOne(Characteristics.NAME_CAR_ONE.condition, Characteristics.COLOR_CAR_ONE.condition
                , carOne.getReleaseDateCarOne(), carOne.getFuelTankVolumeCarOne(), carOne.getFuelConsumptionCarOne());
        CarTwo ford = new CarTwo(Characteristics.NAME_CAR_TWO.condition, Characteristics.COLOR_CAR_TWO.condition
                , carTwo.getReleaseDateCarTwo(), carTwo.getFuelTankVolumeCarTwo(), carTwo.getFuelConsumptionCarTwo());

        System.out.println("Car one: name = " + Characteristics.NAME_CAR_ONE.condition + ", color = "
                + Characteristics.COLOR_CAR_ONE.condition + ", " + audi);
        System.out.println("Max distance: ");
        audi.maxDistance(carOne.getFuelTankVolumeCarOne(), carOne.getFuelConsumptionCarOne());
        audi.go();
        System.out.println("Car one: name = " + Characteristics.NAME_CAR_TWO.condition + ", color = "
                + Characteristics.COLOR_CAR_TWO.condition + ", " + ford);
        System.out.println("Max distance: ");
        ford.maxDistance(carTwo.getFuelTankVolumeCarTwo(), carTwo.getFuelConsumptionCarTwo());
        ford.go();

    }
}
