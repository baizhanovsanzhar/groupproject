package hwArray;

public class task8 {
    public static void main(String[] args) {
        System.out.println("The first 10 numbers of Fibonacci series are ");
        int[] fibs = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        int maximum=fibs[0];
        int minimum=fibs[9];

        for(int a:fibs){
            if(a>maximum){
                maximum=a;
            }
        }
        for (int b:fibs){
            if(b<minimum){
                minimum=b;
            }
        }
        System.out.println("the maximum number in the array is "+maximum);
        System.out.println("the minimum number in the array is " +minimum);
    }
}
