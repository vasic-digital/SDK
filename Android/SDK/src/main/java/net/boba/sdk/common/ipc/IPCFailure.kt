package net.boba.sdk.common.ipc

import com.redelf.commons.interprocess.InterprocessError

interface IPCFailure {

    fun getError(): InterprocessError?
}