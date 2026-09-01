public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        PysicalBook a = new PysicalBook("One piece",3000,250,"Action" ,  "ODA" , "A15" , 1.6 , 33);
        Ebook b = new Ebook("JJK",1000,50,"Romance" ,  "CJ" , 1.1 , "PDF" , "https://library.com");
        b.display();

    }
}