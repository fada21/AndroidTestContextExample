package playground.fada21.com.mytestapplication

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.platform.app.InstrumentationRegistry
import com.google.common.truth.Truth.assertThat
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleInstrumentedTest {

    @Test
    fun useInstrumentationContext() {
        val instrumentationContext = InstrumentationRegistry.getInstrumentation().context
        assertThat("playground.fada21.com.mytestapplication.test")
            .isEqualTo(instrumentationContext.packageName)
    }

    @Test
    fun useAppContextOldschool() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertThat("playground.fada21.com.mytestapplication")
            .isEqualTo(appContext.packageName)
    }

    @Test
    fun useAppContextNewRecommendedWay() {
        // app val below might be actually YourAppClass
        val app: Context = ApplicationProvider.getApplicationContext()
        assertThat("playground.fada21.com.mytestapplication")
            .isEqualTo(app.packageName)
    }

}
