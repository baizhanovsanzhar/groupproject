package hwArray;

public class task10 {
    public static void main(String[] args) {
        int[] fibs = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        int first=fibs[0];

        for(int a:fibs){
            if(a==first){
                first=a;
            }
        }
        System.out.println("the duplicate element is "+first);
    }
}
