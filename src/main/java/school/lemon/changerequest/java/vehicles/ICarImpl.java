package school.lemon.changerequest.java.vehicles;

/**
 * Created by Diana on 15.12.2016.
 */
public class ICarImpl extends IVehicleImpl implements ICar {
    private int horsepower;

    public ICarImpl(int manufacturedYear, String make, String model, int horsepower) {
        super(manufacturedYear, make, model);

        this.horsepower = horsepower;
    }

    /**
     * Get car horsepower
     *
     * @return horsepower
     */
    @Override
    public int getHorsepower() {
        return horsepower;
    }

    /**
     * Set car horsepower
     *
     * @param horsepower of the car
     */
    @Override
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;

    }

    @Override
    public String toString() {
        return String.format("This car is a %1$d %2$s %3$s with %4$d hp.", getManufacturedYear(), getMake(), getModel(), getHorsepower());
    }

    @Override
    public boolean equals(Object object)
    {
        if (object==null){return false;}
        if (!(object instanceof ICarImpl)){return false;}
        ICarImpl iCar = (ICarImpl)object;


        return Math.abs(horsepower-iCar.getHorsepower())<=10;
    }

    /**
     * Get vehicle manufactured year
     *
     * @return manufactured year
     */
    @Override
    public int getManufacturedYear() {

        return 0;
    }

    /**
     * Set vehicle manufactured year
     *
     * @param year manufactured year
     */
    @Override
    public void setManufacturedYear(int year) {


    }

    /**
     * Get vehicle manufacturer
     *
     * @return manufacturer
     */
    @Override
    public String getMake() {
        return null;
    }

    /**
     * Set vehicle manufactured year
     *
     * @param make manufacturer
     */
    @Override
    public void setMake(String make) {

    }

    /**
     * Get vehicle model
     *
     * @return vehicle model
     */
    @Override
    public String getModel() {
        return null;
    }

    /**
     * Set vehicle model
     *
     * @param model of vehicle
     */
    @Override
    public void setModel(String model) {

    }

    /**
     * @return for cars: "fire pistons, turn wheels"
     * for boats: "jet water"
     * for airplanes: "fire engines on wings"
     */
    @Override
    public String accelerate() {
        return "fire pistons, turn wheels";
    }

    /**
     * @return for cars: "turn wheels left"
     * for boats: "turn tiller left"
     * for airplanes: "lift wing flaps to turn left"
     */
    @Override
    public String steerLeft() {
        return "turn wheels left";
    }

    /**
     * @return for cars: "turn wheels right"
     * for boats: "turn tiller right"
     * for airplanes: "lift wing flaps to turn right"
     */
    @Override
    public String steerRight() {
        return "turn wheels right";
    }
}
