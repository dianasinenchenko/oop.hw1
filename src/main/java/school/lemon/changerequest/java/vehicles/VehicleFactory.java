package school.lemon.changerequest.java.vehicles;

public final class VehicleFactory {


    private static boolean motorized;
    private static int maximumHeightFeet;
    private static int horsepower;
    private static int manufacturedYear;
    private static String make;
    private static String model;

    private VehicleFactory() {


    }

    /**
     * Creates car
     *
     * @param manufacturedYear manufactured year
     * @param make             manufacturer
     * @param model            of car
     * @param horsepower       of car
     * @return instance of car
     */
    public static ICar createCar(int manufacturedYear, String make, String model, int horsepower) {
        VehicleFactory.manufacturedYear = manufacturedYear;
        VehicleFactory.horsepower = horsepower;
        VehicleFactory.make = make;
        VehicleFactory.model = model;


        // TODO: please implement me

        return null;


    }


    /**
     * Creates airplane
     *
     * @param manufacturedYear  manufactured year
     * @param make              manufacturer
     * @param model             of airplane
     * @param maximumHeightFeet of airplane
     * @return instance of airplane
     */
    public static IAirplane createAirplane(int manufacturedYear, String make, String model, int maximumHeightFeet) {
        VehicleFactory.manufacturedYear = manufacturedYear;
        VehicleFactory.maximumHeightFeet = maximumHeightFeet;
        VehicleFactory.make = make;
        VehicleFactory.model = model;


        // TODO: please implement me
        return null;
    }

    /**
     * Creates boat
     *
     * @param manufacturedYear manufactured year
     * @param make             manufacturer
     * @param model            of boat
     * @param motorized        is boat motorized
     * @return instance of boat
     */
    public static IBoat createBoat(int manufacturedYear, String make, String model, boolean motorized) {
        VehicleFactory.motorized = motorized;
        VehicleFactory.manufacturedYear = manufacturedYear;
        VehicleFactory.make = make;
        VehicleFactory.model = model;

        // TODO: please implement me
        return null;
    }

}
