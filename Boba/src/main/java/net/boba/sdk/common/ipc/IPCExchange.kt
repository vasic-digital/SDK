package net.boba.sdk.common.ipc

import com.redelf.commons.interprocess.InterprocessData
import java.util.UUID

interface IPCExchange {

    fun getIdentifier(): UUID

    fun getData(): InterprocessData?
}