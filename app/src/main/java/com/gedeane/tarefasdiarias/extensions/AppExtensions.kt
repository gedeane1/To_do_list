package com.gedeane.tarefasdiarias.extensions

import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.util.*

private val locale = Locale (  "pt", country: "BR")

fun Date.format(): String {
    return SimpleDateFormat( pattern: "dd/MM/yyyy", locale). format (date: this)
}

var TextInputLayout.text: String
    get() = editText?.text?.toString()?: ""
            set(value) {
                editText?.setText(value)
            }



