package school.lemon.changerequest.java.extendedinteger;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Integer representation with some additional features
 */
public class ExtendedInteger {
    private int value; // 1

    public ExtendedInteger(int value) {
        this.value = value; //2
    }


    /**
     * Check whether specified value is even
     *
     * @param value to check
     * @return true if value is even, false - otherwise
     */
    public static boolean isEven(int value) {
        return (Math.abs(value) % 2 == 0);//5
    }


    /**
     * Check whether specified value is odd
     *
     * @param value to check
     * @return true if value is odd, false - otherwise
     */
    public static boolean isOdd(int value) {
        return value % 2 != 0; //5
    }


    /**
     * Check whether specified value is prime
     *
     * @param value to check
     * @return true if value is prime, false - otherwise
     */
    public static boolean isPrime(int value) { //5
        if (value < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++)
            if (value % i == 0) {
                return false;
            }
        return true;
    }


    /**
     * Parse specified char array and create instance of {@code ExtendedInteger}
     *
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(char[] value) {
//Character.isDigit()
if (value.length == 0){return null;}
       /* Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(value ); */
        

        String string = new String(value);
        ExtendedInteger integer = new ExtendedInteger(new Integer(string));
        return integer;


        //TODO: implement me   8
    }

    /**
     * Parse specified string and create instance of {@code ExtendedInteger}
     *
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(String value) {
        if (value == ""){return null;}
        String string = new String(value);
        ExtendedInteger integer = new ExtendedInteger(new Integer(string));
        return integer;


        //ExtendedInteger.parseInt(value.toString());

// Character.Digit ()
        //TODO: implement me 9


    }

    /**
     * Get int representation of {@code ExtendedInteger}
     *
     * @return int representation
     */
    public int getValue() {
        return value;
    }  //3


    /**
     * Check whether current value is even
     *
     * @return true if value is even, false - otherwise
     */
    public boolean isEven() {
        return getValue() % 2 == 0; //4
    }


    /**
     * Check whether current value is odd
     *
     * @return true if value is odd, false - otherwise
     */
    public boolean isOdd() {
        return getValue() % 2 != 0; //4
    }

    /**
     * Check whether current value is prime
     *
     * @return true if value is prime, false - otherwise
     */
    public boolean isPrime() {
        return isPrime(getValue());//4
    }

    /**
     * Check whether current {@code ExtendedInteger} is equal to specified int value
     *
     * @return true if values are equal, false - otherwise
     */
    public boolean equals(int value) {
        return value == getValue(); //7
    }

    /**
     * Check whether current {@code ExtendedInteger} is equal to specified object
     *
     * @return true if values are equal, false - otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ExtendedInteger)) {
            return false;
        }

        ExtendedInteger obj1 = (ExtendedInteger) obj;
        return getValue() == obj1.value;//7
    }

}
