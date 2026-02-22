void readFile() throws IOException {
    FileReader file = new FileReader("data.txt");
}

try {
    readFile();
} catch (IOException e) {
    System.out.println("File not found");
}
