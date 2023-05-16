package com.movies.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class TicketModel {
    @Id
    private Integer ticketId;
    private String name;
    private String amount;
    private Integer movieId;

public TicketModel(){

}
public  TicketModel(Integer ticketId, String name,String amount,Integer movieId) {
    this.ticketId=ticketId;
    this.name=name;
    this.amount=amount;
    this.movieId=movieId;
}  
public void setTicketId(Integer ticketId){
    this.ticketId=ticketId;
}
public Integer getTicketId(){
    return ticketId;
}
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
public void setAmount(String amount){
    this.amount=amount;
}
public String getAmount(){
    return amount;
}
public void setMovieId(Integer movieId){
    this.movieId=movieId;
}
public Integer getMovieId(){
    return movieId;
}




}
