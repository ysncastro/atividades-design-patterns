package atividades_resolvidas.adapter;

import java.util.List;

public class Main {

    public static void main(String[] args) {

            // Criar instâncias das fontes de dados
            BancoRelacional db = new BancoRelacional();
            SistemaDeArquivo sistemaDeArquivo = new SistemaDeArquivo();

            // Criar o adapter
            ItemAdapter adapter = new ItemAdapter(db, sistemaDeArquivo);

            // Recuperar a lista de itens usando o adapter
            List<Item> itemList = adapter.getItems();

            // Exibir a lista de itens na interface gráfica de usuário
            InterfaceUsuario ui = new InterfaceUsuario();
            ui.exibirListaDeItens(itemList);
        }
}

