package com.InventoryManagement.Project.Service;

import com.InventoryManagement.Project.Model.Item;
import com.InventoryManagement.Project.Repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }

    public List<Item> getList() {
        return itemRepository.findAll();
    }

    public void save(Item item) {
        itemRepository.save(item);
    }

    public Item get(int id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }


    public void delete(int id) {
         itemRepository.deleteById(id);
    }
}
