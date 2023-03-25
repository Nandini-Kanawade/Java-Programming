import java.util.Scanner;
class studentdatabase
{
    String nameofstudent;
    int rollno, s1, s2, s3, s4, s5;
    double grade;
    Scanner sc = new Scanner(System.in);

    studentdatabase(){
        rollno=s1=s2=s3=s4=s5=0;
        grade=0;
        nameofstudent=null;
    }

    void accept(){
        System.out.println("Enter the Roll Number of the student:= ");
        rollno = sc.nextInt();
        System.out.print("Enter the Name of the student:= ");
        nameofstudent = sc.next();
        System.out.print("Enter the marks of Subject-one:= ");
        s1 = sc.nextInt();
        System.out.print("Enter the marks of Subject-two:= ");
        s2 = sc.nextInt();
        System.out.print("Enter the marks of Subject-three:= ");
        s3 = sc.nextInt();
        System.out.print("Enter the marks of Subject-four:= ");
        s4 = sc.nextInt();
        System.out.print("Enter the marks of Subject-five:= ");
        s5 = sc.nextInt();
    }

    void display(){
        System.out.println(rollno +"\t\t"+nameofstudent+"\t\t"+s1+"\t\t"
        +s2+"\t\t"+s3+"\t\t"+s4+"\t\t"+s5+"\t"+grade);
    }

    double grade(){
        double grade;
        grade= (s1+s2+s3+s4+s5)* 0.02;
        return grade;
    } 
}
public class Result
{
    public static void main(String args[])
    {
        Scanner ab = new Scanner(System.in);
        studentdatabase newstudent = new studentdatabase();
        int n, a;
        System.out.println("Enter the total number of students:=");
        n=ab.nextInt();
        studentdatabase obj[] = new studentdatabase[n];

        for( a=0; a<n; a++){
            obj[a]  = new studentdatabase();
            System.out.println("\nStudent" +(a+1)+ ":=");
            obj[a].accept();
            obj[a].grade = obj[a].grade();
        }

        System.out.println("\n\nDetails of students:=");
        System.out.println("Roll no. \tName \tSubject_1\tSubject_2\tSubject_3\tSubject_4\tSubject_5\tGrade");
       
        for(a=0; a<n ; a++){
            //System.out.println("Student" +(a+1)+ ":=");
            obj[a].display();  
        }

        System.out.println("\n\n**TOP BAND STUDENTS**");
       
        for( a=0; a<n; a++){
            if ( obj[a].grade > 8.0){
                System.out.println( obj[a].nameofstudent+ " is a TOP BAND STUDENT");
            }
        }
        System.out.println("\n!!Congratualations!!");
    }  
}

