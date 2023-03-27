import java.util.*;
class Person{
    Scanner sc = new Scanner(System.in);
    String emName, aptName, rdName;
    int aptNum, pinCode;
    void accept(){
        System.out.print("\nEnter your name:= ");
        emName = sc.nextLine();
        System.out.println("\nEnter your address details");
        System.out.print("Apartment number:= ");
        aptNum = sc.nextInt();
        System.out.print("Apartment name:= ");
        aptName = sc.next();
        System.out.print("Road name:= ");
        rdName = sc.next();
        System.out.print("PIN Code:= ");
        pinCode = sc.nextInt();
    }
    void display(){
        System.out.println("Employee Name:= " +emName);
        System.out.println("\nADDRESS DETAILS");
        System.out.println("Apartment name:= " +aptName);
        System.out.println("Apartment number:= " +aptNum);
        System.out.println("Road Name:= " +rdName);
        System.out.println("PIN CODE:= " +pinCode);
    }    
}
class Employee extends Person {
    Scanner ab = new Scanner(System.in);
    int empID, bcSalary, hra, da, grSalary, inTax, tkhSalary;
    void accept(){
        super.accept();
        System.out.print("\nEnter your Employee ID:= ");
        empID = ab.nextInt();
        System.out.print("Enter your Basic Salary:= Rs. ");
        bcSalary = ab.nextInt();
    }
    void display(){
        super.display();
        hra = 20 * bcSalary / 100;
        da = 45 * bcSalary / 100;
        grSalary = bcSalary + hra  + da;
        inTax = 7 * bcSalary / 100;
        tkhSalary = grSalary - inTax ;
        System.out.println("\nEmployee ID:= " +empID);
        System.out.println("\nBasic Salary:= Rs. " +bcSalary);
        System.out.println("Home rent allownace:= Rs. " +hra);
        System.out.println("Dearness Allownace:=Rs. " +da);
        System.out.println("Gross Total Salary:=Rs. "+grSalary);
        System.out.println("Income Tax to be deducted:=Rs. "+inTax);
        System.out.println("\nTAKE HOME SALARY :=Rs. " +tkhSalary+ "\n");
    }  
}
public class EmployeeData{
    public static void main(String[] args){
        Scanner xy = new Scanner(System.in);
        int n, a, choice, id, pin, z=1;
        System.out.print("Enter the number of Employees:= ");
        n = xy.nextInt();
        Employee obj[] = new Employee[n];
        for ( a=0; a<n; a++){
            obj[a] = new Employee();
            System.out.println("\n\n//" +(a+1)+ "//");
            obj[a].accept();
        }
        System.out.println("\nMENU\n1)Displaying Information\n2)Search by ID\n3)Search by Pincode");
        do{
          System.out.println("Enter choice:= ");
          choice = xy.nextInt();
          switch(choice){
              case 1:
              System.out.println("\nDisplay Complete Information");
              for(a=0; a<n; a++){
                  System.out.println("\n//" +(a+1)+ "//**DETAILS**");
                  obj[a].display();
                }
              break;
              case 2:
              System.out.println("\nSEARCH BY ID");
              System.out.println("Enter the employee ID:= ");
              id = xy.nextInt();
              for(a=0; a<n; a++){
                  if (id == obj[a].empID){
                      System.out.println("\n");
                      obj[a].display();
                    }
                }
              break;
              case 3:
              System.out.println("\nSEARCH BY PINCODE");
              System.out.println("Enter the Pincode:= ");
               pin = xy.nextInt();
              for(a=0; a<n; a++){
                  if(pin == obj[a].pinCode){
                    System.out.println("\n");
                    obj[a].display();
                    }
                }
              break;
              default : System.out.println("INVALID INPUT");
            }
            System.out.println("Do you want to perform any other operation\n(Yes=1//No=0)");
            z=xy.nextInt();
        }while(z==1);
    }
}
