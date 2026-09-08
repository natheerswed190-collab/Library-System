import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean Running = true;
        ArrayList<Book> Library = new ArrayList<>();
        Library.add(new PhysicalBook("One piece", 300, 250, "Action", "ODA", "A15", 1.6, 33));
        Library.add(new Ebook("JJK", 100, 50, "Romance", "CJ", 1.1, "PDF", "https://library.com"));
        Customer A = new Customer("Ahmed", 50);
        Scanner input = new Scanner(System.in);
        while (Running) {
            System.out.println("\n --- Main Menu --- \n");
            System.out.println("1.Add Book");
            System.out.println("2.search for a book");
            System.out.println("3.View all Books");
            System.out.println("4.Check balance");
            System.out.println("5.Exit");
            int e = input.nextInt();
            switch (e) {
                case 1: {
                    System.out.println("what Type of book? \n (1 for physical/ 2 for Ebook");
                    int TypeChoice = input.nextInt();
                    input.nextLine();
                    if (TypeChoice == 1) {
                        System.out.println("Enter the name of your book");
                        String Name = input.nextLine();
                        System.out.println("enter the price");
                        double price = input.nextDouble();
                        System.out.println("enter the count of pages");
                        int pages = input.nextInt();
                        input.nextLine();
                        System.out.println("enter the type of the book");
                        String Type = input.nextLine();
                        System.out.println("enter author :");
                        String author = input.nextLine();
                        System.out.println("enter shelf number :");
                        String shelfNumber = input.nextLine();
                        System.out.println("enter the weight");
                        double weight = input.nextDouble();
                        System.out.println("Enter the quantity");
                        int quantity = input.nextInt();
                        Library.add(new PhysicalBook(Name, price, pages, Type, author, shelfNumber, weight, quantity));
                        A.addBonus(15 * quantity);
                        System.out.println("Success! 15$ bonus for each physical book added to your balance.");
                    } else if (TypeChoice == 2) {
                        System.out.println("Enter the name of your book");
                        String Name = input.nextLine();
                        System.out.println("enter the price");
                        double price = input.nextDouble();
                        System.out.println("enter the count of pages");
                        int pages = input.nextInt();
                        input.nextLine();
                        System.out.println("enter the type of the book");
                        String Type = input.nextLine();
                        System.out.println("enter author :");
                        String author = input.nextLine();
                        System.out.println("enter file size :");
                        double fileSize = input.nextDouble();
                        input.nextLine();
                        System.out.println("enter the format");
                        String format = input.nextLine();
                        System.out.println("Enter the download link");
                        String download = input.nextLine();
                        Library.add(new Ebook(Name, price, pages, Type, author, fileSize, format, download));
                        A.addBonus(10 * (pages / 100));
                        System.out.println("Success! 10$ bonus for each Ebook added to your balance.");
                    } else {
                        System.out.println("error");
                        Running = false;
                        break;
                    }
                    break;
                }
                case 2: {
                    input.nextLine();
                    System.out.println("enter the name of the Book you searching for");
                    String searchName = input.nextLine();
                    boolean found = false;
                    for (Book myBook : Library) {
                        if (searchName.equalsIgnoreCase(myBook.getName())) {
                            found = true;
                            System.out.println("Book details");
                            myBook.display();
                            System.out.println("\n press 1 to buy");
                            System.out.println(" press 2 to return back");
                            System.out.println("press else key to close");
                            int Buy = input.nextInt();
                            if (Buy == 1) {
                                if (A.getBalance() >= myBook.getPrice()) {
                                    A.addBonus(-myBook.getPrice());
                                    System.out.println("purchase successful!");
                                    System.out.println("your balance now");
                                    A.CheckBalance();
                                } else {
                                    System.out.println("Sorry your balance is not enough to buy this book!");
                                }
                            } else if (Buy == 2) {
                                System.out.println("Returning to Main Menu ......");
                            } else {
                                System.out.println("closing.........");
                                Running = false;
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("sorry... this book not available yet...");
                        Running = false;
                        break;
                    }


                    break;
                }
                case 3: {
                    for (Book myBook : Library) {
                        myBook.display();
                    }
                    break;
                }
                case 4: {
                    A.CheckBalance();
                    break;
                }
                case 5: {
                    Running = false;
                    System.out.println("Exiting... see you later!");
                    break;
                }
                default: {
                    System.out.println("Invalid option. Please choose a number between 1-5.");
                    break;
                }
            }

        }


    }
}