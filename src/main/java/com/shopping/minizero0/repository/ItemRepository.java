package com.shopping.minizero0.repository;

import com.shopping.minizero0.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
