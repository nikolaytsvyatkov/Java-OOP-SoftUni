package Exams.viceCity.validators;

public class Validator {
    public static void checkName(String arg, String message) {
        if (arg == null || arg.trim().isEmpty()) {
            throw new NullPointerException(message);
        }
    }
    public static void checkIntegers(int art, String  message) {
        if (art < 0) {
            throw new IllegalArgumentException(message);
        }
    }
}
