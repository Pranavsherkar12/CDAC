public class WideningToVariousTypes {
    public static void main(String[] args) {
        int intValue = 25;

        double doubleValue = intValue;
        System.out.println("Widening from int to double: " + doubleValue);

        float floatValue = intValue;
        System.out.println("Widening from int to float: " + floatValue);

        boolean booleanValue = intValue != 0;  
        System.out.println("Conversion from int to boolean: " + booleanValue);

        String stringValue = Integer.toString(intValue);
        System.out.println("Conversion from int to String: " + stringValue);
    }
}
