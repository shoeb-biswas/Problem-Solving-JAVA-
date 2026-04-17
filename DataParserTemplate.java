public abstract class DataParserTemplate {
    // Template method defining the steps of the algorithm
    public final void parseDataAndGenerateOutput() {
        openFile();
        readData();
        processData();
        writeData();
    }

    // Default implementation for opening a file (common to all subclasses)
    private void openFile() {
        System.out.println("Opening file for data parsing.");
    }

    // Abstract methods to be implemented by subclasses
    public abstract void readData();
    public abstract void processData();
    public abstract void writeData();
}
public class CSVDataParser extends DataParserTemplate {
    @Override
    public void readData() {
        System.out.println("Reading data from CSV file.");
    }

    @Override
    public void processData() {
        System.out.println("Processing CSV data.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to CSV file.");
    }
}
public class XMLDataParser extends DataParserTemplate {
    @Override
    public void readData() {
        System.out.println("Reading data from XML file.");
    }

    @Override
    public void processData() {
        System.out.println("Processing XML data.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to XML file.");
    }
}

public class Main {
    public static void main(String[] args) {
        DataParserTemplate csvParser = new CSVDataParser();
        csvParser.parseDataAndGenerateOutput();

        DataParserTemplate xmlParser = new XMLDataParser();
        xmlParser.parseDataAndGenerateOutput();
    }
}
