package com.movies.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class MovieModel {
    @Id
    private String movieId;
    private String title;
    private String description;
    private String trailer;
    private String views;

    public MovieModel(){

    }
    public MovieModel(String movieId, String title ,String description,String trailer,String views ) {
        this.movieId=movieId;
        this.title=title;  
        this.description=description;
        this.trailer=trailer; 
        this.views=views;
    }

    public void setMovieId(String movieId){
        this.movieId=movieId;
    }
    public String getMovieId(){
        return movieId;
    }
    public void setDescription(String desc){
        this.description=desc;
    }
    public String getDescription(){
        return description;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setTrailer(String trailer){
        this.trailer=trailer;
    }
    public String getTrailer(){
        return trailer;
    }
    public void setViews(String views){
        this.views=views;
    }
    public String getViews(){
        return views;
    }


}
