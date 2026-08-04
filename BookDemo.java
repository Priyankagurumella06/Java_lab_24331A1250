public class BookDemo {
    public static void main(String args[]) {
        Author a = new Author("Priya", "priya@gmail.com", 'F');
        Book b = new Book("Java Programming", a, 550.0, 20);
        System.out.println("Book Name : " + b.getName());
        System.out.println("Price : " + b.getPrice());
        System.out.println("Stock : " + b.getQtyInStock());
        System.out.println("Author Name : " + b.getAuthor().getName());
        System.out.println("Author Email : " + b.getAuthor().getEmail());
        System.out.println("Gender : " + b.getAuthor().getGender());
    }
}