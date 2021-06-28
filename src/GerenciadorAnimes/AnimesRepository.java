package GerenciadorAnimes;

import java.util.List;

public interface AnimesRepository {
    boolean adicionarAnimes(Animes novoAnime);
    List<String> animesMenos20episodios();
    List<String> animesGenero(String generoAnime);
    List<String> animesMaior18();
    boolean removerAnime(String nomeAnime) throws ErroRemover;
    String pesquisarAnime(String nomeAnime) throws ErroRemover;
    List<Animes> TodosAnimes();
}
