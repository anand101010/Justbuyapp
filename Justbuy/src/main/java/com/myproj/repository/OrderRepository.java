package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Orders,Long> {

    @Query("SELECT o FROM Orders o WHERE o.order_status = :status")
    List<Orders> getOrdersByStatus(@Param("status") String status);
    @Query("SELECT o FROM Orders o WHERE o.order_id < :id")
    List<Orders> getOrdersByIdLesserThan(@Param("id") long id);
    @Query("SELECT o.order_id, o.order_address, o.order_price, o.order_status " +
            "FROM Orders o INNER JOIN o.user u WHERE u.state = :state")
    List<Object[]> getOrderByState(@Param("state")String state);


    @Query(value = "SELECT o.order_id, o.order_address, o.order_price, o.order_status, p.product_name " +
            "FROM Orders o INNER JOIN o.user_id = u.user_id WHERE u.state= =:state",nativeQuery = true)
    List<Object[]>getOrderBYstate1(@Param("state")String state);

    @Query("SELECT o.order_id, o.order_address, o.order_price, o.order_status, p.product_name " +
            "FROM Orders o INNER JOIN o.product p WHERE o.order_id= :id")
    List<Object[]> getFullDetailsById(@Param("id") long id);






  }






