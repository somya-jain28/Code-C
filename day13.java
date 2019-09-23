		DAY 13 
class MyBook extends Book
    {
        //String author,title;
        int price;
        MyBook(String title, String author, int price)
        {
            super(title, author);
            this.price=price;
        }
         void display()
         {
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Price: "+price);
         }
    }