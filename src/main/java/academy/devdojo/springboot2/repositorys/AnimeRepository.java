package academy.devdojo.springboot2.repositorys;

import academy.devdojo.springboot2.domains.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
