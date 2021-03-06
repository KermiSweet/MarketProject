package com.kermi.market.marketevent.mapper;

import com.kermi.market.marketevent.pojo.WarehouseProduct;

public interface WarehouseProductMapper {
    int deleteByPrimaryKey(Integer wpId);

    int insert(WarehouseProduct record);

    int insertSelective(WarehouseProduct record);

    WarehouseProduct selectByPrimaryKey(Integer wpId);

    int updateByPrimaryKeySelective(WarehouseProduct record);

    int updateByPrimaryKey(WarehouseProduct record);
}