/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="isbn")
    private String isbn;
        
    @Column(name="title")
    private String titulo;
    
    @Column(name="price")
    private Float preco;
    
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publishers editora;

    
    public String getTitulo() {
        return titulo;
    }

    public Publishers getEditora() {
        return editora;
    }

    public void setEditora(Publishers editora) {
        this.editora = editora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
    
        @Override
    public String toString() {
    return this.getIsbn();
    }
    
}
