package school.lemon.changerequest.java.vehicles;

public final class VehicleFactory {

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
        ICarImpl iCar = new ICarImpl(manufacturedYear, make, model, horsepower);
        return iCar;


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
        IAirplaneImpl airplane = new IAirplaneImpl(manufacturedYear, make, model, maximumHeightFeet);
        return airplane;
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
        IBoatImpl boat = new IBoatImpl(manufacturedYear, make, model, motorized);


        return boat;
    }

}
