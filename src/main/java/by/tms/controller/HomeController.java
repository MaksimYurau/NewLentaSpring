package by.tms.controller;

import by.tms.domain.Post;
import by.tms.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private PostService postService;
    @GetMapping
    public ModelAndView homePage(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        List<Post> all = postService.getAll();
        modelAndView.addObject("post", all);
        return modelAndView;

    }



}
