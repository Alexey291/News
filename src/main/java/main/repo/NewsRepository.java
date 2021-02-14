package main.repo;

import main.entity.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {


    @Query(value = "SELECT * FROM news1 nw WHERE nw.id = (SELECT news_id FROM category_news WHERE category_id = :category)",
            nativeQuery = true)
    List<News> getNewsByCategory(@Param("category") Integer category);

    @Query(value = "SELECT * " +
            "FROM news1 nw " +
            "WHERE nw.text LIKE CONCAT ('%',:query,'%') OR nw.title LIKE CONCAT ('%',:query,'%')",
            nativeQuery = true)
    List<News> findByQuery (@Param("query") String query);
}
