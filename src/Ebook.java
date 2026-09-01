public class Ebook extends Book {
    private double FileSize;
    private String Format;
    private String DownloadLink;

    public double getFileSize() {
        return FileSize;
    }

    public void setFileSize(double fileSize) {
        FileSize = fileSize;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getDownloadLink() {
        return DownloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        DownloadLink = downloadLink;
    }

    public Ebook(String name, double price, int pages, String type, String author, double fileSize, String format, String downloadLink) {
        super(name, price, pages, type, author);
        FileSize = fileSize;
        Format = format;
        DownloadLink = downloadLink;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("\n Size :" + FileSize + "MB" + "\n Format :" + Format + "\n DownloadLink :" + DownloadLink);
    }
}
