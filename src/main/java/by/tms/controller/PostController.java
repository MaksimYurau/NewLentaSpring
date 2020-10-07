package by.tms.controller;

import by.tms.domain.Post;
import by.tms.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/post")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping
    public ModelAndView getPage(ModelAndView modelAndView){
        modelAndView.setViewName("createPost");
        return modelAndView;
    }
    @PostMapping
    public ModelAndView createPost(Post post, ModelAndView modelAndView){
        postService.save(post);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
    @GetMapping(path = "/viewPost")
    public ModelAndView viewPost(@RequestParam long id, ModelAndView modelAndView){

    }

}
