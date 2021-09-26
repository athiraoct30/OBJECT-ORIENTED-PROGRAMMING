class MainQ13{
    public static void main(String[] args) 
    {
       Literature lr = new Literature("Literature","Romeo and Juliet","William Shakespeare");
       Fiction fn = new Fiction("Fiction","Adventures of Huckleberry Finn","Charles");
       lr.display();
       fn.display();
       
    }
}

class Publisher {
    String publisherName;
    Publisher(String P)
    {
        this.publisherName = P;
    }
    void display()
    {
        System.out.println("Publisher Name : " + this.publisherName);
    }
}

class Books extends Publisher
{  
    String bookName;
    Books(String B,String P)
    {
        super(P);
        this.bookName =B;
    }
    void display()
    {
        super.display();
        System.out.println("Bookname Name : " + this.bookName);
    }
}

class Literature extends Books
{  
    String LiteratureName;
    Literature(String L,String B,String P)
    {
        super(B,P);
        this.LiteratureName = L;
    }
    void display()
    {
        System.out.println("..........................................");
        super.display();
        System.out.println("Category Name : " + this.LiteratureName);
        System.out.println("..........................................");
    }
 
}

class Fiction extends Books{  
    String FictionName;
    Fiction(String F,String B,String P){
        super(B,P);
        this.FictionName = F;
    }
    void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("Category Name : " + this.FictionName);
        System.out.println("..........................................");
    }
}
