package li.songe.gkd.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import li.songe.gkd.BuildConfig
import li.songe.gkd.ui.component.SimpleTopAppBar
import li.songe.gkd.util.LocalNavController
import li.songe.gkd.util.ProfileTransitions

@RootNavGraph
@Destination(style = ProfileTransitions::class)
@Composable
fun AboutPage() {
    val navController = LocalNavController.current
    Scaffold(topBar = {
        SimpleTopAppBar(onClickIcon = { navController.popBackStack() }, title = "关于")
    }, content = { contentPadding ->
        Column(
            Modifier
                .padding(contentPadding)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(text = "版本代码: " + BuildConfig.VERSION_CODE)
            Text(text = "版本名称: " + BuildConfig.VERSION_NAME)
            Text(text = "构建时间: " + BuildConfig.BUILD_DATE)
            Text(text = "构建类型: " + BuildConfig.BUILD_TYPE)
        }
    })

}