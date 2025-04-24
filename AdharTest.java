class AdharCard{
    long adharNumber;
    String name;
    String address;

    AdharCard(){
        this.adharNumber=582058606470L;
        this.name="shri";
        this.address="h.no - 11-366/139/201 new raghavendra colony";
    }

        }


public class AdharTest {
    public static void main(String[] args) {
        AdharCard a =new AdharCard();
        System.out.println(" "+a.adharNumber+" "+a.name+" "+a.address);

    }
}
