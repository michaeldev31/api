package com.example.api.repository;


import com.example.api.model.Card;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface ICardRepository {

    public List<Card> findAll();
    public int save (Card card);
    public int update (Card card);
    public int deleteById(int id);
}
