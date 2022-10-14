public class tasknine {
    public static void main(String[] args){
        System.out.println(sumOfCubes(new int []{1, 5, 9}));
    }

    public static int sumOfCubes(int[] x){
        int sum = 0;
        for (int s = 0; s < x.length; s++){
            sum += Math.pow(x[s],3);}
        return sum;
    }
}
