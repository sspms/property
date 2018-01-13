package com.shanshui.smartcommunity.property.domain.feedback

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by I336253 on 11/25/2017.
 */
@Entity
class Feedback implements Serializable {
    @Id
    @GeneratedValue
    Long id
    long community
    String content
    long submitter
    Date date
    String[] tags
}
