package net.boba.sdk.common.application

import com.redelf.commons.interprocess.InterprocessApplication
import com.redelf.commons.interprocess.InterprocessProcessor
import net.boba.R
import net.boba.sdk.common.IPCService

abstract class IPCApplication : InterprocessApplication(), IPCService {

    override val firebaseEnabled = false
    override val interprocessPermission = R.string.interprocess_permission

    override fun isProduction() = false

    override fun takeSalt() = "echo_salt"

    override fun getProcessors(): List<InterprocessProcessor> {

        // TODO: Add your processors here

        return listOf()
    }
}