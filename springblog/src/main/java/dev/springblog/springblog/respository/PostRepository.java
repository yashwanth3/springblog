package dev.springblog.springblog.respository;

import dev.springblog.springblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository  extends JpaRepository<Post, Long> {
}
