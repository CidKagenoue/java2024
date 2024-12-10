package controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public record ConsultDTO(
        @JsonProperty("id")
        Integer id,
        @JsonProperty("animalId")
        int animalId,
        @JsonProperty("date")
        @JsonFormat(pattern = "yyyy-mm-dd")
        LocalDate date,
        @JsonProperty("reason")
        String reason) {

    @Override
    public String toString() {
        return "ConsultDTO{" +
                "id=" + id +
                ", animalId=" + animalId +
                ", date=" + date +
                ", reason='" + reason + '\'' +
                '}';
    }
}
