public abstract class Document {
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

public class GoogleDoc extends Document {
    @Override
    public void open() {
        System.out.println("Opening Google Doc.");
    }
}

public class GoogleSheet extends Document {
    @Override
    public void open() {
        System.out.println("Opening Google Sheet.");
    }
}

public class DocumentFactory {
    public static Document createDocument(DocumentAbstractFactory factory) {
        return factory.createDocument();
    }
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
        wordDoc.open(); // Outputs: Opening Word Document.

        // Create a Google Doc
        Document googleDoc = DocumentFactory.createDocument(new GoogleDocFactory());
        googleDoc.open(); // Outputs: Opening Google Doc.

        // Create an Office Excel Document
        Document excelDoc = DocumentFactory.createDocument(new ExcelDocumentFactory());
        excelDoc.open(); // Outputs: Opening Excel Document.

        // Create a Google Sheet
        Document googleSheet = DocumentFactory.createDocument(new GoogleSheetFactory());
        googleSheet.open(); // Outputs: Opening Google Sheet.
    }
}
