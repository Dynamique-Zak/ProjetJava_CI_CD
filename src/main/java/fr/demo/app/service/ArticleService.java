package fr.demo.app.service;

import fr.demo.app.bo.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    public ServiceResponse<List<Article>> getAll() {
        List<Article> articles = new ArrayList<Article>();

        return ServiceResponse.performResponse("200", "Les articles ont été récupérés avec succès", articles);
    }
}
