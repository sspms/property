package com.shanshui.smartcommunity.property.domain.repairment

import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

import javax.transaction.Transactional

/**
 * Created by I336253 on 11/19/2017.
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
    @Query('select r from Order r where r.creator = ?2')
    List<Order> findMyOrder(long userId)

    @Query('select r from Order r where r.community = ?1 and r.creator = ?2')
    List<Order> findMyOrder(long communityId, long userId)

    @Query('select r from Order r where r.community = ?1 and r.creator = ?2 and status = OPEN')
    List<Order> findMyOpenOrder(long communityId, long userId)

    @Query('select o from Order o where o.creator = ?1 and status = ?2')
    List<Order> findOrdersByStatus(long uid, String status)

    @Modifying
    @Query('update Order r set r.assignee = ?2 where r.id = ?1')
    @Transactional
    void assignOrder(long id, long uid)
}