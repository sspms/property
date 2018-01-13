package com.shanshui.smartcommunity.property.controller

import com.shanshui.smartcommunity.property.client.PropertyClient
import com.shanshui.smartcommunity.property.service.PropertyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cache.annotation.EnableCaching
import org.springframework.web.bind.annotation.*

/**
 * Created by I336253 on 11/19/2017.
 */
@RestController
@RequestMapping('/api/v1/property')
@EnableAutoConfiguration
@EnableCaching
class PropertyController implements PropertyClient{

    @Autowired
    PropertyService propertyService

    @RequestMapping(value = 'order/{id}', method = RequestMethod.GET)
    @ResponseBody
    def getOrder(@PathVariable('id') Long id) {
        id ? propertyService.orderRepository.findOne(id) : null
    }

    public static void main(String[] args) {
        SpringApplication.run PropertyController.class, args
    }
}
