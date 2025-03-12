class Book {
    String title;
    String author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public void display(){
        System.out.println("Title:"+title+" and the author "+author);
    }
    public static void main(String[] args) {
        Book a=new Book("It ends with us","Colleen Hoover");
        a.display();
    }
}
