package com.shanshui.smartcommunity.property.domain.repairment

import org.hibernate.annotations.Fetch
import org.hibernate.engine.FetchStrategy
import org.springframework.format.annotation.DateTimeFormat

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToOne

/**
 * Created by I336253 on 11/21/2017.
 */
@Entity
class Order implements Serializable {
    @Id
    @GeneratedValue
    Long id

    @DateTimeFormat(style = 'yyyy-MM-dd HH:mm:ss.SSS')
    Date openDate

    @DateTimeFormat(style = 'yyyy-MM-dd HH:mm:ss.SSS')
    Date lastUpdateDate

    @DateTimeFormat(style = 'yyyy-MM-dd HH:mm:ss.SSS')
    Date completeDate

    String description
    String imageLink

    long creator
    @Column(updatable = true, insertable = true)
    long assignee

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    OrderServiceRate rate

    @Column(updatable = true, insertable = true)
    @Enumerated(EnumType.STRING)
    OrderType type

    @Column(updatable = true, insertable = true)
    @Enumerated(EnumType.STRING)
    OrderStatus status
    @Column(updatable = true, insertable = true)
    @Enumerated(EnumType.STRING)
    PropertyCategory category

    @Column(updatable = true, insertable = true)
    double estimatedCost
}
