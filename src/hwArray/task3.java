package hwArray;

public class task3 {
    public static void main(String[] args) {
        int[][] nums = {
                {10,11,12,13,15},
                {5,6,7,8,20}
            };
        for (int row=0; row<nums.length; row++){
            for (int col=0; col<nums[row].length; col++){
                if(nums[row][col]%2==0){
                    System.out.print(nums[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
