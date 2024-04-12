package mx.edu.itson.potros.practica9

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions


class MainActivity : AppCompatActivity() {
    lateinit var mGoogleSignInOptions: GoogleSignInClient
    val RC_SIGN_IN=343
    val LOG_OUT=234
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Configure sign-in to request the user's ID, email address, and basic
// profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        // Configure sign-in to request the user's ID, email address, and basic
// profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()

        mGoogleSignInOptions=GoogleSignIn.getClient(this,gso );
    }
    private fun signIn() {
        val signInIntent: Intent = mGoogleSignInOptions.getSignInIntent()
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }
}