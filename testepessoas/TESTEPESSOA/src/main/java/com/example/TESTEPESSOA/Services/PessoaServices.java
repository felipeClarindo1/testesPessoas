package com.example.TESTEPESSOA.Services;

import com.example.TESTEPESSOA.Models.PessoaModel;
import com.example.TESTEPESSOA.Repositories.PessoaRepositorie;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PessoaServices {
    final PessoaRepositorie pessoaRepositorie;

    public PessoaServices(PessoaRepositorie pessoaRepositorie) {
        this.pessoaRepositorie = pessoaRepositorie;
    }

    @Transactional
    public PessoaModel save(PessoaModel pessoaModel) {
        return pessoaRepositorie.save(pessoaModel);
    }



    public Page<PessoaModel> findAll(Pageable pageable) {
        return pessoaRepositorie.findAll(pageable);
    }

    public Optional<PessoaModel> findById(UUID pess2_cod) {
        return pessoaRepositorie.findById(pess2_cod);
    }

    @Transactional
    public void delete(PessoaModel pessoaModel) {
        pessoaRepositorie.delete(pessoaModel);
    }
}
