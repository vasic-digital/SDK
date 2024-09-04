package net.boba.sdk.ipc

import com.redelf.commons.interprocess.InterprocessData
import com.redelf.commons.interprocess.InterprocessError
import java.util.UUID

interface IPCExchange {

    fun getIdentifier(): UUID

    fun getData(): InterprocessData?
}