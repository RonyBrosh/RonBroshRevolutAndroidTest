package com.ronybrosh.currencyrateapp.app.di.util

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)