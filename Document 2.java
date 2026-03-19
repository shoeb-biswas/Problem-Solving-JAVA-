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


public class PDFDocument extends Document{
     public void open() {
        System.out.println("Successfully opened PDF Document.");
    }
}

public class DocumentFactory {
    // Enum to define supported document types
    // TODO: Add a new PDF type to the enum
    public enum DocumentType {
        WORD, EXCEL, PDF
    }

    // Factory method to create documents based on the type
    // TODO: Update the switch statement to handle the new PDF type
    public static Document getDocument(DocumentType type) {
        switch (type) {
            case WORD:
                return new WordDocument();
            case EXCEL:
                return new ExcelDocument();
            case PDF:
                return new PDFDocument();
            // TODO: Handle the PDF case and return a new PDFDocument
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Word document using the factory method
        Document wordDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.WORD);
        wordDoc.open(); // Outputs: Successfully opened Word Document.

        // Create an Excel document using the factory method
        Document excelDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.EXCEL);
        excelDoc.open(); // Outputs: Successfully opened Excel Document.

        // TODO: Use the factory method to create and open a PDF document
        Document PDFDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.PDF);
        PDFDoc.open();
    }
}
