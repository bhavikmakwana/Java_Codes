

public class HighestLowest {

    public static void main(String[] args) {
    int min,max,mindex=0,maxdex =0;
    int num[] = {1,23,54,50,32,65,63,95,3,2};
    min = num[0];
    max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]> max) {
                max = num[i];
                maxdex= i;
            } else if(num[i]<min) {
               min = num[i];
               mindex = i;
            }
        }
        System.out.println("The Highest value is : "+max+" At Index :"+maxdex );
        System.out.println("The Lowest value is : "+min+" At Index :"+mindex );
    }

}
