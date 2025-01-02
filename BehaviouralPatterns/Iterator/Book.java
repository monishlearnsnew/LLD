package BehaviouralPatterns.Iterator;

public class Book {
    private String title;
    private String authorName;

    public Book(String title,String authorName){
        this.title = title;
        this.authorName =authorName;
    }


    public String getBookDetails(){
        return this.title+" written by "+this.authorName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getTitle() {
        return title;
    }

}
