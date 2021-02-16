    abstract class Bank {
        abstract void getDetails();
    }
    class ICICI extends Bank {
        double rateOfInterest=4.9;
        String bankName="ICICI";
        void getDetails(){
            System.out.println("Rate of Interest of "+bankName+" is: "+rateOfInterest+"%");
        }
    }
    class BOI extends Bank {
        double rateOfInterest=5.9;
        String bankName="BOI";
        void getDetails(){
            System.out.println("Rate of Interest of "+bankName+" is: "+rateOfInterest+"%");
        }
    }
    class SBI extends Bank {
        double rateOfInterest=3.5;
        String bankName="SBI";
        void getDetails(){ System.out.println("Rate of Interest of "+bankName+" is: "+rateOfInterest+"%");
        }
    }
    public class Question11 {
        public static void main(String[] args) {
            Bank b;
            b=new SBI();
            b.getDetails();
            b=new BOI();
            b.getDetails();
            b=new ICICI();
            b.getDetails();
        }
}
