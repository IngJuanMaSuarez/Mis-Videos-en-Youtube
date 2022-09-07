package com.crud.pokemon.model;

import com.crud.pokemon.enums.Enum_Tipo;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;
    private int vida;
    private int ataque;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private Enum_Tipo tipo;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "entrenador_id")
//    private Entrenador entrenador;

//    @ManyToOne
//    @JoinColumn(name = "entrenador_id")
//    private Entrenador entrenador;

    @ManyToMany
    @JoinTable(name = "entrenador_pokemon")
    private List<Entrenador> entrenadors;

}
