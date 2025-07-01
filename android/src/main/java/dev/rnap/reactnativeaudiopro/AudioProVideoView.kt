package dev.rnap.reactnativeaudiopro

import androidx.annotation.OptIn
import androidx.media3.common.util.UnstableApi
import androidx.media3.ui.PlayerView
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext

class AudioProVideoViewManager : SimpleViewManager<PlayerView>() {

	override fun getName(): String {
		return "AudioProVideoView"
	}

	@OptIn(UnstableApi::class)
	override fun createViewInstance(reactContext: ThemedReactContext): PlayerView {
		val playerView = PlayerView(reactContext)

		// Attach the player from AudioProController
		AudioProController.enginerBrowser?.let {
			playerView.player = it
		}

		// Optional: configure UI
		playerView.useController = true
		playerView.setShowNextButton(AudioProController.settingShowNextPrevControls)
		playerView.setShowPreviousButton(AudioProController.settingShowNextPrevControls)

		return playerView
	}
}
