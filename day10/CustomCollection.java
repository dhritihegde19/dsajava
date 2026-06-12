package day10;
interface Remote<T>{
    void ternary(T data);
}
class GenStore<T> implements Remote<T>{
    T[] pack;
    @Override
    public void ternary(T data){
        int start=0;int end=pack.length;
        while(start<=end){
            int mid1=start+(end-start)/3;
            int mid2=end-(end-start)/3;
            if(pack[mid1].equals(data))
            {System.out.println(mid1);return;}
            if(pack[mid2].equals(data)){
                System.out.println(mid2);return;}
                String mOne=String.valueOf(pack[mid1]);
                String mTwo=String.valueOf(pack[mid2]);
                String dest=String.valueOf(data);
                if(dest.compareTo(mOne)<0)
                    end=mid1-1;
            }
        }
    }
    public class CustomCollection{
        public static void main(String[] args){
            GenStore<Double> rInt=new GenStore<Double>();
            rInt.pack=new Double[]{(double) 7,2,12,3,27,1,91,4,160.1};
            rInt.ternary(160.1);
        }
    }