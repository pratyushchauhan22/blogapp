package com.pratyush.blogapp.articles;


import org.springframework.stereotype.Service;

@Service
public class ArticlesService {
    private ArticlesRepository articlesRepository;

    public ArticlesService(ArticlesRepository articlesRepository) {
        this.articlesRepository = articlesRepository;
    }
    public Iterable<ArticleEntity> getAllArticle(){
        return articlesRepository.findAll();
    }
    public ArticleEntity getArticleBySlug(String slug){

        var article =  articlesRepository.findBySlug(slug);
        if(article== null){
            throw new ArticleNotFoundException(slug);
        }
        return article;
    }
    public ArticleEntity createArticle(ArticleEntity article){
        return articlesRepository.save(article); 
    }



    static class ArticleNotFoundException extends IllegalArgumentException{

        public  ArticleNotFoundException(String slug){
            super("User" + slug +"not found");
        }
    }
}
