package atividades_resolvidas.factory;

public class Main {

    public static void main(String[] args) {
        FileReaderFactory readerFactory = new FileReaderFactory();
        FileProcessor fileProcessor = new FileProcessor(readerFactory);

        fileProcessor.processFile("data.csv", "csv");
        fileProcessor.processFile("data.xml", "xml");
        fileProcessor.processFile("data.json", "json");
    }

}
