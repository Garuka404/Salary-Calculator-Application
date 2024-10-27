import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("|                   SALARY INFROMATION SYSTEM                   |");
        System.out.println("----------------------------------------------------------------");
        // System.out.println('\n');

        System.out.println("\n\t[1] Calculate Iincome Tax");
        System.out.println("\t[2] Calculate Annual Bonus");
        System.out.println("\t[3] Calculate Loan Amount");

        System.out.print("\nEnter the option to continue > ");
        int option=scan.nextInt();
        double bonus=0;  double Tax=0;
        if(option==1){

            System.out.println("\n\n------------------------------------------------------------");
            System.out.println("|                    Calculate Income Tax                   |");
            System.out.println("------------------------------------------------------------");
            System.out.println('\n');
            System.out.print("In put Employee name    - ");
            String name=scan.next();
            System.out.print("In put Employee Salary  - ");
            double salary= scan.nextDouble();

            if(salary<=100000){
                Tax=0;
            } else if (salary>100000 && salary<=141667) {
                Tax=((salary-100000)*6)/100;
            }
            else if (salary>141667 && salary<=183333){
                Tax=(41667*6)/100;
                Tax=Tax+((salary-141667)*12)/100;

            }else if (salary>183333 && salary<=225000) {
                Tax=(41667*6)/100;
                Tax=Tax+(41667*12)/100;
                Tax=Tax+((salary-183333)*18)/100;
            }
            else if (salary>225000 && salary<=266667){
                Tax=(41667*6)/100;
                Tax=Tax+(41667*12)/100;
                Tax=Tax+(41667*18)/100;
                Tax=Tax+((salary-225000)*24)/100;
            }
            else if (salary>266667 && salary<=308333) {
                Tax=(41667*6)/100;
                Tax=Tax+(41667*12)/100;
                Tax=Tax+(41667*18)/100;
                Tax=Tax+(41667*24)/100;
                Tax=Tax+((salary-266667)*30)/100;
            }else if (salary>308333 ) {
                Tax=(41667*6)/100;
                Tax=Tax+(41667*12)/100;
                Tax=Tax+(41667*18)/100;
                Tax=Tax+(41667*24)/100;
                Tax=Tax+(41667*30)/100;
                Tax=Tax+((salary-308333)*36)/100;
            }else{
                System.out.println("!!!!!Invalid Salary!!!!!");
            }
            System.out.println("\nYou have to pay Income Tax per month : "+Tax+"0");

        } else if (option==2) {

            System.out.println("\n\n------------------------------------------------------------");
            System.out.println("|                    Calculate Annual Bonus                 |");
            System.out.println("------------------------------------------------------------");
            System.out.println();
            System.out.print("In put Employee name    - ");
            String name=scan.next();
            System.out.print("In put Employee Salary  - ");
            double salary= scan.nextDouble();

            if(salary<100000){
                bonus+=5000;;
            }else if (salary>=100000 && salary<=199999) {
                bonus+=(salary*10)/100;
            }
            else if (salary>=200000 && salary<=299999) {
                bonus+=(salary*15)/100;
            }else if (salary>=300000 && salary<=199999) {
                bonus+=(salary*20)/100;
            }else if (salary>=400000) {
                bonus+=(salary*35)/100;
            }
            else{
                System.out.println("!!!!!Invalid Salary!!!!!");
            }
            System.out.println("\nAnnual bonus   - "+bonus);

        } else if (option==3) {
            double loan; int months; double rate;
            System.out.println("\n\n------------------------------------------------------------");
            System.out.println("|                    Calculate Loan Amount                  |");
            System.out.println("------------------------------------------------------------");
            System.out.println();
            System.out.print("In put Employee name    - ");
            String name=scan.next();
            System.out.print("In put Employee Salary  - ");
            double salary= scan.nextDouble();
            if(salary>50000){
                System.out.print("Enter number of year : ");
                int year=scan.nextInt();

                if(year<=5){
                    months=year*12;


                    int y=1;

                    double power=1.0125;
                    while(y<months-1){
                        power=power*1.0125;
                        y++;
                    }
                    System.out.println(power);
                   double h=(1/(1+power))/0.0125;
                    System.out.println(h);
                    loan=(0.6*salary)*((1-h));
                    System.out.print("You can get loan amount : "+loan);

                }

            }
        }
        else{
            System.out.println("\n!!!!!!!!!!Invalid Choosed Number!!!!!!!!!!!! ");
        }


    }
}