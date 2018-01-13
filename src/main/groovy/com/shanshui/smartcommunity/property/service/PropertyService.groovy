package com.shanshui.smartcommunity.property.service

import com.shanshui.smartcommunity.property.domain.repairment.Order
import com.shanshui.smartcommunity.property.domain.repairment.OrderRepository
import com.shanshui.smartcommunity.property.domain.repairment.OrderStatus
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.EnableCaching
import org.springframework.stereotype.Service

/**
 * Created by I336253 on 12/3/2017.
 */
@Service
@EnableCaching
class PropertyService {

    @Autowired
    OrderRepository orderRepository

    List<Order> getMyOrders(long uid) {
        uid ? orderRepository.findMyOrder(uid) : null
    }

    List<Order> getMyOrders(long cid, long uid) {
        cid && uid ? orderRepository.findMyOrder() : null
    }

    List<Order> getOrdersByStatus(long uid, OrderStatus status) {
        status ? orderRepository.findOrdersByStatus(uid, status.name) : null
    }

    def assignOrder(long uid){

    }
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyService.class)
}
