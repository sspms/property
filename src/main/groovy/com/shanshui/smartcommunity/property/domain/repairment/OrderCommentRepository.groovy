package com.shanshui.smartcommunity.property.domain.repairment

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

/**
 * Created by I336253 on 11/19/2017.
 */
public interface OrderCommentRepository extends CrudRepository<OrderComment, Long> {

    @Query('select r from OrderComment r where r.order.id = ?1')
    List<OrderComment> findAll(long oid)

}