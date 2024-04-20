package dev.farddin.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document( collection ="reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {
    @Id
    public ObjectId id;
    public String reviewbody;



}
