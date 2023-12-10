package org.EMSI.Voiture.Repository;

import org.EMSI.Voiture.Model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Long> {

    List<Voiture> findByClientId(Long id);
}
