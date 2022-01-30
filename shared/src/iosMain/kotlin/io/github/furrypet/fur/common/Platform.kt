package io.github.furrypet.fur.common

import platform.UIKit.UIDevice
import cocoapods.FirebaseAuth.FIRAuth
import cocoapods.FirebaseAuth.FIREmailAuthProvider
import cocoapods.FirebaseAuth.FIREmailAuthProviderID

actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion

    actual fun login(email: String, password: String){
        FIRAuth.auth().signInWithCredential(FIREmailAuthProvider.credentialWithEmail(email, password)){ result, error ->

        }
    }
}