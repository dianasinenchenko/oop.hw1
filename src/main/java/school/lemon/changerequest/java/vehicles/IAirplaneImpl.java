package school.lemon.changerequest.java.vehicles;

/**
 * Created by Diana on 15.12.2016.
 */
public class IAirplaneImpl extends IVehicleImpll implements IAirplane {
    private int maximumHeightFeet;

    public IAirplaneImpl(int manufacturedYear, String make, String model, int maximumHeightFeet) {
        super(manufacturedYear, make, model);
        this.maximumHeightFeet = maximumHeightFeet;
    }


    @Override
    public String toString() {
        return String.format("This airplane is a %1$d %2$s %3$s that can reach %4$d feet.", super.getManufacturedYear(), super.getMake(), super.getModel(), getMaximumHeightFeet());
    }

    /**
     * Get vehicle manufactured year
     *
     * @return manufactured year
     */
    @Override
    public int getManufacturedYear() {
        return super.getManufacturedYear();
    }

    /**
     * Set vehicle manufactured year
     *
     * @param year manufactured year
     */
    @Override
    public void setManufacturedYear(int year) {
        super.setManufacturedYear(year);
    }

    /**
     * Get vehicle manufacturer
     *
     * @return manufacturer
     */
    @Override
    public String getMake() {
        return super.getMake();
    }

    /**
     * Set vehicle manufactured year
     *
     * @param make manufacturer
     */
    @Override
    public void setMake(String make) {
        super.setMake(make);
    }

    /**
     * Get vehicle model
     *
     * @return vehicle model
     */
    @Override
    public String getModel() {
        return super.getModel();
    }

    /**
     * Set vehicle model
     *
     * @param model of vehicle
     */
    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public boolean equals(Object object) {

        if (object == null) {
            return false;
        }
        if (!(object instanceof IAirplaneImpl)) {
            return false;
        }
        IAirplaneImpl iAirplane = (IAirplaneImpl) object;


        return Math.abs(maximumHeightFeet - iAirplane.getMaximumHeightFeet()) <= 1000;
    }

    /**
     * Get airplane maximum height
     *
     * @return airplane maximum height
     */
    @Override
    public int getMaximumHeightFeet() {
        return maximumHeightFeet;
    }

    /**
     * Set airplane maximum height
     *
     * @param maximumHeightFeet maximum height of the airplane
     */
    @Override
    public void setMaximumHeightFeet(int maximumHeightFeet) {
        this.maximumHeightFeet = maximumHeightFeet;
    }

    /**
     * @return for cars: "fire pistons, turn wheels"
     * for boats: "jet water"
     * for airplanes: "fire engines on wings"
     */
    @Override
    public String accelerate() {
        return "fire engines on wings";
    }

    /**
     * @return for cars: "turn wheels left"
     * for boats: "turn tiller left"
     * for airplanes: "lift wing flaps to turn left"
     */
    @Override
    public String steerLeft() {
        return "lift wing flaps to turn left";
    }

    /**
     * @return for cars: "turn wheels right"
     * for boats: "turn tiller right"
     * for airplanes: "lift wing flaps to turn right"
     */
    @Override
    public String steerRight() {
        return "lift wing flaps to turn right";
    }
}
