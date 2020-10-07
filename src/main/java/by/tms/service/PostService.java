package by.tms.service;

import by.tms.domain.Post;
import by.tms.storage.PostStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostStorage postStorage;
    public void save(Post post){
        postStorage.save(post);
    }
    public List<Post> getAll(){
       return postStorage.getAll();
    }

}
