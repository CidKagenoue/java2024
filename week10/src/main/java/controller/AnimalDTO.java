package controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import entity.AnimalType;

public record AnimalDTO(
        @JsonProperty("id")
        Integer id,
        @JsonProperty("name")
        String name,
        @JsonProperty("type")
        String type,
        @JsonProperty("owner")
        String owner) {


    @Override
    public String toString() {
        return "AnimalDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
