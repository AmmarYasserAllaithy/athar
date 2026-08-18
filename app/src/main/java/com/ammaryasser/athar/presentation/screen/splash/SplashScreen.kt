package com.ammaryasser.athar.presentation.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.ammaryasser.athar.BuildConfig
import com.ammaryasser.athar.R
import com.ammaryasser.athar.domain.model.VersionModel
import com.ammaryasser.athar.presentation.theme.Variables
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import org.koin.androidx.compose.koinViewModel
import kotlin.time.Duration.Companion.milliseconds


@Composable
fun SplashScreen(
    viewModel: SplashViewModel = koinViewModel(),
    onNavToForceUpdate: (VersionModel) -> Unit,
    onNavToMain: () -> Unit,
) {
    LaunchedEffect(Unit) {
        viewModel.events.collectLatest { event ->
            // Ensure splash is visible for at least some time
            delay(1500.milliseconds)

            when (event) {
                is SplashContract.Effect.NavigateToMain -> onNavToMain()
                is SplashContract.Effect.NavigateToForceUpdate -> onNavToForceUpdate(event.versionInfo)
            }
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(
                Variables.Space400,
                Alignment.CenterVertically
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(R.drawable.athar_logo),
                contentDescription = stringResource(R.string.app_name),
            )

            Text(
                text = stringResource(R.string.splash_message_line_1),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
            )

            Text(
                text = stringResource(R.string.splash_message_line_2),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
            )
        }

        Text(
            text = stringResource(R.string.splash_version_name, BuildConfig.VERSION_NAME),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = Variables.Space400),
        )
    }
}