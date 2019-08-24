package unidad1.service.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import unidad1.domain.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

}