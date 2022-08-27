package oauth.login;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private String picture;

    @Builder
    public User(String name, String email, String picture){
        this.name = name;
        this.email = email;
        this.picture = picture;

    }

}
