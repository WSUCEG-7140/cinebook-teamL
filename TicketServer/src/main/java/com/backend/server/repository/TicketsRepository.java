package com.backend.server.repository;

import com.backend.server.Model.Tickets;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketsRepository extends MongoRepository<Tickets,String> {
    List<Tickets> findByMobileNumber(String mobileNumber);
}
