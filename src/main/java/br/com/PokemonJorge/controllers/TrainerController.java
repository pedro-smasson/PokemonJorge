package br.com.PokemonJorge.controllers;

import br.com.PokemonJorge.models.TrainerModel;
import br.com.PokemonJorge.services.TrainerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/trainer/v1")
public class TrainerController
{
    @Autowired
    private TrainerService _service;

    @GetMapping("/{id}")
    @ApiOperation(value = "Returns a trainer by ID")
    public TrainerModel findTrainerById(@PathVariable("id") long id)
    {
        var trainer = _service.findTrainerById(id);

        if(trainer.isPresent())
        {
            trainer.get();
        }
        return null;
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TrainerModel save(@RequestBody TrainerModel model)
    {
        return _service.save(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id)
    {
        Optional<TrainerModel> clientFound = _service.findTrainerById(id);

        if(clientFound.isPresent())
        {
            _service.delete(id);
            return ResponseEntity.ok().build();
        }
        return null;
    }
}