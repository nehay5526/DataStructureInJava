
public class ReverseArray{

    public static void revArr(int[] ele){
            int len = ele.length-1;
        for(int i =0;i<ele.length/2;i++){
            int temp = ele[len];
            ele[len] = ele[i];
            ele[i] = temp;
            len--;
        }
         for(int i =0;i<ele.length;i++){
                   System.out.println(ele[i]);

        }
    }

    public static void main(String... args){
        int[] ele = {4,7,2,9,4,5,6};
        for(int i =0;i<ele.length;i++){
                   System.out.println(ele[i]);

        }
                System.out.println("hello prefix");

        ReverseArray.revArr(ele);

        System.out.println(ele);
        
    }
}