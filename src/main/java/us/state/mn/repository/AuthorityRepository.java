package us.state.mn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import us.state.mn.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
