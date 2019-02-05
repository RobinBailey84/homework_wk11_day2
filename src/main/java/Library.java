import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (stockCount() < this.capacity) {
            this.stock.add(book);
        }
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }

//    public int bookGenre(String genre){
//        int totalGenre = 0;
//        for(genre : this.stock){
//            if(genre = book){
//                totalGenre += 1;
//
//            }
//            return totalGenre;
//        }
//    }

}

