package com.example.product_be.repository;

import com.example.product_be.dto.ProductDto;
import com.example.product_be.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select * from product where name like concat('%', :name, '%') " +
            "and category_Id like concat('%', :id, '%')", nativeQuery = true)
    Page<Product> getAllByNameAndCategory_Id(String name,Integer id, Pageable pageable);

    @Query(value = "select * from product where name like concat('%', :name, '%')", nativeQuery = true)
    Page<Product> getAllName(String name, Pageable pageable);

    @Modifying
    @Transactional
    @Query(value = "insert into product (code, input_date, `name`, price , quantity, category_id) " +
            "values (:code, :inputDate, :name, :price, :quantity, :categoryId)", nativeQuery = true)
    void addProduct (@Param("code") String code,
                     @Param("inputDate") String inputDate,
                     @Param("name") String name,
                     @Param("quantity") Integer quantity,
                     @Param("price") Integer price,
                     @Param("categoryId") Integer categoryId);

    @Modifying
    @Transactional
    @Query(value = "delete from product where id = :id", nativeQuery = true)
    void deleteProduct(@Param("id") Integer id);

    @Query(value = "select * from product where id = :id", nativeQuery = true)
    Product findWithId(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "update product set code = :code, name = :name, input_date = :inputDate, " +
            "quantity = :quantity, price = :price, category_id = :categoryId where id = :id", nativeQuery = true)
    void updateProduct(@Param("code") String code,
                       @Param("inputDate") String inputDate,
                       @Param("name") String name,
                       @Param("quantity") Integer quantity,
                       @Param("price") Integer price,
                       @Param("categoryId") Integer categoryId,
                       @Param("id") Integer id);
}
