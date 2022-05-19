package academy.devdojo.springboot2.mapper;

import academy.devdojo.springboot2.domains.Anime;
import academy.devdojo.springboot2.requests.AnimePostRequestBory;
import academy.devdojo.springboot2.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBory animePostRequestBory);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
