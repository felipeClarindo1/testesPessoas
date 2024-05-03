package com.example.TESTEPESSOA.Repositories;

import com.example.TESTEPESSOA.Models.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EnderecoRepositorie extends JpaRepository<EnderecoModel, UUID> {
}
