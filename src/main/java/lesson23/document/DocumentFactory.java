package lesson23.document;

public class DocumentFactory {

    public Document document() {
        return new Document();
    }

    public Parser parser() {
        return new Parser();
    }
}
