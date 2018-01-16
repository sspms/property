package com.shanshui.smartcommunity.property.domain.feedback

import org.springframework.format.annotation.DateTimeFormat

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * Reply to a {@link Feedback}
 * Created by I336253 on 11/25/2017.
 */
@Entity
class Reply implements Serializable {
    @Id
    @GeneratedValue
    Long id

    @ManyToOne(targetEntity = Feedback.class)
    Feedback replyTo
    long user

    @DateTimeFormat(style = 'yyyy-MM-dd HH:mm:ss')
    Date date
    String content
}
