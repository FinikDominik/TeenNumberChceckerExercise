public class TeenNumberChecker {
    public static boolean hasTeen(int nr1, int nr2, int nr3){
        if (isTeen(nr1) || isTeen(nr2) || isTeen(nr3)) {
            System.out.println("One of the number is in range");
            return true;
        }
        System.out.println("One of the number is not in range");
        return false;
    }

    public static boolean isTeen(int nr1){
        if (nr1 >= 13 && nr1 <= 19) {
            return true;
        }
        return false;
    }
}