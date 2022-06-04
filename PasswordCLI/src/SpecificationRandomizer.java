/**
 * This class allows the user to choose one of the provided strings of characters and
 * return a random character from the chosen string
 */

public class SpecificationRandomizer {
    protected static String upperCaseString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    protected static String lowerCaseString = "abcdefghijklmnopqrstuvxyz";
    protected static String numericString = "0123456789";
    protected static String symbolString = "~!@#$%^&*()-+=<>?";

    protected static String getSpecificationString(String specification) {
        // create StringBuffer size of the specified string
        StringBuilder specificationSB = new StringBuilder(1);

        // generate a random number between
        // 0 to specification variable length
        int index = (int) (specification.length() * Math.random());

        specificationSB.append(specification.charAt(index));

        return specificationSB.toString();
    }
}