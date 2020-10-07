package by.tms.storage;

import by.tms.domain.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostStorage {
    private List<Post> posts = new ArrayList<>();

    public void save(Post post){
        posts.add(post);
    };
    public List<Post> getAll(){
        return new ArrayList<>(posts);
    }


}
