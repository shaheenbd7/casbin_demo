package org.shan.casbindemo.web

import org.shan.casbindemo.application.usecase.CheckPermissionUseCase
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/permissions")
class PermissionController(
    private val checkPermissionUseCase: CheckPermissionUseCase
) {

    @PostMapping("/check")
    fun checkPermission(
        @RequestParam sub: String,
        @RequestParam obj: String,
        @RequestParam act: String
    ): Boolean {
        return checkPermissionUseCase.execute(sub, obj, act)
    }
}