public class taskthree {
    public static void main(String[] args){
        System.out.println(animals(5,2,8));
    }
    /* chiken = 2legs
    cows = 4 legs
    pigs = 4 legs */

    public static int animals(int a, int b, int c){
        return a * 2 + b * 4 + c * 4;
    }
}
