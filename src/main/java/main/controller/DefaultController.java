package main.controller;


import main.entity.News;
import main.repo.NewsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class DefaultController {
    private final NewsRepository newsRepository;

    public DefaultController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @RequestMapping("/")
    public String index(Model model)
    {
        List<News> news = newsRepository.findAll();
        model.addAttribute("news", news);
        model.addAttribute("newsCount", news.size());
        return "index";
    }

    @RequestMapping(method = {RequestMethod.OPTIONS, RequestMethod.GET}, value = "/**/{path:[^\\\\.]*}")
    public String redirectToIndex() {
        return "forward:/";
    }
}
