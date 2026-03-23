public abstract class Document {
    // TODO: Update the method to accept a filename parameter
    
    public abstract void open(String filename);
}

public class WordDocument extends Document {
    // TODO: Modify this method to include the filename in the print statement
    @Override
    public void open(String filename) {
        System.out.println("Opening Word Document: "+filename);
    }
}

public class ExcelDocument extends Document {
    // TODO: Modify this method to include the filename in the print statement
    @Override
    public void open(String filename) {
        System.out.println("Opening Excel Document: "+filename);
    }
}

public class GoogleDoc extends Document {
    // TODO: Modify this method to include the filename in the print statement
    @Override
    public void open(String filename) {
        System.out.println("Opening Google Doc: "+filename);
    }
}

public class GoogleSheet extends Document {
    // TODO: Modify this method to include the filename in the print statement
    @Override
    public void open(String filename) {
        System.out.println("Opening Google Sheet: "+filename);
    }
}

public class DocumentFactory {
    public static Document createDocument(DocumentAbstractFactory factory) {
        return factory.createDocument();
    }
}

public interface DocumentAbstractFactory {
    Document createDocument();
}

public class WordDocumentFactory implements DocumentAbstractFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

public class ExcelDocumentFactory implements DocumentAbstractFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class GoogleDocFactory implements DocumentAbstractFactory {
    @Override
    public Document createDocument() {
        return new GoogleDoc();
    }
}

public class GoogleSheetFactory implements DocumentAbstractFactory {
    @Override
    public Document createDocument() {
        return new GoogleSheet();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Office Word Document
        Document wordDoc = DocumentFactory.createDocument(new WordDocumentFactory());
        // TODO: Modify this line to include the filename "word_file.docx"
        wordDoc.open("word_file.docx"); // Should output: Opening Word Document: word_file.docx

        // Create a Google Doc
        Document googleDoc = DocumentFactory.createDocument(new GoogleDocFactory());
        // TODO: Modify this line to include the filename "google_doc_file.gdoc"
        googleDoc.open("google_doc_file.gdoc"); // Should output: Opening Google Doc: google_doc_file.gdoc

        // Create an Office Excel Document
        Document excelDoc = DocumentFactory.createDocument(new ExcelDocumentFactory());
        // TODO: Modify this line to include the filename "excel_file.xlsx"
        excelDoc.open("excel_file.xlsx"); // Should output: Opening Excel Document: excel_file.xlsx

        // Create a Google Sheet
        Document googleSheet = DocumentFactory.createDocument(new GoogleSheetFactory());
        // TODO: Modify this line to include the filename "google_sheet_file.gsheet"
        googleSheet.open("google_sheet_file.gsheet"); // Should output: Opening Google Sheet: google_sheet_file.gsheet
    }
}
