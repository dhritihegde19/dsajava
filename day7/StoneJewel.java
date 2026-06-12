import java.util.HashSet;

public class StoneJewel{
    public static int findCount(String jw,String st){
        HashSet<Character> jSet=new HashSet<>();
        for(char each: jw.toCharArray()) jSet.add(each);
        int count=0;
        for(char each:st.toCharArray()){
            if(jSet.contains(each)) count++;
        }
        return count++;
    }
    public static void main(String[] args){
        String jewels="aA",stones="aAAbb";
        System.out.println(findCount(jewels,stones));
    }
}

