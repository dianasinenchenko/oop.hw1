package school.lemon.changerequest.java.vehicles;

/**
 * Created by Diana on 15.12.2016.
 */
public class IVehicleImpll implements IVehicle {
    private int manufacturedYear;
    private String make;
    private String model;

    public IVehicleImpll (int manufacturedYear, String make, String model){
        this.manufacturedYear = manufacturedYear;
        this.make = make;
        this.model = model;
    }
    /**
     * Get vehicle manufactured year
     *
     * @return manufactured year
     */
    @Override
    public int getManufacturedYear() {
        return manufacturedYear;
    }

    /**
     * Set vehicle manufactured year
     *
     * @param year manufactured year
     */
    @Override
    public void setManufacturedYear(int year) {
        this.manufacturedYear = year;

    }

    /**
     * Get vehicle manufacturer
     *
     * @return manufacturer
     */
    @Override
    public String getMake() {
        return make;
    }

    /**
     * Set vehicle manufactured year
     *
     * @param make manufacturer
     */
    @Override
    public void setMake(String make) {
        this.make = make;

    }

    /**
     * Get vehicle model
     *
     * @return vehicle model
     */
    @Override
    public String getModel() {
        return model;
    }

    /**
     * Set vehicle model
     *
     * @param model of vehicle
     */
    @Override
    public void setModel(String model) {
        this.model = model;

    }

    @Override
    public int equals() {
        return 0;
    }

    /**
     * @return for cars: "fire pistons, turn wheels"
     * for boats: "jet water"
     * for airplanes: "fire engines on wings"
     */
    @Override
    public String accelerate() {
        return null;
    }

    /**
     * @return for cars: "turn wheels left"
     * for boats: "turn tiller left"
     * for airplanes: "lift wing flaps to turn left"
     */
    @Override
    public String steerLeft() {
        return null;
    }

    /**
     * @return for cars: "turn wheels right"
     * for boats: "turn tiller right"
     * for airplanes: "lift wing flaps to turn right"
     */
    @Override
    public String steerRight() {
        return null;
    }
}
