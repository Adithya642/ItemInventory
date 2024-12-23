package com.InventoryManagement.Project.Controller;

import com.InventoryManagement.Project.Model.Item;
import com.InventoryManagement.Project.Service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Item")
public class ItemController {
    private final ItemService itemService;
    public ItemController(ItemService itemService){
        this.itemService=itemService;
    }
    @GetMapping("/getListOfItems")
    public List<Item> getList(){
        return itemService.getList();
    }

    @PostMapping("/addItem")
    public void saveItem(@RequestBody Item item){
        itemService.save(item);
    }

    @GetMapping("/getItem/{id}")
    public Item getItem(@PathVariable int id){
        return itemService.get(id);
    }

    @DeleteMapping("/deleteItem/{id}")
    public Item deleteItem(@PathVariable int id){
        Item deletedItem=itemService.get(id);
        itemService.delete(id);
        System.out.println("Deleted Item details");
        return deletedItem;
    }

    @RequestMapping(value="/updateItem/{id}",method = RequestMethod.PUT)
    public Item updateItem(@PathVariable int id, @RequestBody Item updatedItem){
        Item previousItem=itemService.get(id);
        previousItem.setName(updatedItem.getName());
        previousItem.setQuantity(updatedItem.getQuantity());
        previousItem.setPrice(updatedItem.getPrice());
      // updatedItem.setId(previousItem.getId());
      // itemService.delete(previousItem.getId());
       itemService.save(previousItem);
        return  itemService.get(previousItem.getId());
    }

}
