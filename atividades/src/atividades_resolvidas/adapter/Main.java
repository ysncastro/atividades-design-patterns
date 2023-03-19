package atividades_resolvidas.adapter;

import java.util.List;

public class Main {

    public static void main(String[] args) {

            // Criar instâncias das fontes de dados
            RelationalDatabase db = new RelationalDatabase();
            FileSystem fileSystem = new FileSystem();

            // Criar o adapter
            ItemAdapter adapter = new ItemAdapter(db, fileSystem);

            // Recuperar a lista de itens usando o adapter
            List<Item> itemList = adapter.getItems();

            // Exibir a lista de itens na interface gráfica de usuário
            UserInterface ui = new UserInterface();
            ui.displayItemList(itemList);
        }
}

