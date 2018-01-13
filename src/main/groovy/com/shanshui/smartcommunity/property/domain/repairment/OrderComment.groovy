package com.shanshui.smartcommunity.property.domain.repairment

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * Created by I336253 on 11/21/2017.
 */
@Entity
class OrderComment implements Serializable {
    @Id
    @GeneratedValue
    Long id
    Date date
    long provider
    @ManyToOne
    Order order
}
