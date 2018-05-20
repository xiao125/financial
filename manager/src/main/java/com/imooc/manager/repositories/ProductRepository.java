package com.imooc.manager.repositories;

import com.imooc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 产品管理
 *  JpaSpecificationExecutor 复杂查询接口
 */
public interface ProductRepository extends JpaRepository<Product,String>,
        JpaSpecificationExecutor<Product>{
}