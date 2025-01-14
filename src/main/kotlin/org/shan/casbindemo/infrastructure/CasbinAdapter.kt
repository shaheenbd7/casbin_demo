package org.shan.casbindemo.infrastructure

import org.shan.casbindemo.domain.ports.PermissionPort
import org.springframework.stereotype.Component
import org.casbin.jcasbin.main.Enforcer

@Component
class CasbinAdapter(
    private val enforcer: Enforcer
) : PermissionPort {

    override fun checkPermission(sub: String, obj: String, act: String): Boolean {
        return enforcer.enforce(sub, obj, act)
    }
}
