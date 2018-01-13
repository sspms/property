package com.shanshui.smartcommunity.property.domain.repairment

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToOne

/**
 * Created by I336253 on 11/21/2017.
 */
@Entity
class OrderServiceRate implements Serializable {
    @Id
    @GeneratedValue
    Long id
    @OneToOne
    Order order
    long creator
    int rate // 1-5
    String detail
}
