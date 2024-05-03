package com.example.TESTEPESSOA.Controller;

import com.example.TESTEPESSOA.Models.EnderecoModel;
import com.example.TESTEPESSOA.Services.EnderecoService;
import com.example.TESTEPESSOA.dtos.EnderecoDto;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/endereco")
public class EnderecoController {

    final EnderecoService enderecoService;

    public EnderecoController (EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @PostMapping
    public ResponseEntity<Object> savePakingSpot(@RequestBody @Valid EnderecoDto enderecoDto){

        var enderecoModel = new EnderecoModel();
        BeanUtils.copyProperties(enderecoDto,enderecoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.save(enderecoModel));
    }
    @GetMapping
    public ResponseEntity<Page<EnderecoModel>> getAllParkingSpots(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.findAll(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneParkingSpot(@PathVariable(value = "id") UUID id){
        Optional<EnderecoModel> enderecoModelOptional = enderecoService.findById(id);
        if (!enderecoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(enderecoModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteParkingSpot(@PathVariable(value = "id") UUID id){
        Optional<EnderecoModel> enderecoModelOptional = enderecoService.findById(id);
        if (!enderecoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found.");
        }
        enderecoService.delete(enderecoModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Parking Spot deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateParkingSpot(@PathVariable(value = "id") UUID id,
                                                    @RequestBody @Valid EnderecoDto enderecoDto){
        Optional<EnderecoModel> enderecoModelOptional = enderecoService.findById(id);
        if (!enderecoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found.");
        }
        var enderecoModel = new EnderecoModel();
        BeanUtils.copyProperties(enderecoDto, enderecoModel);
        enderecoModel.setId(enderecoModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.save(enderecoModel));
    }


}
