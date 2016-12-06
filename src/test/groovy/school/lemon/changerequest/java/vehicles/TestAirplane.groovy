package school.lemon.changerequest.java.vehicles

import spock.lang.Specification
import spock.lang.Unroll

import static school.lemon.changerequest.java.vehicles.VehicleFactory.createAirplane

class TestAirplane extends Specification {

    def "Get/Set manufactured year"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        when:
        airplane.setManufacturedYear(2007)

        then:
        airplane.getManufacturedYear() == 2007
    }

    def "Get/Set make"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        when:
        airplane.setMake("BMW")

        then:
        airplane.getMake() == "BMW"
    }

    def "Get/Set model"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        when:
        airplane.setModel("X6")

        then:
        airplane.getModel() == "X6"
    }

    def "Get/Set maximun height"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        when:
        airplane.setMaximumHeightFeet(9000)

        then:
        airplane.getMaximumHeightFeet() == 9000
    }

    def "To String"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        expect:
        airplane.toString() == "This airplane is a 2006 Boeing 747 that can reach 7000 feet."
    }

    def "Accelerate"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        expect:
        airplane.accelerate() == "fire engines on wings"
    }

    def "Steer left"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        expect:
        airplane.steerLeft() == "lift wing flaps to turn left"
    }

    def "Steer right"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        expect:
        airplane.steerRight() == "lift wing flaps to turn right"
    }

    @Unroll
    def "Equals should return #expectedResult for airplanes with maximumHeightFeet: #value1 and #value2"() {
        expect:
        createAirplane(2006, "Boeing", "747", value1).equals(createAirplane(2011, "Boeing1", "777", value2)) == expectedResult

        where:
        value1 | value2 || expectedResult
        7000   | 7000   || true
        6000   | 7000   || true
        7000   | 6000   || true
        6000   | 5999   || true
        6000   | 5000   || true
        6000   | 5555   || true
        6000   | 6555   || true
        6000   | 6999   || true
        6000   | 0      || false
        6000   | 4999   || false
        6000   | 7001   || false
        6000   | 65748  || false
        6000   | 1      || false
    }

}
