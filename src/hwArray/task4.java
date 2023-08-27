package hwArray;

public class task4 {
    public static void main(String[] args) {
        int[][] nums = {
                {10,11,12,13,15},
                {5,6,7,8,20}
            };
        int sumev=0;
        int sumod=0;

        for (int row=0; row<2; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] % 2 == 0) {
                    sumev = sumev + nums[row][col];
                }
            }
        }

                for (int row = 0; row < 2; row++) {
                    for (int col = 0; col < nums[row].length; col++) {
                        if (nums[row][col] % 2 != 0) {
                            sumod = sumod + nums[row][col];
                        }
                    }
                }
                    System.out.println(sumev);
                    System.out.println(sumod);
                }
            }


