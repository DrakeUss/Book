
public class Main {
    public static void main(String[] args) {
        Book oneBook = new Book("Идиот", 1868, "Фёдор Михайлович Достоевский", 640);
        System.out.println("Название книги: " + oneBook.title + ", автор: " + oneBook.author + ", год выпуска: " + oneBook.releaseYear + ", количество страниц: " + oneBook.pages + ".");
        System.out.println("Является ли книга большой? " + (oneBook.isBig() ? "Да" : "нет") + ".");
        System.out.println("Cодержится ли в описании книги \"Достоевский\"?" + (oneBook.matches("Достоевский") ? " Да." : " Нет."));
        System.out.println("Цена книги - " + oneBook.estimatePrice() + " рублей.");

    }
}
