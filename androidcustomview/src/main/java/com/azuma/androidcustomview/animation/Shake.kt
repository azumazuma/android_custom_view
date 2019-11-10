package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.androidcustomview.util.AnimSet

class Shake {
    fun week(view: View, duration: Long = 1000): AnimatorSet {
        val width = (view.width).toFloat()
        val power = (width / 300.0).toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f * power, -25f * power, 20f * power, -15f * power, 10f * power, -5f * power, 0f * power, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -5f, 3f, -3f, 2f, -1f, 0f)

        return AnimSet.set(view, duration, object1, object2)
    }

    fun medium(view: View, duration: Long = 1000): AnimatorSet {
        val width = (view.width).toFloat()
        val power = (width / 200.0).toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f * power, -25f * power, 20f * power, -15f * power, 10f * power, -5f * power, 0f * power, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -5f, 3f, -3f, 2f, -1f, 0f)

        return AnimSet.set(view, duration, object1, object2)
    }

    fun strength(view: View, duration: Long = 1000): AnimatorSet {
        val width = (view.width).toFloat()
        val power = (width / 100.0).toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f * power, -25f * power, 20f * power, -15f * power, 10f * power, -5f * power, 0f * power, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -5f, 3f, -3f, 2f, -1f, 0f)

        return AnimSet.set(view, duration, object1, object2)
    }
}