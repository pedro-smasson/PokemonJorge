package br.com.PokemonJorge.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@Entity
@Table(name = "trainers")
@AllArgsConstructor
@NoArgsConstructor
public class TrainerModel extends RepresentationModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @ApiModelProperty(notes = "Trainer's ID")
    private long id;

    @Column(length = 50, nullable = false)
    @Getter @Setter
    @ApiModelProperty(notes = "Trainer's name")
    private String name;

    @Column(length = 1, nullable = false)
    @Getter @Setter
    @ApiModelProperty(notes = "Trainer's gender (M or F)")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    @Getter @Setter
    @ApiModelProperty(notes = "Trainer's pokemon(s)")
    private PokemonModel pokemon;
}