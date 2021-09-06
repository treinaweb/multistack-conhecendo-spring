package br.com.treinaweb.conhecendospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.conhecendospring.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long> {
    
}
