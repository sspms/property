package com.shanshui.smartcommunity.property

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients(
        basePackages =
                [
                        'com.shanshui.smartcommunity.community.client',
                        'com.shanshui.smartcommunity.user.client',
                        'com.shanshui.smartcommunity.role.client'
                ])
@EnableDiscoveryClient
class PropertyApplication {

    static void main(String[] args) {
        SpringApplication.run PropertyApplication, args
    }
}
