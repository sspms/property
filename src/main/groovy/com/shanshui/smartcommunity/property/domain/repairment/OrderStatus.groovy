package com.shanshui.smartcommunity.property.domain.repairment

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Created by I336253 on 11/21/2017.
 */
@Entity
enum OrderStatus {

    OPEN('OPEN', 'service is required from property owner(order creator)'),
    FIXED('FIXED', 'service provided'),
    CLOSED('CLOSED', 'the service has been provided and verified by order creator'),
    REOPENED('REOPENED', 'the issue comes up again in a short period'),
    PENDING('PENDING', 'for some reason, the server could not be provided for some time'),
    ASSIGNED('ASSIGNED', 'service provider assigned,usually assigned to a worker'),
    WAITING_APPROVAL('WAITING_APPROVAL', 'waiting for approval from committee or property management'),
    APPROVED('APPROVED', 'approved by property owner committee or entire owners');
    
    @Id
    String name
    String description

    protected OrderStatus(String name, String description) {
        this.name = name
        this.description = description
    }
}
