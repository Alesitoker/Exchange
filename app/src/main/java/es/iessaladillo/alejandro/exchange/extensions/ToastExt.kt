@file:JvmName("ToastExt")
package es.iessaladillo.alejandro.exchange.extensions

import android.content.Context
import android.widget.Toast

fun Context.toast(message: String, duration: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, duration).show()
}