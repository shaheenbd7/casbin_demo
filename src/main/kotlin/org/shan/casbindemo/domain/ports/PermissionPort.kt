package org.shan.casbindemo.domain.ports

interface PermissionPort {
    fun checkPermission(sub: String, obj: String, act: String): Boolean
}