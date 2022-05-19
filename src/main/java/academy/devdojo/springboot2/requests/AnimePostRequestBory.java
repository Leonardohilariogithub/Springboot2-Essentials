package academy.devdojo.springboot2.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePostRequestBory {
    @NotEmpty(message = "The anime name cannot be empty")
    private String name;
}
