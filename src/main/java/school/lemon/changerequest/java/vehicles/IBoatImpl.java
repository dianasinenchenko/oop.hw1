package school.lemon.changerequest.java.vehicles;

/**
 * Created by Diana on 15.12.2016.
 */
public class IBoatImpl extends IVehicleImpll implements IBoat {
    private boolean motorized;

    public IBoatImpl(int manufacturedYear, String make, String model, boolean motorized) {
        super(manufacturedYear, make, model);
        this.motorized = motorized;
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
    public String toString() {
        return String.format("This boat is a %1$d %2$s %3$s ", super.getManufacturedYear(), super.getMake(), super.getModel(), isMotorized() == true ? "(with motor)." : ".");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof IBoatImpl)) {
            return false;
        }
        IBoatImpl iBoat = (IBoatImpl) object;


        return motorized == iBoat.motorized;
    }

    /**
     * Is boat motorized
     *
     * @return true if motorized, false - otherwise
     */
    @Override
    public boolean isMotorized() {
        return motorized == true;
    }

    /**
     * Specify whether boat is motorized
     *
     * @param motorized whether boat is motorized or not
     */
    @Override
    public void setMotorized(boolean motorized) {
        this.motorized = motorized;

    }

    /**
     * @return for cars: "fire pistons, turn wheels"
     * for boats: "jet water"
     * for airplanes: "fire engines on wings"
     */
    @Override
    public String accelerate() {
        return "jet water";
    }

    /**
     * @return for cars: "turn wheels left"
     * for boats: "turn tiller left"
     * for airplanes: "lift wing flaps to turn left"
     */
    @Override
    public String steerLeft() {
        return "turn tiller left";
    }

    /**
     * @return for cars: "turn wheels right"
     * for boats: "turn tiller right"
     * for airplanes: "lift wing flaps to turn right"
     */
    @Override
    public String steerRight() {
        return "turn tiller right";
    }
}
