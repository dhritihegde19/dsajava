import java.util.List;
import java.util.Hashtable;

public class SlidingWindowMin{
    public static List<String> window(String[] c,String[] r){
        Hashtable<String,Integer> rTab=new Hashtable<>();
        Hashtable<String,Integer> cTab=new Hashtable<>();
        int mStart=0,start=0,end=0,mLen=Integer.MAX_VALUE;
        int count=0;
        for(String each:r)
            rTab.put(each,rTab.getOrDefault(each,0)+1);
        while(end<c.length){
            cTab.put(c[end],cTab.getOrDefault(c[end],0)+1);
            if(rTab.containsKey(c[end])) count++;
            while(count==rTab.size()){
                if(mLen>(end-start+1)){
                    mLen=end-start+1;
                    mStart=start;
                }
                String exists=c[start];
                if(cTab.containsKey(exists)){
                    cTab.put(exists,cTab.get(exists)-1);
                    if(cTab.get(exists)<rTab.getOrDefault(mLen, count))
                }
            }
        }

        
    }
    
}
