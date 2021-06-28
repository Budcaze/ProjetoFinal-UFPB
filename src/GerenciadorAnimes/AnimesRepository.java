package GerenciadorAnimes;

import java.util.List;

public interface AnimesRepository {
    boolean adicionarAnimes(Animes novoAnime);
    List<String> animesMenos20episodios();
    List<String> animesGenero(String generoAnime) throws AnimeNEncontrado;
    List<String> animesMaior18();
    boolean removerAnime(String nomeAnime) throws AnimeNEncontrado;
    String pesquisarAnime(String nomeAnime) throws AnimeNEncontrado;
    List<Animes> TodosAnimes();
}
