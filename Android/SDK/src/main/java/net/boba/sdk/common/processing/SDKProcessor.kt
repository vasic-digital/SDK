package net.boba.sdk.common.processing

import android.content.Context
import com.redelf.commons.interprocess.InterprocessData
import com.redelf.commons.interprocess.InterprocessProcessor
import com.redelf.commons.logging.Console

class SDKProcessor(private val ctx: Context) : InterprocessProcessor() {

    private val tag = "IPC :: Processor :: SDK ::"

    init {

        Console.log("$tag Created")
    }


    override fun onData(data: InterprocessData) {

        TODO("Not yet implemented")
    }
}