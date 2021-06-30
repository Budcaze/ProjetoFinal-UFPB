package GerenciadorAnimes;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        gerenciadorAnimes.retornar();
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
                    try{
                        gerenciadorAnimes.adicionarAnimes(animes);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    break;
                case 1:
                    System.out.println("Quer remover qual anime: ");
                    String nome_do_anime_remover = input.nextLine();
                    try {
                        gerenciadorAnimes.removerAnime(nome_do_anime_remover);
                        System.out.println("Anime removido!");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    System.out.println("Digite o nome do anime que você quer procurar: ");
                    String nome_do_anime = input.nextLine();
                    try{
                        System.out.println(gerenciadorAnimes.pesquisarAnime(nome_do_anime));
                    } catch (Exception e){
                        e.printStackTrace();
                    }

                    break;
                case 3:
                    System.out.println("Esses são os animes para maiores de 18 anos: "+gerenciadorAnimes.animesMaior18());
                    break;
                case 4:
                    System.out.println("Digite o gênero do anime que você quer procurar: ");
                    String genero_anime = input.nextLine();
                    try{
                        System.out.println(gerenciadorAnimes.animesGenero(genero_anime));
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Esses são os animes com menos de 20 episódios: "+gerenciadorAnimes.animesMenos20episodios());
                    break;
                case 6:
                    try{
                        System.out.println(gerenciadorAnimes.TodosAnimes());
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    break;
                default:
                    System.err.println("Não tem essa opção");
                    break;
            }

            System.out.println("Digite uma nova opção: ");
             opcao = Integer.parseInt(input.nextLine());

        }
        gerenciadorAnimes.salvar();
        System.out.println("╔═╗╔═╗░░░░╔╗░░░░╔═══╦╗░░░░░░░░░░░░╔╗░░╔╗\n" +
                "║║╚╝║║░░░╔╝╚╗░░░║╔═╗║║░░░░░░░░░░░░║║░░║║\n" +
                "║╔╗╔╗╠╗╔╦╬╗╔╬══╗║║░║║╚═╦═╦╦══╦══╦═╝╠══╣║\n" +
                "║║║║║║║║╠╣║║║╔╗║║║░║║╔╗║╔╬╣╔╗║╔╗║╔╗║╔╗╠╝\n" +
                "║║║║║║╚╝║║║╚╣╚╝║║╚═╝║╚╝║║║║╚╝║╔╗║╚╝║╚╝╠╗\n" +
                "╚╝╚╝╚╩══╩╝╚═╩══╝╚═══╩══╩╝╚╩═╗╠╝╚╩══╩══╩╝\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░╔═╝║░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░╚══╝░░░░░░░░░░\n");
        System.out.println("⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿\n" +
                "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿\n" +
                "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿\n" +
                "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋\n" +
                "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀\n" +
                "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿\n" +
                "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟\n" +
                "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃\n" +
                "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃\n" +
                "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄\n" +
                "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄");

//        Animes animes2 = new Animes("Balala", "Hentai", 18, 10);
//        Animes animes = new Animes("Boku no pico", "Hentai", 18, 3);
//        Animes animes2 = new Animes("Pokemon", "Acao", 10, 800);
//        gerenciadorAnimes.adicionarAnimes(animes);
//        gerenciadorAnimes.adicionarAnimes(animes2);
//        System.out.println(gerenciadorAnimes.removerAnime("Boku no pico"));
//        System.out.println(gerenciadorAnimes.TodosAnimes());
    }
}
