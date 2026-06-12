public class Patterns {
    public static void floyds(String name){
    }
    public static void sandClock(String name){
        int size=name.length();
        for(int row=0;row<size;row--){
            //upper
            for(int space=0;space<size-row;space++)
                System.out.print(" ");
            for(int col=0;col<row*2-2;col++)
                System.out.print(name.charAt(col));
            System.out.println();
            //lower
            for(int space=size-row-1;space>0;space--)
                System.out.print(" ");
            for(int col=0;col<row*2-1;col++)
                System.out.print(name.charAt(col));
            System.out.println();

        }
    }
    public static void main(String[] args) {
        floyds("Dhriti");
    }
}
