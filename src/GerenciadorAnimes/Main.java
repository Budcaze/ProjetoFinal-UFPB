package GerenciadorAnimes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animes> Lista_Animes = new ArrayList<>();
        GerenciadorAnimes gerenciadorAnimes = new GerenciadorAnimes();
        Scanner input = new Scanner(System.in);
        System.out.println("╔══╗░░░░░░░╔╗░░╔╗░░░░░╔╗░░╔╗\n" +
                "║╔╗║░░░░░░░║╚╗╔╝║░░░░░║║░░║║\n" +
                "║╚╝╚╦══╦╗╔╗╚╗║║╔╬╦═╗╔═╝╠══╣║\n" +
                "║╔═╗║║═╣╚╝║░║╚╝║╠╣╔╗╣╔╗║╔╗╠╝\n" +
                "║╚═╝║║═╣║║║░╚╗╔╝║║║║║╚╝║╚╝╠╗\n" +
                "╚═══╩══╩╩╩╝░░╚╝░╚╩╝╚╩══╩══╩╝\n");
        System.out.println("                                                                                    \n" +
                "                                                                                    \n" +
                "                                                                                    \n" +
                "                                      ▓▓▓▓▓▓  ▓▓▓▓▓▓                                \n" +
                "                                      ▓▓  ░░▓▓▓▓  ▓▓▓▓▓▓                            \n" +
                "                                ▓▓▓▓▓▓▓▓░░  ░░▓▓░░░░▓▓▓▓  ▓▓                        \n" +
                "                              ▒▒▓▓░░  ▓▓░░░░░░░░░░░░▓▓░░░░▓▓                        \n" +
                "                                  ▒▒░░  ░░░░░░░░░░░░░░░░▓▓▓▓▒▒                      \n" +
                "                                  ▓▓░░░░░░░░░░░░░░░░░░░░▓▓░░▓▓                      \n" +
                "                ██████████    ▒▒▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓                      \n" +
                "            ██████      ██████    ▓▓▓▓▓▓▓▓▓▓▓▓▒▒    ▒▒▒▒▒▒▓▓▓▓                      \n" +
                "          ████              ████████▓▓▓▓▓▓▓▓▓▓▒▒    ▒▒  ▒▒▓▓                        \n" +
                "        ████                  ██████░░  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                        \n" +
                "                          ██████████░░  ░░░░░░██░░░░░░████                          \n" +
                "                    ██████████    ██░░░░░░░░░░▒▒░░░░░░▒▒██                          \n" +
                "              ██████████          ██░░░░░░░░░░░░░░░░░░░░██                          \n" +
                "        ██████████                  ████░░░░░░░░░░░░░░░░██                          \n" +
                "      ██████                          ████░░░░░░▒▒▒▒░░██                            \n" +
                "    ████                              ██▓▓██░░░░░░░░██                              \n" +
                "  ████                          ████████▓▓▓▓████████                                \n" +
                "  ██                          ████▓▓▓▓▓▓████████▓▓██████                            \n" +
                "  ██                        ████▓▓▓▓▓▓▓▓▓▓██████▓▓██▓▓▓▓██                          \n" +
                "                          ▓▓████▓▓▓▓██▓▓▓▓▓▓▓▓██▓▓██▓▓██▓▓▓▓                        \n" +
                "                        ████████▓▓▓▓██▓▓▓▓▓▓▓▓██▓▓██▓▓██▓▓██                        \n" +
                "                      ██▓▓▓▓▓▓▓▓████████████████▓▓██████▓▓██                        \n" +
                "                      ██▓▓██▓▓▓▓████▒▒░░░░  ░░░░▓▓██▒▒██▓▓██                        \n" +
                "                    ██▓▓▓▓██████████▒▒  ░░░░    ▓▓██▒▒██▓▓████                      \n" +
                "                    ██▓▓▓▓▓▓████  ██▒▒░░    ░░░░▓▓██▒▒▒▒██████                      \n" +
                "                  ██▓▓▓▓▓▓▓▓██    ██▒▒░░░░      ▓▓██▒▒▒▒██▓▓██                      \n" +
                "                  ██▓▓▓▓▓▓▓▓██    ██▒▒░░░░░░░░░░░░▓▓██▒▒██▓▓██                      \n" +
                "                ██▓▓▓▓████▓▓██    ████▒▒░░    ░░░░▓▓██▒▒██▓▓▓▓██                    \n" +
                "                ██▓▓██░░░░██        ████████▓▓▓▓▓▓▓▓████████▓▓▓▓████                \n" +
                "                  ██░░░░████        ████████████████████████▓▓████░░████            \n" +
                "                ██░░░░░░░░██        ██▒▒░░░░░░░░░░░░░░░░████▓▓██░░░░░░░░██          \n" +
                "                ██░░░░░░░░░░██      ██░░    ░░░░░░░░░░░░░░░░████░░░░░░░░██          \n" +
                "                ██░░░░░░░░░░██      ██▒▒░░░░    ░░░░██░░░░░░████░░░░░░██            \n" +
                "                ██░░░░░░░░██      ██▒▒  ▒▒▒▒▒▒░░░░░░██░░░░░░░░████████              \n" +
                "                  ████████        ██████    ▒▒▒▒████░░████░░░░██                    \n" +
                "                                  ██    ████▒▒██  ████▒▒▒▒▒▒▒▒░░██                  \n" +
                "                                ██░░░░░░  ▒▒▒▒██    ██▒▒▒▒▒▒▒▒░░░░██                \n" +
                "                                ██░░░░░░▒▒▒▒██        ██▒▒▒▒▒▒▒▒░░██                \n" +
                "                              ██░░░░░░▒▒▒▒▒▒██        ██▒▒▒▒▒▒▒▒░░██                \n" +
                "                            ██░░░░░░░░▒▒▒▒██            ██▒▒▒▒▒▒▒▒░░██              \n" +
                "                            ██░░░░░░▒▒▒▒▒▒██            ██▒▒▒▒▒▒▒▒░░██              \n" +
                "                          ██░░░░░░▒▒▒▒▒▒██              ██▒▒▒▒▒▒░░░░██              \n" +
                "                        ██░░░░░░▒▒▒▒▒▒██                ██▒▒▒▒▒▒▒▒░░██              \n" +
                "                        ██░░░░░░▒▒▒▒▒▒██                ██▒▒▒▒▒▒▒▒░░██              \n" +
                "                          ██░░▒▒▒▒▒▒██                    ████████████              \n" +
                "                        ████████████                        ████████                \n" +
                "                        ██▓▓▓▓████                          ██▓▓▓▓██                \n" +
                "                      ████████████                        ██▓▓██████████            \n" +
                "                    ██▓▓▓▓▓▓▓▓██                          ██▓▓▓▓▓▓▓▓▓▓▓▓████        \n" +
                "                  ██▓▓▓▓▓▓▓▓▓▓██                          ██████▓▓▓▓▓▓░░░░░░██      \n" +
                "                ██▓▓░░░░░░░░████                                ██████████████      \n" +
                "                ██████████████                                                      \n" +
                "                                                                                    \n");
        System.out.println("Olá, aqui é seu gerenciador de Animes, que bom ter você aqui!\n" +
                "O que você gostaria de fazer?\n" +
                "[0] Para cadastrar um novo anime\n" +
                "[1] Para remover um anime cadastrador\n" +
                "[2] Para procurar um anime específico\n" +
                "[3] Para listar animes cadastrados para 18+\n" +
                "[4] Para pesquisar um anime cadastrados de acordo com o gênero\n" +
                "[5] Para listar animes cadastrados com menos de 20 episódios\n" +
                "[6] Para listar todos os animes cadastrados\n" +
                "[7] Para sair do programa\n" +
                "Digite sua opção: ");
        Integer opcao = Integer.parseInt(input.nextLine());
        while (opcao != 7) {
            switch (opcao) {
                case 0:
                    System.out.println("Digite o nome do Anime:");
                    String nome = input.nextLine();
                    System.out.println("Digite o gênero do Anime: ");
                    String genero = input.nextLine();
                    System.out.println("Digite a classificação etária: ");
                    Integer cla_eta = Integer.parseInt(input.nextLine());
                    System.out.println("Digite a quantidade de episódios: ");
                    Integer qtd_ep = Integer.parseInt(input.nextLine());
                    Animes animes = new Animes(nome, genero, cla_eta, qtd_ep);
                    gerenciadorAnimes.adicionarAnimes(animes);
                    break;
                case 1:
                    System.out.println("Em Processamento");
                    break;
                case 2:
                    System.out.println("Digite o nome do anime que você quer procurar: ");
                    String nome_do_anime = input.nextLine();
                    System.out.println(gerenciadorAnimes.pesquisarAnime(nome_do_anime));
                    break;
                case 3:
                    System.out.println("Esses são os animes para maiores de 18 anos: "+gerenciadorAnimes.animesMaior18());
                    break;
                case 4:
                    System.out.println("Digite o gênero do anime que você quer procurar: ");
                    String genero_anime = input.nextLine();
                    System.out.println(gerenciadorAnimes.animesGenero(genero_anime));
                    break;
                case 5:
                    System.out.println("Esses são os animes com menos de 20 episódios: "+gerenciadorAnimes.animesMenos20episodios());
                    break;
                case 6:
                    System.out.println(gerenciadorAnimes.TodosAnimes());
                    break;
                default:
                    System.err.println("Não tem essa opção");
            }
            System.out.println("Digite uma nova opção: ");
             opcao = Integer.parseInt(input.nextLine());
        }
//        Animes animes2 = new Animes("Balala", "Hentai", 18, 10);

//        gerenciadorAnimes.adicionarAnimes(animes);
//        gerenciadorAnimes.adicionarAnimes(animes2);
//        System.out.println("Animes para maiores de idade: " + gerenciadorAnimes.animesMaior18());
//        System.out.println("Animes com menos de 20 ep: " + gerenciadorAnimes.animesMenos20episodios());
//        System.out.println(gerenciadorAnimes.pesquisarAnime("BOku no pico"));
//        System.out.println(gerenciadorAnimes.animesGenero("Hentai"));
    }
}