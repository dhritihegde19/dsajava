import java.util.Arrays;
public class PrefixPostfixRecurssion {
    public static void pre(int[] og,int[] prefix,int index){
        if(index==0){
            prefix[0]=og[0];
            return;
        }
        pre(og,prefix,index-1);
        prefix[index]=prefix[index-1]+og[index];
    }
    public static void post(int[] og,int[] postfix,int index){
        if(index==og.length-1){
            postfix[index]=og[index];
            return;
        }
        post(og,postfix,index+1);
        postfix[index]=postfix[index+1]+og[index];
    }
    public static void main(String[] args) {
        int[] arr={23,12,98,45,18,45,12,98};
        int[] SumPre=new int[arr.length];
        pre(arr,SumPre,arr.length-1);
        System.out.println("Prefix Sum");
        System.out.println(Arrays.toString(SumPre));
        int[] SumPost=new int[arr.length];
        post(arr,SumPost,0);
        System.out.println("Postfix Sum");
        System.out.println(Arrays.toString(SumPost));
    }
}
