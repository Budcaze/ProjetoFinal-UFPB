package GerenciadorAnimes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAnimes implements AnimesRepository {
    private List<Animes> animes;
   private String mensagem = "Anime não Encontrado!";

    public GerenciadorAnimes (){
        this.animes = new ArrayList<>();
    }

    public GerenciadorAnimes(List<Animes> animes) {
        this.animes = animes;
    }

    @Override
    public boolean adicionarAnimes(Animes novoAnime) {
        for(Animes a : animes){
            if(a.equals(novoAnime)){
                return false;
            }
        }
        animes.add(novoAnime);
        return true;
    }

    @Override
    public List<String> animesMenos20episodios() {
        List<String> animes20 = new ArrayList<>();
        for(Animes a : animes){
            if(a.getQtd_episodios() < 20){
                animes20.add(a.getNome());
            }
        }
        return animes20;
    }

    @Override
    public List<String> animesGenero(String generoAnime) throws AnimeNEncontrado {
        List<String> animesgenero = new ArrayList<>();
        for(Animes a : animes){
            if(a.getGenero().equalsIgnoreCase(generoAnime)){
                animesgenero.add(a.getNome());
            }
        }
        if(animesgenero.size() == 0){
            throw new AnimeNEncontrado(mensagem);
        }
        return animesgenero;
    }

    @Override
    public List<String> animesMaior18() {
        List<String> animesmais18 = new ArrayList<>();
        for(Animes a : animes){
            if(a.getClassificacao_etaria() >= 18){
                animesmais18.add(a.getNome());
            }
        }

        return animesmais18;
    }

    @Override
    public boolean removerAnime(String nomeAnime) throws AnimeNEncontrado {
        for(Animes a : animes){
            if(a.getNome().equalsIgnoreCase(nomeAnime)){
                animes.remove(a);
                return true;
            }
        }
        throw new AnimeNEncontrado(mensagem);
    }

    @Override
    public String pesquisarAnime(String nomeAnime) throws AnimeNEncontrado {
        for(Animes a : animes){
            if(a.getNome().equalsIgnoreCase(nomeAnime)){
                return a.toString();
            }
        }
        throw new AnimeNEncontrado(mensagem);
    }

    @Override
    public List<Animes> TodosAnimes() {
        return animes;
    }
}
