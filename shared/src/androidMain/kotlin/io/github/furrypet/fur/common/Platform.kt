package io.github.furrypet.fur.common

import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"

    actual fun login(email: String, password: String) {
        FirebaseAuth.getInstance()
            .signInWithCredential(EmailAuthProvider.getCredential(email, password))
            .addOnCompleteListener { task -> }
    }
}