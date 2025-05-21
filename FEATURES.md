# React Native Audio Pro — Feature Scope and Philosophy

**React Native Audio Pro** is a focused, high-performance audio playback library for React Native apps, built for simple, reliable streaming of remote audio on mobile.

This doc defines what the library **intentionally supports**, what it **may support unofficially**, and what is **explicitly out of scope**.

---

## ✅ Core Features

These are fully supported, maintained features and the foundation of the library:

- 🎵 **HTTPS Audio Playback** — Stream MP3 and other formats over HTTP(S)
- 📱 **Background Playback** — Works with screen locked or app backgrounded
- 🔒 **Lock Screen Controls** — Media control support on Android and iOS
- 🖼 **Artwork Support** — Display album art on lock screen and media controls (JPEG, PNG, etc.)
- 🪟 **Notification Center Integration** — Android media session support
- ⚙️ **Imperative API** — Functions like `play`, `pause`, `resume`, `stop`, etc.
- 🧭 **Progress Tracking** — Emits position/duration updates at configurable intervals
- 🔊 **Volume Control** — Real-time control of audio volume
- 🕘 **Start Time Support** — Begin playback from a specific position
- 🪪 **HTTP Headers** — Pass custom headers for audio and artwork URLs
- 💡 **Native Foundations** — Powered by Media3 (Android) and AVFoundation (iOS)
- 🧩 **Fully Typed API** — First-class TypeScript support

---

## 🧩 Non-Core Features

These features **exist in the codebase** but are not part of the core scope. They may work, but bug reports or feature requests related to them will have **low or no priority**:

- 🎚 **Ambient Audio API** — A simple secondary player for background or layered audio playback
- 🔁 **Live Streams** — Some live stream URLs may work, but are not officially supported
- 📂 **Local Files via File Path** — File URLs (e.g. `file:///path/to/audio.mp3`) work if passed explicitly using libraries like `react-native-fs`
- 🚦 **Autoplay + Timers** — `autoPlay` and `startTimeMs` are supported, but you’re responsible for logic like stop-timers or resume handling

---

## 🚫 Out of Scope

These features are explicitly not supported and will not be included in the library’s roadmap:

- ❌ **Local Files via `require()`** — We do not support static asset imports; use file paths if needed
- ❌ **Web Support** — This is a native-only library (iOS + Android)
- ❌ **Playlist System** — Features like shuffling, repeat, skip-next, etc. are not yet included
- ❌ **Android Auto / CarPlay** — No media integration with car systems
- ❌ **Custom “End At” Timers** — This logic should be implemented in your app using progress events
- ❌ **Offline Caching or Downloads** — No download or caching support is included

---

## 🗺 Roadmap Consideration

The only feature currently under consideration for future support:

- 🧾 **Playlist Support** — Including queue handling, skip/next/previous, shuffle and repeat logic

---

## 💬 Philosophy

React Native Audio Pro is intentionally minimal and focused. Rather than trying to be a full audio engine, it aims to **do a few things exceptionally well**. It is designed to serve real-world production use cases without becoming bloated or overly opinionated.

If your use case exceeds the scope of this library, you are welcome to fork it or compose your own logic around it.

> For feature requests, please read this file before opening a GitHub Discussion. Requests outside of the supported scope may be closed or marked “won’t fix.”
