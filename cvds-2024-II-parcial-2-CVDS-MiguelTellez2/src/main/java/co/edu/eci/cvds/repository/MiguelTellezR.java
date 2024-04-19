package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.MiguelTellezM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MiguelTellezR extends JpaRepository<MiguelTellezM, String> {
    public List<MiguelTellezM> findByNumero(String numero);

}
