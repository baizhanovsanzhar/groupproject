package hwArray;

public class task1 {
    public static void main(String[] args){
        int [] temp={35,36,28,25,30,32,22};
        int highest=temp[1];
        int lowest=temp[6];
        for (int value:temp){
            if(value>=highest){
                highest=value;
            } else if (value<=lowest){
                lowest=value;
            }
        }
        System.out.println(highest);
        System.out.println(lowest);
    }
}
