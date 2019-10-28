package com.purnaprasanth.base.async

import kotlinx.coroutines.CoroutineDispatcher

/**
 * AppDispatchers to be used across app
 * @param mainDispatcher The dispatcher for Operations on Main Thread
 * @param ioDispatcher The dispatcher for IO Operations
 * @param commonDispatcher The Dispatcher for Common Computational Operations
 *
 * Usually created from [AppExecutors]
 */

data class AppDispatchers(
    val mainDispatcher: CoroutineDispatcher,
    val ioDispatcher: CoroutineDispatcher,
    val commonDispatcher: CoroutineDispatcher
)