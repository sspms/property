package com.shanshui.smartcommunity.property.domain.repairment

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Created by I336253 on 11/21/2017.
 */
@Entity
enum OrderType {

    PRIVATE('PRIVATE', 'private order, service required for private properties'),

    PUBLIC('PUBLIC', 'public order, service required for public properties');
    @Id
    String name
    String description

    protected OrderType(String name, String description) {
        this.name = name
        this.description = description
    }

}