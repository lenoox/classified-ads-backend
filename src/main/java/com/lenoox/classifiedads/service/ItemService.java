package com.lenoox.classifiedads.service;

import com.lenoox.classifiedads.model.Condition;
import com.lenoox.classifiedads.model.Item;
import com.lenoox.classifiedads.repository.ConditionRepository;
import com.lenoox.classifiedads.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemService {

    private final  ConditionRepository conditionRepository;
    private final ItemRepository itemRepository;

    public ItemService(ConditionRepository conditionRepository,
                            ItemRepository itemRepository) {

        this.conditionRepository = conditionRepository;
        this.itemRepository = itemRepository;
    }

    @Transactional
    public void addItemToDb() {

       /* Condition conditionNew = new Condition("Nowe");
        conditionRepository.save(conditionNew);
        Condition conditionUsed = new Condition("Uzywane");
        conditionRepository.save(conditionUsed);
        Condition findNewCondition = conditionRepository.findOneByName("Nowe");
        Condition findUsedCondition = conditionRepository.findOneByName("Uzywane");

        Item itemRequest1 = new Item("Słuchawki 10lite",253, findNewCondition,"białe", "Nowe sluchawki");
        itemRepository.save(itemRequest1);
        Item itemRequest2 = new Item("Słuchawki 20pro",553, findUsedCondition,"czarne", "Mało używane słuchawki");
        itemRepository.save(itemRequest2);
        */
    }
}