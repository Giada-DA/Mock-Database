package co.develhope.mockdb.entities;

import javax.persistence.*;


@Table
@Entity
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String nome;
    private String cognome;

    @Column(unique = true)
    private String email;

    public Student() {
    }

    public Student(long Id, String nome, String cognome, String email) {
        this.Id = Id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
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