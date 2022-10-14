public class taskten {
    public static void main(String[] args){
        System.out.println(absmath(5,2,1));
    }

    public static boolean absmath(int a, int b, int c){
        int sum = a;
        for (int i = 0; i != b; i++){
            sum+= a;
            a = sum;
        }
        if (sum % 10 ==0) return true;
        else return false;
    }
}
