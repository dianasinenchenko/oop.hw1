package school.lemon.changerequest.java.extendedinteger

import spock.lang.Specification
import spock.lang.Unroll

class TestExtendedInteger extends Specification {

    @Unroll
    def "Static is even #value"() {
        expect:
        ExtendedInteger.isEven(value) == isEven

        where:
        value | isEven
        -2    | true
        -1    | false
        0     | true
        1     | false
        2     | true
    }

    @Unroll
    def "Static is odd #value"() {
        expect:
        ExtendedInteger.isOdd(value) == isOdd

        where:
        value | isOdd
        -2    | false
        -1    | true
        0     | false
        1     | true
        2     | false
    }

    @Unroll
    def "Static is prime #value"() {
        expect:
        ExtendedInteger.isPrime(value) == isOdd

        where:
        value | isOdd
        -1    | false
        0     | false
        1     | false
        2     | true
        3     | true
        4     | false
        5     | true
        7     | true
        21    | false
    }

    @Unroll
    def "Parse int from char array: #intValue"() {
        expect:
        ExtendedInteger.parseInt(valueToParse.toCharArray()).getValue() == intValue

        where:
        valueToParse | intValue
        "-123"       | -123
        "-12"        | -12
        "-1"         | -1
        "0"          | 0
        "1"          | 1
        "12"         | 12
        "+123"       | 123
    }

    @Unroll
    def "Parse int from string: #intValue"() {
        expect:
        ExtendedInteger.parseInt(valueToParse).getValue() == intValue

        where:
        valueToParse | intValue
        "-123"       | -123
        "-12"        | -12
        "-1"         | -1
        "0"          | 0
        "1"          | 1
        "12"         | 12
        "+123"       | 123
    }

    @Unroll
    def "Is even #value"() {
        given:
        def extendedInteger = new ExtendedInteger(value)

        expect:
        extendedInteger.isEven() == isEven

        where:
        value | isEven
        -2    | true
        -1    | false
        0     | true
        1     | false
        2     | true
    }

    @Unroll
    def "Is odd #value"() {
        given:
        def extendedInteger = new ExtendedInteger(value)

        expect:
        extendedInteger.isOdd() == isOdd

        where:
        value | isOdd
        -2    | false
        -1    | true
        0     | false
        1     | true
        2     | false
    }

    @Unroll
    def "Is prime #value"() {
        given:
        def extendedInteger = new ExtendedInteger(value)

        expect:
        extendedInteger.isPrime() == isOdd

        where:
        value | isOdd
        -1    | false
        0     | false
        1     | false
        2     | true
        3     | true
        4     | false
        5     | true
        7     | true
        21    | false
    }

    @Unroll
    def "equals should return #expectedResult for #extendedInteger and #intValue"() {
        expect:
        extendedInteger.equals(intValue) == expectedResult

        where:
        extendedInteger          | intValue || expectedResult
        new ExtendedInteger(10)  | -1       || false
        new ExtendedInteger(9)   | 0        || false
        new ExtendedInteger(13)  | 13       || true
        new ExtendedInteger(13)  | 17       || false
        new ExtendedInteger(-7)  | 0        || false
        new ExtendedInteger(-10) | 10       || false
        new ExtendedInteger(-3)  | -3       || true
        new ExtendedInteger(0)   | 0        || true
    }

    @Unroll
    def "equals should return #expectedResult for #ei1 and #ei2"() {
        expect:
        ei1.equals(ei2) == expectedResult
        where:

        ei1                      | ei2                     || expectedResult
        new ExtendedInteger(10)  | new ExtendedInteger(-1) || false
        new ExtendedInteger(9)   | new ExtendedInteger(0)  || false
        new ExtendedInteger(13)  | new ExtendedInteger(13) || true
        new ExtendedInteger(13)  | new ExtendedInteger(17) || false
        new ExtendedInteger(23)  | null                    || false
        new ExtendedInteger(-27) | new Object()            || false
        new ExtendedInteger(-7)  | new ExtendedInteger(0)  || false
        new ExtendedInteger(-10) | new ExtendedInteger(10) || false
        new ExtendedInteger(-3)  | new ExtendedInteger(-3) || true
        new ExtendedInteger(0)   | new ExtendedInteger(0)  || true
    }

    @Unroll
    def "Parse invalid int from char array: #valueToParse"() {
        expect:
        ExtendedInteger.parseInt(valueToParse.toCharArray()) == null

        where:
        valueToParse << ["-12.3", "-12a", "a-1", "asd", "", "s123"]
    }

    @Unroll
    def "Parse invalid int from string: #valueToParse"() {
        expect:
        ExtendedInteger.parseInt(valueToParse) == null

        where:
        valueToParse << ["-12.3", "-12a", "a-1", "asd", "", "s123"]
    }
}
