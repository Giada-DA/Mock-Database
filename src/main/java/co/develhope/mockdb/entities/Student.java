package co.develhope.mockdb.entities;

import javax.persistence.*;


@Table
@Entity
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_studente;

    private String nome;
    private String cognome;

    @Column(unique = true)
    private String email;

    public Student() {
    }

    public Student(long id_studente, String nome, String cognome, String email) {
        this.id_studente = id_studente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public long getId_studente() {
        return id_studente;
    }

    public void setId_studente(long id_studente) {
        this.id_studente = id_studente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}