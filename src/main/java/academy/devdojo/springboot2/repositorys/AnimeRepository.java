package academy.devdojo.springboot2.repositorys;

import academy.devdojo.springboot2.domains.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
