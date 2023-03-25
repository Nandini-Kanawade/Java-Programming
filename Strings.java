import java.util.*;
class Strings
{
    public static void main(String[] args)
   {
        //Enter the Strings
        System.out.println("Enter string one :=  ");
        Scanner co = new Scanner (System.in);
        String str1 = co.nextLine();
        System.out.println("Enter string two :=  ");
        String str2 = co.nextLine();
        
        System.out.println("\nThe entered string one is := " +str1);
        System.out.println("The enteredt string two is := " +str2);

        //Display the Menu of operations
        System.out.println("\n\nMenu\n1)Initials of the name\n2)Length of String\n3)Reversal of the string\n4)Concatination of strings\n5)Comparison of strings\n6)Substring formation\n7)Position of character\n8)String in lowercase\n9)String in uppercase\n10)Replace character in string\n11)Equal ignoring cases" );
        int n;
        do
        {
           System.out.println("\nEnter your code :=  ");
           int choice = co.nextInt();
           switch(choice)
           {
              case 1 :
              System.out.print("The initials are:= " + str1.charAt(0));
              for (int i= 0 ; i < str1.length() - 1 ; i++)
              {
                  if (str1.charAt(i) == ' ')
                   {System.out.print(" " + str1.charAt(i+1));} 
              }
              System.out.print("\nThe initials are:= " + str2.charAt(0));
              for (int ii= 0 ; ii < str2.length() - 1 ; ii++)
              {
                  if (str2.charAt(ii) == ' ')
                   {System.out.print(" " + str2.charAt(ii+1));}
              }
              break;

              case 2 :
              System.out.println("The length of string one is := " +str1.length());
              System.out.println("The length of string two is := " +str2.length());
              break;
            
              case 3 :
              System.out.println("The Reversed strings are:= ");
              for (int i = str1.length() - 1 ; i>=0 ; i--)
               {System.out.print("" + str1.charAt(i));}
              System.out.println("");
              for (int i = str2.length() - 1 ; i>=0 ; i--)
               {System.out.print("" + str2.charAt(i));}
              break;

              case 4 :
              System.out.println("The New Concatenated String is:=" +str1.concat(str2));
              break;

              case 5 :
              int compare = str1.compareTo(str2);
              if (compare == 0)
               {System.out.print("The string one is eqaul to string two");}
              if (compare > 0)
               {System.out.print("The string one is greater to string two");}
              if (compare < 0)
               {System.out.print("The string one is smaller to string two");}
              break;

              case 6 :
              System.out.println("*string one*");
              String substr = "";
              System.out.println("For string one enter starting index");
              int a = co.nextInt();
              System.out.println("For string one enter ending index");
              int b = co.nextInt();
              substr = str1.substring(a,b);
              System.out.println("Substring = " +substr);            
              System.out.println("\n*string two*");
              String substr2 = "";
              System.out.println("For string two enter starting index");
              int a2 = co.nextInt();
              System.out.println("For string two enter ending index");
              int b2 = co.nextInt();
              substr2 = str2.substring(a2,b2);
              System.out.println("Substring = " +substr2);
              break;

              case 7 :
              System.out.println("*string one*");
              System.out.println("For string one enter index");
              int xx = co.nextInt();
              System.out.println("The character at given index is:= " +str1.charAt(xx));
              System.out.println("*string two*");
              System.out.println("For string two enter index");
              int yy = co.nextInt();
              System.out.println("The character at given index is:= " +str2.charAt(yy));
              break;
             
              case 8 :
              System.out.println("The Uppercased string is:= " +str1.toUpperCase());
              System.out.println("The Uppercased string is:= " +str2.toUpperCase());
              break;

              case 9 :
              System.out.println("The Lowercased string one is:= " +str1.toLowerCase());
              System.out.println("The Lowercased string two is:= " +str2.toLowerCase());
              break;
 
              case 10 :
              System.out.println("*string one*");
              System.out.println("Enter character to be replaced:=");
              String p222 = co.nextLine();
              System.out.println("Enter character to be replaced by:=");
              String q22 = co.nextLine();
              System.out.println("Modified string := " +str1.replace(p222,q22));
              System.out.println("\n*string two*");
              System.out.println("Enter character to be replaced:=");
              String p2 = co.nextLine();
              System.out.println("Enter character to be replaced by:=");
              String q2 = co.nextLine();
              System.out.println("Modified string := " +str2.replace(p2,q2));
              break;

              case 11 :
              System.out.println("Are the strings equal:= " +str1.equalsIgnoreCase(str2));
              break;

              default: System.out.println("Enter a proper code! (1-11)");
           }
           System.out.println ("\n\nDo you want to perform any calulations? (1-yes||0-no)");
           n = co.nextInt();
        }while(n==1);
    }  
}
