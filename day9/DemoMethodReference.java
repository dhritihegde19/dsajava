package day9;

import java.util.Arrays;
import java.util.List;

public class DemoMethodReference {
    public static void main(String[] args){
        List<String>skills=Arrays.asList("Spring","Django","Cypress","Jinja","NUnit","active");
        //System.out.println(skills);
        //skills.forEach(skill->System.out.println(skill))
        //method ref
        skills.sort(String::compareTo);
        skills.forEach(System.out::println);
        //
        pojoRefer();
    }
    public static void pojoRefer(){
        List<Product>items=Arrays.asList(
            new Product("SSD",5600),
            new Product("Pendrive",800));
            items.forEach(System.out::println);
            items.sort(Comparator.comparing(Product::getItemName)
        items.forEach(System.out::println);)
        }
}
