package com.InventoryManagement.Project;

import com.InventoryManagement.Project.Model.Item;
import com.InventoryManagement.Project.Repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ItemDataLoader implements CommandLineRunner {
    private final ItemRepository itemRepository;

    // Constructor for dependency injection
    public ItemDataLoader(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Save initial data
        itemRepository.save(new Item("Laptop", 10, 1200));
        itemRepository.save(new Item("Mouse", 50, 25));
        itemRepository.save(new Item("Keyboard", 30, 45));
    }
}
