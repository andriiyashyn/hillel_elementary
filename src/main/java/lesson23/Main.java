package lesson23;

import lesson23.document.Document;
import lesson23.document.PDFDocument;
import lesson23.document.TXTDocument;
import lesson23.singleton.Animal;

public class Main {

    public static void main(String[] args) {
//        getDocument("TXT").text();

        Animal animal = Animal.instance();
        Animal animal1 = Animal.instance();
        Animal animal2 = Animal.instance();
        Animal animal3 = Animal.instance();
        Animal animal4 = Animal.instance();
        Animal animal5 = Animal.instance();
    }

    public static Document getDocument(String format) {
        switch (format) {
            case "TXT": return new TXTDocument();
            case "PDF": return new PDFDocument();
            default: return new Document();
        }
    }
}
