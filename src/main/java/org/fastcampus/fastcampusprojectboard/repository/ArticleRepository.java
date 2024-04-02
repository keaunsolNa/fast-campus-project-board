package org.fastcampus.fastcampusprojectboard.repository;

import org.fastcampus.fastcampusprojectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
