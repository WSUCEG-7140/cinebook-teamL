package com.backend.server.service;

import com.backend.server.Model.ticker;
import com.backend.server.repository.tickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketServiceImpl implements tickerService{

    @Autowired
    tickerRepository tickerRepository;


    @Override
    public ticker addticker(ticker ticker) {
        ticker.setPassword(new BCryptPasswordEncoder().encode(ticker.getPassword()));
        return tickerRepository.save(ticker);
    }


    @Override
    public Optional<ticker> getticker(String mobileNumber) {
        return(tickerRepository.findById(mobileNumber));
    }

    @Override
    public ticker updateticker(ticker ticker) {
        return tickerRepository.save(ticker);
    }

    @Override
    public String deleteticker(String mobileNumber) {
       tickerRepository.deleteById(mobileNumber);
        return("tickerDeleted Successfully");
    }

    @Override
    public String cancelTicket(String mobileNumber) {
       tickerRepository.deleteById(mobileNumber);
        return("tickerDeleted Successfully");
    }
    
//    @Override
//    public Inventory addItemToCart(Inventory inventory) {
//        ticker.getCart().add(inventory);
//        return inventory;
//    }

}
