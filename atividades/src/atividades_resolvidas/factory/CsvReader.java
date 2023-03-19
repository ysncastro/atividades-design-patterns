package atividades_resolvidas.factory;

public class CsvReader extends FileReader{
    @Override
    public void readFile(String fileName) {
        System.out.println("Reading CSV file: " + fileName);
        // read CSV file and process data
    }
}
