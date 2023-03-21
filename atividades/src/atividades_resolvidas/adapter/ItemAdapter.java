package atividades_resolvidas.adapter;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter {

    private BancoRelacional db;
    private SistemaDeArquivo sistemaDeArquivo;

    public ItemAdapter(BancoRelacional db, SistemaDeArquivo sistemaDeArquivo) {
        this.db = db;
        this.sistemaDeArquivo = sistemaDeArquivo;
    }

    public List<Item> getItems() {
        List<Item> itemList = new ArrayList<>();

        // Recuperar itens do banco de dados relacional
        List<Object[]> dadosItensDoBanco = db.obterItensDoBanco();
        for (Object[] data : dadosItensDoBanco) {
            itemList.add(new Item((String) data[0], (String) data[1]));
        }

        // Recuperar itens do sistema de arquivos
        List<String[]> dadosItensArquivo = sistemaDeArquivo.obterItensSistemaArquivos();
        for (String[] data : dadosItensArquivo) {
            itemList.add(new Item(data[0], data[1]));
        }

        return itemList;
    }
}
