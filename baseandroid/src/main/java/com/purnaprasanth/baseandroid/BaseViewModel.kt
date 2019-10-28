package com.purnaprasanth.baseandroid

import androidx.lifecycle.ViewModel
import com.purnaprasanth.base.async.AppDispatchers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import java.util.concurrent.CancellationException
import kotlin.coroutines.CoroutineContext

/**
 * Base Class for ViewModel
 *
 * This also extends [CoroutineScope], hence acts as a parent for all the coRoutines started in this activity scope or Lifecycle
 *
 * @property parentJob parent job for the coRoutines started in this scope
 */

open class BaseViewModel(protected val appDispatchers: AppDispatchers) :
    ViewModel(), CoroutineScope {
    private val parentJob = SupervisorJob()

    override val coroutineContext: CoroutineContext
        get() = parentJob + appDispatchers.ioDispatcher

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel(CancellationException("Parent Scope Destroyed"))
    }
}