public abstract class Document {
    // Abstract method to be implemented by concrete document types
    public abstract void open();
}

public class WordDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document.");
    }
}

public class ExcelDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document.");
    }
}

public class DocumentFactory {
    // Enum to define supported document types
    public enum DocumentType {
        WORD, EXCEL
    }

    // Factory method to create documents based on the type
    public static Document getDocument(DocumentType type) {
        switch (type) {
            case WORD:
                return new WordDocument();
            case EXCEL:
                return new ExcelDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Word document using the factory method
        Document wordDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.WORD);
        wordDoc.open(); // Outputs: Opening Word Document.

        // Create an Excel document using the factory method
        Document excelDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.EXCEL);
        excelDoc.open(); // Outputs: Opening Excel Document.
    }
}
