package net.boba.sdk.ipc

import com.redelf.commons.interprocess.InterprocessData
import com.redelf.commons.interprocess.InterprocessError
import java.util.UUID

interface IPCFailure {

    fun getError(): InterprocessError?
}