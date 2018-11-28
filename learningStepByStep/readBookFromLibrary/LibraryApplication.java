package learningStepByStep.readBookFromLibrary;

public class LibraryApplication {
    public static void main(String[] args) {
        Library library= new Library();
        Book book= library.getBook("Sisi");
        Reader reader = new Reader();
        reader.read(book);

    }
}
