package GerenciadorAnimes;

import java.util.List;

public interface AnimesRepository {
    boolean adicionarAnimes(Animes novoAnime) throws AnimeJaCadastradoException;
    List<String> animesMenos20episodios();
    List<String> animesGenero(String generoAnime) throws AnimeNEncontradoException;
    List<String> animesMaior18();
    boolean removerAnime(String nomeAnime) throws AnimeNEncontradoException;
    String pesquisarAnime(String nomeAnime) throws AnimeNEncontradoException;
    List<Animes> TodosAnimes() throws ListaVaziaException;
}
