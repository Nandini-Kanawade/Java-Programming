class readingMaterial{
        String title;
        float price;
        readingMaterial(String a, float b){
            title = a;
            price = b;
            System.out.println("Title:= " +title);
            System.out.println("Price:= Rs." +price);
        }
}
class book extends readingMaterial{
        String isbn;
        book(String bookname, float bookprice, String bookisbn){
            super(bookname, bookprice);
            isbn = bookisbn;
            System.out.println("ISBN code:= " +isbn);
        }
}
class magazine extends readingMaterial{
       String date;
       magazine(String magname, float magprice, String magissue){
          super(magname, magprice);
          date = magissue;
          System.out.println("Magazine:= " +magissue);
        } 
}

class cd extends readingMaterial{
       String time;
       cd(String cdname, float cdprice, String cdDuration){
          super(cdname, cdprice);
          time = cdDuration;
          System.out.println("Duration:= " +time);
       }
}

public class Library {
        public static void main(String args[]){
            System.out.println("\n//BOOK//");
            book obj1 = new book("Java Complete Reference", 1070, "978-0-07-163177-8");
            System.out.println("\n//MAGAZINE//");
            magazine obj2 = new magazine("Vogue India", 260, "23/June/2022");
            System.out.println("\n//CD//");
            cd obj3 = new cd("Environmental Basics", 2000, " 2Hr 30Min");
        } 
}
    
