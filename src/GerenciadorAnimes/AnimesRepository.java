package GerenciadorAnimes;

import java.io.IOException;
import java.util.List;

public interface AnimesRepository {
    boolean adicionarAnimes(Animes novoAnime) throws AnimeJaCadastradoException;
    List<String> animesMenos20episodios() throws ListaVaziaException;
    List<String> animesGenero(String generoAnime) throws AnimeNEncontradoException;
    List<String> animesMaior18() throws  ListaVaziaException;
    boolean removerAnime(String nomeAnime) throws AnimeNEncontradoException;
    String pesquisarAnime(String nomeAnime) throws AnimeNEncontradoException;
    List<Animes> TodosAnimes() throws ListaVaziaException;
    String salvar();
    List<String> retornar(String nomeArquivo) throws IOException;
    List<Animes> retornarAnimes() throws IOException;
}
