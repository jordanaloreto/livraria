package com.livraria_mvc.model;

import java.sql.Date;

public class Emprestimo {
    private int id;
    private Date dataEmprestimo;

    public Emprestimo(int id, Date dataEmprestimo){
        super();
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

}
