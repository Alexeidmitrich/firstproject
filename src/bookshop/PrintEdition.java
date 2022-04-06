package bookshop;

public class PrintEdition {

    private String title;
    private int article;
    private int price;
    private int numberPlace;
    private String department;

    public PrintEdition(String title, int article, int price, int numberPlace, String department) {
        this.title = title;
        this.article = article;
        this.price = price;
        this.numberPlace = numberPlace;
        this.department = department;
    }

    public void printInformationEdition(){
        System.out.println(article +"," + title + ", Цена " + price + ", Отдел: " + department);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberPlace() {
        return numberPlace;
    }

    public void setNumberPlace(int numberPlace) {
        this.numberPlace = numberPlace;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
