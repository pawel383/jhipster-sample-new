package pl.pawel.jhipster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawel.jhipster.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
