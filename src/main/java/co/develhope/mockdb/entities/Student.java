package co.develhope.mockdb.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_studente;

    private String nome;
    private String cognome;

    @Column(unique = true)
    private String email;
}