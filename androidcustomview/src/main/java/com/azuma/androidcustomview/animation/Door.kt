package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.androidcustomview.util.AnimSet

class Door {
    fun topOpen(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", 0f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun topClose(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", 0f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun bottomOpen(view: View, duration: Long = 1000): AnimatorSet {
        val y = view.height.toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun bottomClose(view: View, duration: Long = 1000): AnimatorSet {
        val y = view.height.toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun leftOpen(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", 0f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun leftClose(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", 0f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun rightOpen(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.width.toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun rightClose(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.width.toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)

        return AnimSet.set(view, duration, o1, o2)    }
}