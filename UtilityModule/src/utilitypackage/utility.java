package utilitypackage;

public class utility {
    public static boolean validateString(String value) {
        return value != null && !value.trim().isEmpty();
    }
    public static boolean validateObject(Object obj) {
        return obj != null;
    }
}
