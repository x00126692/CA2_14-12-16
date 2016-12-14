package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.*;

@Entity
public class Product extends Model{

@Id
private Long id;

@Constraints.Required
private String name;

@Constraints.Required
private String description;

@Constraints.Required
private double price;

public Product(){

}

public Product(Long id, String name,String description, double price){

  this.id=id;
  this.name=name;
  this.description=description;
  this.price=price;

}

public long getId(){
  return id;
}

public void setId(Long id){
  this.id=id;
}

public String getName(){
  return name;
}

public void setName(String name){
  this.name=name;
}

public String getDescription(){
  return description;
}

public void setDescription(String description){
  this.description=description;
}

public Double getPrice(){
  return price;
}

public void setPrice(double price){
  this.price=price;
}

public static Finder<Long,Product> find = new Finder<Long,Product>(Product.class);

public static List<Product> findAll() {
  return Product.find.all();
}

}
