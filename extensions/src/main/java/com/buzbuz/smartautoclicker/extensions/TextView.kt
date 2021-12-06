/*
 * Copyright (C) 2020 Nain57
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; If not, see <http://www.gnu.org/licenses/>.
 */
package com.buzbuz.smartautoclicker.extensions

import android.widget.TextView

import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat

/**
 * Set the left compound drawable for this TextView.
 * All other compound drawable will be set to null.
 *
 * @param id the drawable to be set.
 * @param tint the tint color to apply to the drawable.
 */
fun TextView.setLeftCompoundDrawable(@DrawableRes id: Int, @ColorInt tint: Int = -1) {
    setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(context, id), null, null, null)
    if (tint != -1) {
        compoundDrawablesRelative[0].setTint(tint)
    }
}

/**
 * Set the left compound drawable for this TextView.
 * All other compound drawable will be set to null.
 *
 * @param idLeft the drawable to be set to the left.
 * @param idRight: the drawable to be set to the right.
 * @param tint the tint color to apply to the left drawable.
 */
fun TextView.setLeftRightCompoundDrawables(@DrawableRes idLeft: Int, @DrawableRes idRight: Int, @ColorInt tint: Int = -1) {
    setCompoundDrawablesRelativeWithIntrinsicBounds(
        ContextCompat.getDrawable(context, idLeft),
        null,
        ContextCompat.getDrawable(context, idRight),
        null)
    if (tint != -1) {
        compoundDrawablesRelative[0].setTint(tint)
    }
}