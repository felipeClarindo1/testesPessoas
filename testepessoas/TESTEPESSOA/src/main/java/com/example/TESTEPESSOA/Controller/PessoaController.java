package com.example.TESTEPESSOA.Controller;

import com.example.TESTEPESSOA.Models.PessoaModel;
import com.example.TESTEPESSOA.Services.PessoaServices;
import com.example.TESTEPESSOA.dtos.PessoaDto;
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
@RequestMapping("/pessoa")

public class PessoaController {

    final PessoaServices pessoaServices;

    public PessoaController (PessoaServices pessoaServices) {
        this.pessoaServices = pessoaServices;
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody @Valid PessoaDto pessoaDto){

        var pessoaModel = new PessoaModel();
        BeanUtils.copyProperties(pessoaDto,pessoaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaServices.save(pessoaModel));
    }
    @GetMapping
    public ResponseEntity<Page<PessoaModel>> getAllParkingSpots(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaServices.findAll(pageable));
    }
    @GetMapping("/{pess2_cod}")
    public ResponseEntity<Object> getOneParkingSpot(@PathVariable(value = "id") UUID id){
        Optional<PessoaModel> pessoaModelOptional = pessoaServices.findById(id);
        if (!pessoaModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(pessoaModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteParkingSpot(@PathVariable(value = "id") UUID id){
        Optional<PessoaModel> pessoaModelOptional = pessoaServices.findById(id);
        if (!pessoaModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found.");
        }
        pessoaServices.delete(pessoaModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Parking Spot deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateParkingSpot(@PathVariable(value = "id") UUID id,
                                                    @RequestBody @Valid PessoaDto pessoaDto){
        Optional<PessoaModel> pessoaModelOptional = pessoaServices.findById(id);
        if (!pessoaModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found.");
        }
        var pessoaModel = new PessoaModel();
        BeanUtils.copyProperties(pessoaDto, pessoaModel);
        pessoaModel.setId(pessoaModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(pessoaServices.save(pessoaModel));
    }


}
