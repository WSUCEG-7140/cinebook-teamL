package com.backend.server.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "tickets")
public class Tickets {
    @Id
    private int ticketId;
    private int movieId;
    private String movieName;
    private String theatre;
}
