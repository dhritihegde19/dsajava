package day9;
class Product{
    String itemName;
    public Product(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    int itemPrice;
    @Override
    public String toString(){
        return itemName+"="+itemPrice+"\n";
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
public class DemoLambda{
    public static void pojoLambda(){
        Product p1=new Product();
        p1.itemName="HP Pavillion";p1.itemPrice=45000;
        Product p2=new Product();
        p2.itemName="Mac Book";p2.itemPrice=120000;
        Product p3=new Product();
        p3.itemName="Dell Vostro";p3.itemPrice=610000;
        List<List<Integer>>





        public static void main(String[] args){
            List<Integer>alpha=new ArrayList<>();
            alpha.add(34);alpha.add(78);alpha.add(46);
            alpha.add(12);
            System.out.println(alpha);
            Collection.sort(alpha,(i1,i2)->i2-i1);
            System.out.println(alpha);
            pojoLambda();
        }
    }
}
