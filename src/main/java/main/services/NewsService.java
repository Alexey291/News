package main.services;

import main.entity.News;
import main.repo.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService {
    private final NewsRepository newsRepository;

    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public List<News> getAllNews(){
        return newsRepository.findAll();
    }

    public void putNews(News news){
        newsRepository.save(news);
    }

    public void delNews(Integer id){
        Optional<News> news = newsRepository.findById(id);
        news.ifPresent(newsRepository::delete);
    }

    public News findById (Integer id){
        Optional<News> news = newsRepository.findById(id);
        return news.orElseGet(News::new);
    }

    public List<News> findByQuery(String query){
        return newsRepository.findByQuery(query);
    }

    public List<News> findByCategory(Integer categoryId){
        return newsRepository.getNewsByCategory(categoryId);
    }
}
