package playground.fada21.com.mytestapplication

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.google.common.truth.Truth.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useInstrumentationContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().context
        assertThat("playground.fada21.com.mytestapplication.test").isEqualTo(appContext.packageName)
    }

    @Test
    fun useAppContextOldschool() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertThat("playground.fada21.com.mytestapplication").isEqualTo(appContext.packageName)
    }

    @Test
    fun useAppContextNewRecommendedWay() {
        // app val below might be actually YourAppClass
        val app: Context = ApplicationProvider.getApplicationContext()
        assertEquals("playground.fada21.com.mytestapplication", app.packageName)
    }

}
