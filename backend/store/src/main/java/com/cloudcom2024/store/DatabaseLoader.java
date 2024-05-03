package com.cloudcom2024.store;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cloudcom2024.store.models.Basket;
import com.cloudcom2024.store.models.Item;
import com.cloudcom2024.store.repositories.ItemRespository;

@Component
public class DatabaseLoader implements CommandLineRunner{
    final private ItemRespository itemRespository;

    public DatabaseLoader(ItemRespository itemRespository) {
        this.itemRespository = itemRespository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Basket basket1 = new Basket();
        basket1.setTotalPrice(new BigDecimal("204.4"));

        Item item1 = new Item();
        item1.setName("Футболка");
        item1.setPrice(new BigDecimal("102.2"));
        item1.setCategory("Одежда");
        item1.setBasket(basket1);

        Item item2 = new Item();
        item2.setName("Шампунь джумай сынба");
        item2.setPrice(new BigDecimal("102.2"));
        item2.setCategory("Средства гигиены");
        item2.setBasket(basket1);

        itemRespository.save(item1);
        itemRespository.save(item2);
    }
    
}
