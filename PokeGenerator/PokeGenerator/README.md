# Poke Generator (Android)

A native Android app that wraps the spawn-rate/type randomizer in a WebView.
Fully offline — the Pokémon data and UI are bundled inside the APK, no
internet permission requested, no server involved.

## Option A — Build it in the cloud (no Android Studio needed)

1. Create a free GitHub account if you don't have one, and create a new
   **empty** repository (e.g. `poke-generator`).
2. Upload this entire `PokeGenerator` folder into that repo (drag-and-drop
   works fine on github.com, or use `git push` if you're comfortable with
   git). You don't need to search the Actions Marketplace or add anything
   yourself — the workflow file already inside `.github/workflows/` is
   everything GitHub needs; it runs automatically the moment the repo
   has a push.
3. Go to the **Actions** tab of your repo. A workflow called "Build APK"
   will run automatically (takes ~2-3 minutes).
4. When it finishes, click into the completed run, scroll to
   **Artifacts**, and download `poke-generator-apk` — that's a zip
   containing `app-debug.apk`.
5. Transfer that `.apk` to your phone (email it to yourself, Google Drive,
   USB cable, whatever's easiest).
6. On your phone, tap the file. Android will ask you to allow installs
   from that source the first time — allow it, then install.
7. Done — it's a real app icon on your home screen from then on.

## Option B — Build it locally with Android Studio

1. Install [Android Studio](https://developer.android.com/studio) (free).
2. File → Open → select this `PokeGenerator` folder.
3. Let it sync Gradle (first time takes a few minutes, downloads the SDK
   automatically).
4. Plug your phone in via USB with USB debugging enabled (or use
   Build → Generate Signed/Unsigned APK), then Run ▶ to install directly,
   or find the built APK under `app/build/outputs/apk/debug/`.

## Updating the Pokémon data or UI later

Everything lives in one file: `app/src/main/assets/index.html`. Editing
that and re-running the build (push to GitHub, or re-run in Android
Studio) is all that's needed — no other files should need to change for
data/UI tweaks.
