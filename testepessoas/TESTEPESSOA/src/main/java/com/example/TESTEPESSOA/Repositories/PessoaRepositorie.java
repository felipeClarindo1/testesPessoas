package com.example.TESTEPESSOA.Repositories;

import com.example.TESTEPESSOA.Models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PessoaRepositorie extends JpaRepository<PessoaModel, UUID> {
}
