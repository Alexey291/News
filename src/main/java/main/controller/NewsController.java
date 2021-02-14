package main.controller;


import main.entity.News;
import main.services.CategoryService;
import main.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
public class NewsController {
    private final NewsService newsService;
    private final CategoryService categoryService;

    @Autowired
    public NewsController(NewsService newsService, CategoryService categoryService) {
        this.newsService = newsService;
        this.categoryService = categoryService;
    }


    @GetMapping("/news")
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }

    @PostMapping("/news")
    public void putNews(@RequestBody News news){
        newsService.putNews(news);
    }

    @DeleteMapping("/news")
    public void deleteNews(@RequestParam Integer id){
        newsService.delNews(id);
    }

    @GetMapping("/news/{id}")
    public News getOneNews(@PathVariable Integer id){
        return newsService.findById(id);
    }

    @GetMapping("/news/search")
    public List<News> getOneNews(@RequestParam(required = false,defaultValue = "")String query){
        return newsService.findByQuery(query);
    }

    @GetMapping("/news/category")
    public List<News> getByCategory(@RequestParam Integer id){
        return newsService.findByCategory(id);
    }

}
