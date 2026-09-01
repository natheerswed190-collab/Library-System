abstract class Book {
    private String name;
    private double price;
    private int pages;
    private String Type;
    private String author;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, double price, int pages, String type, String author) {
        this.name = name;
        this.price = price;
        this.pages = pages;
        this.Type = type;
        this.author = author;
    }
    public Book(){
        this.name = "Invalid";
        this.price = 0.00;
        this.pages = 0;
        this.Type = "no Type";
        this.author = "no author";
    }


    public void display() {
        System.out.print("\n book name : " + name + " \n Type : " + Type + " \n autor :" + author + " \n price : " + price+"$");
    }
}
