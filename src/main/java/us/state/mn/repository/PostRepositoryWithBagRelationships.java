package us.state.mn.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import us.state.mn.domain.Post;

public interface PostRepositoryWithBagRelationships {
    Optional<Post> fetchBagRelationships(Optional<Post> post);

    List<Post> fetchBagRelationships(List<Post> posts);

    Page<Post> fetchBagRelationships(Page<Post> posts);
}
