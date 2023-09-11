public abstract class StringValidator {
    public static boolean isValidEmail(String email) {
        return email.matches("[a-zA-Z0-9_.\\-]+@[a-zA-Z0-9_.\\-]+.[a-zA-Z]{2,6}");
    }
    public  static boolean isValidIP(String ip) {
        return ip.matches("((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9]).){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])");
    }
}
