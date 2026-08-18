package com.ammaryasser.athar.presentation.screen.forceupdate

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import com.ammaryasser.athar.R
import com.ammaryasser.athar.presentation.theme.Variables


@Composable
fun ForceUpdateScreen(
    title: String?,
    subtitle: String?,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(Variables.Space400),
        verticalArrangement = Arrangement.spacedBy(Variables.Space400, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            imageVector = Icons.Outlined.Download,
            contentDescription = stringResource(R.string.force_update_title),
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .clip(RoundedCornerShape(Variables.Radius300))
                .background(MaterialTheme.colorScheme.surface)
                .padding(Variables.Space200)
                .size(48.dp)
        )

        Text(
            text = title ?: stringResource(R.string.force_update_title),
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = subtitle ?: stringResource(R.string.force_update_subtitle),
            style = MaterialTheme.typography.bodyLarge,
        )

        Button(
            onClick = {
                context.openPlayStore()
            },
            modifier = Modifier.fillMaxWidth(.5f)
        ) {
            Text(
                text = stringResource(R.string.force_update_button_label),
                style = MaterialTheme.typography.bodyLarge,
            )
        }
    }
}


private fun Context.openPlayStore() {
    val appPackageName = packageName
    val buildStoreIntent = { baseUrl: String ->
        Intent(Intent.ACTION_VIEW, "${baseUrl}details?id=$appPackageName".toUri())
    }

    try {
        startActivity(buildStoreIntent("market://"))
    } catch (e: Exception) {
        startActivity(buildStoreIntent("https://play.google.com/store/apps/"))
    }
}