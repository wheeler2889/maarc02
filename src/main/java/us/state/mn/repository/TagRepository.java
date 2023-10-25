package us.state.mn.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import us.state.mn.domain.Tag;

/**
 * Spring Data JPA repository for the Tag entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {}
