/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerceStore.sneha.repository;

/**
 *
 * @author Dell
 */
import com.ecommerceStore.sneha.model.OrderProduct;
import com.ecommerceStore.sneha.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}