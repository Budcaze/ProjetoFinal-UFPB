package GerenciadorAnimes;

import java.io.*;
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
    public List<String> animesMenos20episodios() throws ListaVaziaException{
        List<String> animes20 = new ArrayList<>();
        for(Animes a : animes){
            if(a.getQtd_episodios() < 20){
                animes20.add(a.getNome());
            }
        }
        if(animes20.size() == 0){
            throw new ListaVaziaException("Não existe anime com menos de 20 ep");
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
    public List<String> animesMaior18() throws ListaVaziaException{
        List<String> animesmais18 = new ArrayList<>();
        for(Animes a : animes){
            if(a.getClassificacao_etaria() >= 18){
                animesmais18.add(a.getNome());
            }
        }
        if(animesmais18.size() == 0){
            throw new ListaVaziaException("Não tem animes para maiores de 18 anos");
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
        try(PrintWriter pw = new PrintWriter(new FileWriter("Animes.txt", false))){
            for(Animes a : animes){
                pw.println(a.getNome() + "#" + a.getGenero()  + "#" +
                a.getClassificacao_etaria() + "#" + a.getQtd_episodios());
            }
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> retornar(String nomeArquivo) throws IOException {
            List<String> linhaAnimes = new ArrayList<>();
            BufferedReader leitor = null;
            try {
                leitor = new BufferedReader(new FileReader(nomeArquivo));
                String linha;
                do {
                    linha = leitor.readLine();
                    if (linha!=null) {
                        linhaAnimes.add(linha);
                    }
                } while(linha!=null);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (leitor != null) {
                    leitor.close();
                }
            }
            return linhaAnimes;
        }

    @Override
    public List<Animes> retornarAnimes() throws IOException {
        List<String> textoAnime = this.retornar("Animes.txt");
        try {
            for(String s : textoAnime){
                String[] dadoslinha = s.split("#");
                Animes a = new Animes(dadoslinha[0], dadoslinha[1], Integer.parseInt(dadoslinha[2]), Integer.parseInt(dadoslinha[3]));
                animes.add(a);
            }
        }catch (Exception e){
        }
        return animes;
    }

}
