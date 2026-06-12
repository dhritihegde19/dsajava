class Patient{
    private String name;
    private int age;
    private String gender;
    private double weight,height,bmi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
    @Override
    public String toString(){
        return "Patient [name=0" + name +", age=" + age + ",gender=" + gender;
    }
    
}
public class HealthMetrix{
    public static void Calculate(int age,double bmi){
        System.out.println("Body Age");
        if(bmi<18.5)System.out.println(age+2);
        else if(bmi>25)System.out.println(age+5);
        else System.out.println(age);
    }
    public static void Calculate(double bmi,int age,String gender){
        System.out.println("Fat Rate");
        if(gender.equals("male"))
            System.out.println((1.20*bmi)+(0.23*age)-16.2);
        else
            System.out.println((1.20*bmi)+(0.23*age)-5.4);
    }
    public static void Calculate(Patient object){
        System.out.println(object.getName()+" "+"BMI");
        object.setHeight(object.getHeight()/100);
        object.setBmi(object.getWeight()/
        (object.getHeight()*object.getHeight()));
        System.out.println(object.getBmi());
        Calculate(object.getAge(),object.getBmi());
        Calculate(object.getBmi(),object.getAge(),object.getGender());
    }
        public static void main (String[] args){
        Patient patient1=new Patient();
        patient1.setName("Dhriti");
        patient1.setAge(21);
        patient1.setGender("female");
        patient1.setWeight(56);
        patient1.setHeight(158);
        Calculate(patient1);
        Patient patient2=new Patient();
        patient2.setName("Deepti");
        patient2.setAge(20);
        patient2.setGender("female");
        patient2.setWeight(45);
        patient2.setHeight(152);
        Calculate(patient2);
        }
    }