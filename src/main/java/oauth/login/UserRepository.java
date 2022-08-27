package oauth.login;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {
    private static Map<Long,User> store = new HashMap<>();
}
