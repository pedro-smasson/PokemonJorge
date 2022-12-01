package br.com.PokemonJorge.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@Entity
@Table(name = "pokemons")
@AllArgsConstructor
@NoArgsConstructor
public class PokemonModel extends RepresentationModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @ApiModelProperty(notes = "Pokemon's ID")
    private long id;

    @Column(length = 15, nullable = false)
    @Getter @Setter
    @ApiModelProperty(notes = "Pokemon's name")
    private String name;

    @Column(length = 20, nullable = false)
    @Getter @Setter
    @ApiModelProperty(notes = "Pokemon's type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    @Getter @Setter
    @ApiModelProperty(notes = "Trainer's pokemon(s)")
    private TrainerModel trainer;
}