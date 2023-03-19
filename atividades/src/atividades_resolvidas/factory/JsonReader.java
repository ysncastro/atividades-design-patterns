package atividades_resolvidas.factory;

public class JsonReader extends FileReader{
    @Override
    public void readFile(String fileName) {
        System.out.println("Reading JSON file: " + fileName);
        // read JSON file and process data
    }
}
