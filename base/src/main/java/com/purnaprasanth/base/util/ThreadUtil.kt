package com.purnaprasanth.base.util

import java.util.concurrent.ThreadFactory

fun threadFactory(name: String, daemon: Boolean) = ThreadFactory { r ->
    val result = Thread(r, name)
    result.isDaemon = daemon
    result
}