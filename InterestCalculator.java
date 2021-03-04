import java.util.Scanner;
public class Project3 {

	public static void main(String[] args) {
		while(true){
			System.out.println("Select the option:");
			
			System.out.println("1. Interest Calculator –SB");
			
			System.out.println("2. Interest Calculator –FD");
			
			System.out.println("3. Interest Calculator –RD");
			
			System.out.println("4. Exit");
			
			Scanner sc1 = new Scanner(System.in);
			
			int choice = sc1.nextInt();

			switch (choice) {
			
			case 1:
				SBAccount sb=new SBAccount();
				// Interest Calculator –SB
                System.out.println("Enter the Average SB amount ");
                double amount = sc1.nextDouble();
                System.out.println("Interest gained is : $ " + sb.calculateInterest(amount));
			
				break;
			
			case 2:
			
				// Interest Calculator –FD
                FDAccount fd = new FDAccount();
                System.out.println("Enter the FD Amount ");
                double fAmount = sc1.nextDouble();
                System.out.println("Interest gained is: $ " + fd.calculateInterest(fAmount));
				break;
			
			case 3:
			
				// Interest Calculator –RD
				RDAccount rd = new RDAccount();
                System.out.println("Enter the RD amount");
                double Ramount = sc1.nextDouble();
                System.out.println("Interest gained is: $ " + rd.calculateInterest(Ramount));
			
				break;
			
			case 4:
			
				System.exit(0);
			
				break;
			
			}

}

}

}

abstract class Account{

	double interestRate;

	double amount;
    double FDinterestRate;
    double FDAmount;
    double RDInterestRate;
    double RDamount;
    int noOfMonths;
    double monthlyAmount;
    double General, SCitizen;
    int noOfDays;
    double SBamount , SbInterestRate, interest;
    int ageOfACHolder;
	abstract double calculateInterest(double amount);

}
class FDAccount extends Account{

	int noOfDays;
	int ageOfACHolder;
	Scanner inp = new Scanner(System.in);
	double	calculateInterest(double amount){
		this.FDAmount=amount;
        System.out.println("Enter FD days : ");
        noOfDays = inp.nextInt();
        System.out.println("Enter FD age holder : ");
        ageOfACHolder = inp.nextInt();

        if (amount < 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14) {
                General = 0.0450;
                SCitizen = 0.0500;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                General = 0.0470;
                SCitizen = 0.0525;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                General = 0.0550;
                SCitizen = 0.0600;
            } else if (noOfDays >= 45 && noOfDays <= 60) {
                General = 0.0700;
                SCitizen = 0.0750;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                General = 0.0750;
                SCitizen = 0.0800;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                General = 0.0800;
                SCitizen = 0.0850;
            }
            FDinterestRate = (ageOfACHolder < 50) ? General : SCitizen;
        } else {
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = 0.065;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = 0.0675;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                interestRate = 0.00675;
            } else if (noOfDays >= 45 && noOfDays <= 60) {
                interestRate = 0.080;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = 0.0850;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = 0.10;
            }

        }

        return FDAmount * FDinterestRate;

	}

}

class SBAccount extends Account{
	Scanner SBScanner = new Scanner(System.in);
    double calculateInterest(double amount){
        this.SBamount = amount;
        System.out.println("Select account type \n1. NRI \n2. Normal ");
        int accountChoice = SBScanner.nextInt();
        switch (accountChoice) {
            case 1:
                SbInterestRate = .06;
                break;
            case 2:
                SbInterestRate = .04;
                break;
            default:
                System.out.println("Please choose right account again");
                
        }
     return amount * SbInterestRate;
   
}

}

class RDAccount extends Account{
	Scanner RDScanner = new Scanner(System.in);
    double calculateInterest(double Ramount){
        this.RDamount = Ramount;
        System.out.println("Enter RD months");
        noOfMonths = RDScanner.nextInt();
        System.out.println("Enter RD holder age");
        int age = RDScanner.nextInt();
        if (noOfMonths >= 0 && noOfMonths <= 6) {
            General = .0750;
            SCitizen = 0.080;
        } else if (noOfMonths >= 7 && noOfMonths <= 9) {
            General = .0775;
            SCitizen = 0.0825;
        } else if (noOfMonths >= 10 && noOfMonths <= 12) {
            General = .0800;
            SCitizen = 0.0850;
        } else if (noOfMonths >= 13 && noOfMonths <= 15) {
            General = .0825;
            SCitizen = 0.0875;
        } else if (noOfMonths >= 16 && noOfMonths <= 18) {
            General = .0850;
            SCitizen = 0.0900;
        } else if (noOfMonths >= 22) {
            General = .0875;
            SCitizen = 0.0925;
        }
        RDInterestRate = (age < 50) ? General : SCitizen;
        return RDamount * RDInterestRate;

    }

}

