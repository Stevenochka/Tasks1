public class taskfour {
    public static void main(String[] args){
        System.out.println(profitableGamble(0.9,3,2));
    }
    public static boolean profitableGamble(double a, double b, double c){
        if ((a * b) > c) return true;
        else return false;
    }
}
