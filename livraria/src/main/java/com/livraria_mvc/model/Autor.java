package com.livraria_mvc.model;

public class Autor {
    private int id;
    private String nomeAutor;

    public Autor(int id, String nomeAutor){
        super();
        this.id = id;
        this.nomeAutor = nomeAutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    

}
