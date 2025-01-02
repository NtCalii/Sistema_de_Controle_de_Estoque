package Domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> estoque = new ArrayList<>();
        int opcao;

        do {
            System.out.println("=== Sistema de Controle de Estoque ===");
            System.out.println("1. Adicionar item.");
            System.out.println("2. Remover item.");
            System.out.println("3. Exibir item.");
            System.out.println("4. Sair.");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    estoque.add(item);
                    System.out.println("");
                    System.out.println("Item adicionado com sucesso.");
                    break;

                case 2:
                    System.out.print("Digite o nome do item a ser remoido: ");
                    String itemRemover = scanner.nextLine();
                    if (estoque.remove(itemRemover)){
                        System.out.println("Item removido com sucesso.");
                    }else {
                        System.out.println("Item não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Itens em estoque. ");
                    if (estoque.isEmpty()){
                        System.out.println("O estoque está vazio. ");
                    }else {
                        for (String i: estoque){
                            System.out.println("- " + i);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando Sistema.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while (opcao != 4);

        scanner.close();
    }
}
