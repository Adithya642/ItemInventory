package com.InventoryManagement.Project.Repository;

import com.InventoryManagement.Project.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
