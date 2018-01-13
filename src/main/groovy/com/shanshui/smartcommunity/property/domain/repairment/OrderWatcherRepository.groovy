package com.shanshui.smartcommunity.property.domain.repairment

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

/**
 * Created by I336253 on 11/19/2017.
 */
public interface OrderWatcherRepository extends CrudRepository<OrderWatcher, Long> {

    @Query('select r from OrderWatcher r where r.order.id = ?1')
    List<OrderWatcher> findAll(long oid)

    @Query('select r from OrderWatcher r where r.watcher = ?1')
    List<OrderWatcher> findMyWatch(long uid)
}