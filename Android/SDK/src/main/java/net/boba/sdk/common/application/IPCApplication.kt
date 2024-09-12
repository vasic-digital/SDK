package net.boba.sdk.common.application

import com.redelf.commons.extensions.obfuscate
import com.redelf.commons.interprocess.InterprocessApplication
import com.redelf.commons.interprocess.InterprocessProcessor
import net.boba.R

abstract class IPCApplication : InterprocessApplication() {

    override val firebaseEnabled = false
    override val interprocessPermission = R.string.interprocess_permission

    override fun isProduction() = false

    override fun takeSalt() = (

            getInterprocessPermissionValue().obfuscate().reversed() +
                    "${getInterprocessPermissionValue().hashCode()}".obfuscate()

            ).reversed().obfuscate()

    override fun getProcessors(): List<InterprocessProcessor> {

        // TODO: Add your processors here

        return listOf()
    }
}