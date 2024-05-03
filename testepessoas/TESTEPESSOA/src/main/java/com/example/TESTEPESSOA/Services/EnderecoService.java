package com.example.TESTEPESSOA.Services;

import com.example.TESTEPESSOA.Models.EnderecoModel;
import com.example.TESTEPESSOA.Repositories.EnderecoRepositorie;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class EnderecoService {

    final EnderecoRepositorie enderecoRepositorie;

    public EnderecoService(EnderecoRepositorie enderecoRepositorie) {
        this.enderecoRepositorie = enderecoRepositorie;
    }

    @Transactional
    public EnderecoModel save(EnderecoModel enderecoModel) {
        return enderecoRepositorie.save(enderecoModel);
    }



    public Page<EnderecoModel> findAll(Pageable pageable) {
        return enderecoRepositorie.findAll(pageable);
    }

    public Optional<EnderecoModel> findById(UUID id) {
        return enderecoRepositorie.findById(id);
    }

    @Transactional
    public void delete(EnderecoModel enderecoModel) {
        enderecoRepositorie.delete(enderecoModel);
    }

}
