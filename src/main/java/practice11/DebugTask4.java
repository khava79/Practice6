package practice11;



public class DebugTask4 {
    //Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome("level"));

    }
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
