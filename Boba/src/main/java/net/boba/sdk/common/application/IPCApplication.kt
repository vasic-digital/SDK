package net.boba.sdk.common.application

import com.redelf.commons.extensions.wrapToList
import com.redelf.commons.interprocess.InterprocessApplication
import com.redelf.commons.interprocess.InterprocessProcessor
import net.boba.R
import net.boba.sdk.common.processing.SDKProcessor

abstract class IPCApplication : InterprocessApplication() {

    override val firebaseEnabled = false
    override val interprocessPermission = R.string.interprocess_permission

    override fun isProduction() = false

    override fun takeSalt() : String {

        // FIXME:
        //        val base = getInterprocessPermissionValue().obfuscate().reversed() +
        //                    "${getInterprocessPermissionValue().hashCode()}".obfuscate()
        //
        //        return base.reversed().obfuscate()

        return ""
    }

    override fun getProcessors(): List<InterprocessProcessor> {

        val ctx = takeContext()

        return SDKProcessor(ctx).wrapToList()
    }
}