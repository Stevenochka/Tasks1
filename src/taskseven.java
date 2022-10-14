public class taskseven {
    public static void main(String[] args){
        System.out.println(addUpTo(7));
    }

    public static int addUpTo(int x){
        int summ = 0;
        for (int s = 1; s < x + 1; s++)
            summ = summ + s;
        return summ;
    }
}
