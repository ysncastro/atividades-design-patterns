package atividades_resolvidas.adapter;

import java.util.List;

public class InterfaceUsuario {
    public void exibirListaDeItens(List<Item> itemList) {
        for (Item item : itemList) {
            System.out.println("Name: " + item.getNome());
            System.out.println("Description: " + item.getDescricao());
            System.out.println();
        }
    }
}
