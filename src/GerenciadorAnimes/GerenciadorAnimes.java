package GerenciadorAnimes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorAnimes implements AnimesRepository {
    private List<Animes> animes;
    private List<String> animesTexto;
   private String mensagem = "Anime não Encontrado!";

    public GerenciadorAnimes (){
        this.animes = new ArrayList<>();
    }

    public GerenciadorAnimes(List<Animes> animes) {
        this.animes = animes;
    }

    @Override
    public boolean adicionarAnimes(Animes novoAnime) throws AnimeJaCadastradoException {
        for(Animes a : animes){
            if(a.equals(novoAnime)){
                throw new AnimeJaCadastradoException("Erro! O anime " + a.getNome() + " já foi cadastrado.");
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
    public List<String> animesGenero(String generoAnime) throws AnimeNEncontradoException {
        List<String> animesgenero = new ArrayList<>();
        for(Animes a : animes){
            if(a.getGenero().equalsIgnoreCase(generoAnime)){
                animesgenero.add(a.getNome());
            }
        }
        if(animesgenero.size() == 0){
            throw new AnimeNEncontradoException(mensagem);
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
    public boolean removerAnime(String nomeAnime) throws AnimeNEncontradoException {
        for(Animes a : animes){
            if(a.getNome().equalsIgnoreCase(nomeAnime)){
                animes.remove(a);
                return true;
            }
        }
        throw new AnimeNEncontradoException(mensagem);
    }

    @Override
    public String pesquisarAnime(String nomeAnime) throws AnimeNEncontradoException {
        for(Animes a : animes){
            if(a.getNome().equalsIgnoreCase(nomeAnime)){
                return a.toString();
            }
        }
        throw new AnimeNEncontradoException(mensagem);
    }

    @Override
    public List<Animes> TodosAnimes() throws ListaVaziaException {
        if(animes.size() == 0){
            throw new ListaVaziaException("Não tem animes cadastrados");
        }
        return animes;
    }
    @Override
    public String salvar(){
        try{
            FileWriter fw = new FileWriter("Animes.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(animes);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> retornar() {
        try {
            FileReader fr = new FileReader("Animes.txt");
            BufferedReader bf = new BufferedReader(fr);
            while(true){
                String linha = bf.readLine();
                animesTexto.add(linha);
                if(linha == null){
                    break;
                }
                fr.close();
                bf.close();
                return animesTexto;
            }

        }catch (IOException e){
            e.getMessage();
        }
        return null;
    }

}
