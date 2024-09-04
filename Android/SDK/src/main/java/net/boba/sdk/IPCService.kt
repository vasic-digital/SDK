package net.boba.sdk

import net.boba.sdk.ipc.IPCRequest
import net.boba.sdk.ipc.IPCResponse

interface IPCService {

    fun onRequest(request: IPCRequest): IPCResponse
}