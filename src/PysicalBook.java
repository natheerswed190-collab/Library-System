public class PysicalBook extends Book {
    private String shelfNumber;
    private double weight;
    private int Quantity;

    public String getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(String shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public PysicalBook(String name, double price, int pages, String type, String author, String shelfNumber, double weight, int quantity) {
        super(name, price, pages, type, author);
        this.shelfNumber = shelfNumber;
        this.weight = weight;
        Quantity = quantity;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\n shelfNumber :" + shelfNumber + "\n weight :" + weight + "\n Quantity :" + Quantity);
    }
}