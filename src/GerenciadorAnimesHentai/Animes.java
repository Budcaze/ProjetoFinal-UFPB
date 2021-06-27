package GerenciadorAnimesHentai;

import java.util.Objects;

public class Animes {
    private String nome;
    private String genero;
    private Integer classificacao_etaria;
    private Integer qtd_episodios;

    public Animes(String nome, String genero, Integer classificacao_etaria, Integer qtd_episodios) {
        this.nome = nome;
        this.genero = genero;
        this.classificacao_etaria = classificacao_etaria;
        this.qtd_episodios = qtd_episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getClassificacao_etaria() {
        return classificacao_etaria;
    }

    public void setClassificacao_etaria(Integer classificacao_etaria) {
        this.classificacao_etaria = classificacao_etaria;
    }

    public Integer getQtd_episodios() {
        return qtd_episodios;
    }

    public void setQtd_episodios(Integer qtd_episodios) {
        this.qtd_episodios = qtd_episodios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animes animes = (Animes) o;
        return Objects.equals(nome, animes.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Animes -> \n" +
                "Nome: " + nome+"\nGênero: " + genero +
                "\nClassificação Etária: " +
                classificacao_etaria +
                "\nQuantidade de episódios: " + qtd_episodios;
    }
}
