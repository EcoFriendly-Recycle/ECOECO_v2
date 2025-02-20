package com.recycle.ecoeco.manager.customer.model.dao;

import com.recycle.ecoeco.manager.customer.model.dto.CustomerDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    List<CustomerDTO> findCustomerList();
}
