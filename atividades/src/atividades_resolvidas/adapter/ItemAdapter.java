package atividades_resolvidas.adapter;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter {

    private RelationalDatabase db;
    private FileSystem fileSystem;

    public ItemAdapter(RelationalDatabase db, FileSystem fileSystem) {
        this.db = db;
        this.fileSystem = fileSystem;
    }

    public List<Item> getItems() {
        List<Item> itemList = new ArrayList<>();

        // Recuperar itens do banco de dados relacional
        List<Object[]> dbItemsData = db.getItemsFromDb();
        for (Object[] data : dbItemsData) {
            itemList.add(new Item((String) data[0], (String) data[1]));
        }

        // Recuperar itens do sistema de arquivos
        List<String[]> fileItemsData = fileSystem.getItemsFromFileSystem();
        for (String[] data : fileItemsData) {
            itemList.add(new Item(data[0], data[1]));
        }

        return itemList;
    }
}
