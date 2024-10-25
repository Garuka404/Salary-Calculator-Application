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



        } else if (option==3) {

        }
        else{
            System.out.println("\n!!!!!!!!!!Invalid Choosed Number!!!!!!!!!!!! ");
        }


    }
}