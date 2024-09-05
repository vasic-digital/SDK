package net.boba.sdk.common

import net.boba.sdk.common.ipc.IPCRequest
import net.boba.sdk.common.ipc.IPCResponse

interface IPCService {

    fun onRequest(request: IPCRequest): IPCResponse
}