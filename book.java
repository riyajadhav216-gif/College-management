class Book  

{ 
    String title; 

    String author; 

    int price; 

  

    Book(String t, String a,int p)     

   {    

       title = t; 

        author = a; 

        price = p; 

    } 

  

    void display()  

   { 

        System.out.println("Book Title: " + title); 

        System.out.println("Author Name: " + author); 

        System.out.println("Price: " + price); 

    } 

  

    public static void main(String[] args) 

    { 

        Book b1 = new Book("Java Basics", "maya", 350); 

        b1.display(); 

    } 

} 

