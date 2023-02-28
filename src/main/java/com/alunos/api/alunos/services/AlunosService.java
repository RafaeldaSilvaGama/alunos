package com.alunos.api.alunos.services;

import com.alunos.api.alunos.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunosService {

    final
    AlunoRepository alunoRepository;

    public AlunosService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }
}
