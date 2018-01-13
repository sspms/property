package com.shanshui.smartcommunity.property.domain.repairment

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

/**
 * Created by I336253 on 11/19/2017.
 */
public interface OrderAuditRepository extends CrudRepository<OrderAudit, Long> {

    //@Query('select r from OrderAudit r where r.community = ?1 and r.user = ?2 and r.valid = true')
    //List<OrderAudit> findAll(long communityId, long userId)

}