package com.secor.restroservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dishes")
@Getter @Setter
public class Dish {

    @Id
    public String dishid;
    public String name;
    public String description;
    public String restroid;

}
