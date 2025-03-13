public class Main {
    public static void main(String[] args) {
    Author author1 = new Author("Джордж" , "Мартин");
    Author author2 = new Author("Александр" , "Пушкин");
    Book book1 = new Book("Песнь льда и пламени", 2017,author1);
    Book book2 = new Book("Евгений Онегин", 1875, author2);

        System.out.println(book1);
        System.out.println(book2);

    book2.setPublicationYear(1825);

        System.out.println(book2);
    }
}