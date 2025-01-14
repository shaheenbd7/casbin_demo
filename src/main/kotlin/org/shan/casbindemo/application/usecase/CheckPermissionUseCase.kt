package org.shan.casbindemo.application.usecase

import org.shan.casbindemo.domain.ports.PermissionPort
import org.springframework.stereotype.Service

@Service
class CheckPermissionUseCase(
    private val permissionPort: PermissionPort
) {
    fun execute(sub: String, obj: String, act: String): Boolean {
        return permissionPort.checkPermission(sub, obj, act)
    }
}