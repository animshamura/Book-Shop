class Book {
  String book_name;
  int isbn;
  String author;
  String publisher;
  double price;
  
  Book (String book_name, int isbn) {
    this.book_name = book_name ;
    this.isbn =  isbn;
  }
  
  Book (String author, String publisher , double price) {
    this.author = author;
    this.publisher = publisher;
    this.price = price;
  }
  
  Book(Book b, Book c){
    if(b.getBook_name()!=null) c.setBook_name(b.getBook_name());
    if(b.getIsbn()!=0) c.setIsbn(b.getIsbn());
    if(b.getAuthor()!=null) c.setAuthor(b.getAuthor());
    if(b.getPublisher()!=null) c.setPublisher(b.getPublisher());
    if(b.getPrice()!=0) c.setPrice(b.getPrice());
  }
    
  void setBook_name(String book_name){
    this.book_name = book_name;
  }
  void setIsbn(int isbn){
    this.isbn = isbn;
  }
  void  setAuthor(String author){
    this.author = author;
  }
  void setPublisher(String publisher){
   this.publisher = publisher;
  }
  void setPrice(double price){
    this.price = price;
  }
  String getBook_name(){
    return book_name;
  }
  int getIsbn(){
    return isbn;
  }
  String getAuthor(){
    return author;
  }
  String getPublisher(){
    return publisher;
  }
  double getPrice(){
    return price;
  }
  void update_price(){
   if(price>=200) price = price + price*0.03;
   else price = price + price*0.05;
  }
  void display(){
    System.out.println(" Book Name : " +getBook_name());
    System.out.println(" ISBN             : " +getIsbn());
    System.out.println(" Author         : " +getAuthor());
    System.out.println(" Publisher     : " +getPublisher());
    System.out.println(" Price             : " +getPrice());
  }
}
    
    
    
    
    
    
  