package academy.devdojo.springboot2.services;

import academy.devdojo.springboot2.domains.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    public List<Anime> listAll(){
        return List.of( new Anime(1L,"DBZ"), new Anime(2L,"One Piece"));
    }
}
