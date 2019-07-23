package example.test.phong.inboxrcv

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView

abstract class ScrollSuppressibleRecyclerView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
                                              ) : RecyclerView(context, attrs, defStyleAttr) {

    abstract fun canScrollProgrammatically(): Boolean

    override fun scrollToPosition(position: Int) {
        super.scrollToPosition(position)
    }

    override fun smoothScrollToPosition(position: Int) {
        super.smoothScrollToPosition(position)
    }

    override fun smoothScrollBy(dx: Int, dy: Int) {
        super.smoothScrollBy(dx, dy)
    }

    override fun scrollTo(x: Int, y: Int) {
        super.scrollTo(x, y)
    }

    override fun scrollBy(x: Int, y: Int) {
        super.scrollBy(x, y)
    }
}