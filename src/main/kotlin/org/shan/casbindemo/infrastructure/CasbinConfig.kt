package org.shan.casbindemo.infrastructure

import org.casbin.jcasbin.main.Enforcer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CasbinConfig {

    @Bean
    fun casbinEnforcer(): Enforcer {
        val modelPath = "src/main/resources/casbin/model.conf" // Path to Casbin model
        val policyPath = "src/main/resources/casbin/policy.csv" // Path to Casbin policy
        return Enforcer(modelPath, policyPath)
    }
}