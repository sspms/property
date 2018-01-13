package com.shanshui.smartcommunity.property.client

import com.shanshui.smartcommunity.property.domain.repairment.Order
import org.springframework.cache.annotation.Cacheable
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.*

/**
 * Created by I336253 on 12/27/2017.
 */
@FeignClient("property")
public interface PropertyClient {
    @RequestMapping(value = 'order/{id}', method = RequestMethod.GET)
    @ResponseBody
    def getOrder(@PathVariable('id') Long id)

    @RequestMapping(value = 'order', method = RequestMethod.POST)
    @ResponseBody
    def createOrder(@RequestBody Order order)

    @RequestMapping(value = 'order/{id}/assignee/{uid}', method = RequestMethod.PUT)
    @ResponseBody
    def assignOrder(@PathVariable('id') Long id, @PathVariable('id') Long uid)
}