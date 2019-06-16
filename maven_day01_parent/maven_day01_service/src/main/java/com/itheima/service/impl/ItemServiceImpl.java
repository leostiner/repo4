package com.itheima.service.impl;

import com.itheima.domain.Items;
import com.itheima.mapper.ItemsMapper;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public Items findById(int id) {
        Items items = itemsMapper.findById(id);
        return items;
    }
}
