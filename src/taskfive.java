public class taskfive {
    public static void main(String[] args){
        operation(2,4,8);
    }
    public static String operation(int a, int b, int c){
        int bb =0;
        if (a+b == c) {
            System.out.println("added ");
            bb+=1;
        }
        if (a-b == c) {
            System.out.println("subtracted ");
            bb+=1;
        }
        if (a*b == c) {
            System.out.println("multiply ");
            bb+=1;
        }
        if (a/b == c) {
            System.out.println("demultiply ");
            bb+=1;
        }
        if (bb == 0) System.out.println("none");
        return "";
    }
}
