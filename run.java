import java.util.*;
class check{
    String name;
    int roll_call;
    void accept(){
        Scanner zx = new Scanner(System.in);
        System.out.println("Enter your name:= ");
        name = zx.nextLine();
        System.out.println("Enter your roll number:= ");
        roll_call = zx.nextInt();
    }
    class invalidname extends Exception{
        invalidname(String str){
            super(str);
        }
    }
    class invalidroll extends Exception{
        invalidroll(String str){
            super(str);
        }
    }
    void Checkname(){
        int length = name.length();
        try{
            for (int i=0; i<length; i++ ){
              if ((name.charAt(i)>=65 && name.charAt(i)<=90) || (name.charAt(i)>=97 && name.charAt(i)<=122)){} 
              else{
                 throw new invalidname("Name should have only aplhabets ");
                } 
            }
        }
        catch(invalidname a){
          System.out.println("Exception foound " +a);
        }
    }

    void Checkrollnum(){
        try{
            if (roll_call<=23 && roll_call>=0){} 
            else{
             throw new invalidroll("Roll  number should be between 1 to 23");
            }  
        }
        catch(invalidroll a){
            System.out.println("Exception found " +a);
        }
    }
}
class run{
    public static void main(String[] args) {
        check Student1 = new check();
        Student1.accept();
        Student1.Checkname();
        Student1.Checkrollnum();    
    }
}
