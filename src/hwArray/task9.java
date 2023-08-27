package hwArray;

public class task9 {
    public static void main(String[] args) {
        int[] fibs = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        int smallest=fibs[0];
        

        for(int a:fibs){
            if(a>smallest && a<55){
                smallest=a;
            }
        }

        System.out.println("the second largest number in the array is "+smallest);

    }
}
