package com.beerhouse.domain;

import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository {
    public void save(Beer beer);
    public void delete(String id);
    public void findOneById(String id);
    public void fetchAll();
}
