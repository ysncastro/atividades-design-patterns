package atividades_resolvidas.factory;

public class FileProcessor {

    private FileReaderFactory readerFactory;

    public FileProcessor(FileReaderFactory readerFactory) {
        this.readerFactory = readerFactory;
    }

    public void processFile(String fileName, String fileType) {
        FileReader reader = readerFactory.createReader(fileType);
        reader.readFile(fileName);
        // perform operations on file data
    }
}
