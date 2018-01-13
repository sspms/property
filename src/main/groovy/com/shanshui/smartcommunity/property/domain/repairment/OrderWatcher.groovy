package com.shanshui.smartcommunity.property.domain.repairment

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * Created by I336253 on 11/25/2017.
 */
@Entity
class OrderWatcher implements Serializable {
    @Id
    @GeneratedValue
    Long id
    Date date
    long watcher
    @ManyToOne
    Order order
}
