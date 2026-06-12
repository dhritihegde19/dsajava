import java.util.logging.Logger;
import java.util.Scanner;
public class DemoLogs{
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    Logger logger=Logger.getLogger(DemoLogs.class.getName());
    String[] recruiters={"Google","DLithe","Cognizant","Accenture","ZOHO"};
    int day=0;
    System.out.println("Enter the day to get name of the comapny");
    day=scanner.nextInt();day--;
    logger.info("Requested day"+day);
    System.out.println(recruiters[day]);

    //KYC kyc=KYC.getKyc();
    //kyc.name="Razak";kyc.contact=876545677656L;
}
}
//singleTon
class KYC{
    String name;long contact;
    private static KYC kyc=new KYC();
    public static KYC getKyc(){
        return kyc;
    }
    private KYC() {}
}
