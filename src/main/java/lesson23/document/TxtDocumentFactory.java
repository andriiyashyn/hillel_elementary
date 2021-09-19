package lesson23.document;

public class TxtDocumentFactory {

    public Document document() {
        return new TXTDocument();
    }

    public Parser parser() {
        return new TXTParser();
    }
}
