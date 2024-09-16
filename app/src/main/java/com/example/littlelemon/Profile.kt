package com.example.littlelemon

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.ui.theme.PrimaryGreen

@Composable
fun Profile(navController: NavController) {
    val context = LocalContext.current
    val sharedPreferences = context.getSharedPreferences(USER_PROFILE, Context.MODE_PRIVATE)
    val firstName = sharedPreferences.getString(FIRST_NAME, "N/A")
    val lastName = sharedPreferences.getString(LAST_NAME, "N/A")
    val email = sharedPreferences.getString(EMAIL, "N/A")


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.littlelemonlogo),
            contentDescription = "Profile Logo",
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "Profile Information",
            style = typography.headlineMedium,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text("First Name: $firstName", modifier = Modifier.padding(top = 8.dp),
            style = typography.bodyMedium)
        Text("Last Name: $lastName", modifier = Modifier.padding(top = 8.dp),
            style = typography.bodyMedium)
        Text("Email: $email", modifier = Modifier.padding(top = 8.dp),
            style = typography.bodyMedium)

        Button(
            onClick = {
                sharedPreferences.edit().clear().apply()

                navController.navigate(OnboardingDestination.route) {
                    popUpTo(HomeDestination.route) { inclusive = true }
                    launchSingleTop  = true
                }
            },


            modifier = Modifier.padding(top = 16.dp)

        ) {
            Text("Register", style = MaterialTheme.typography.labelLarge,
                color = Color(0xFFF4CE14)

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    val navController = rememberNavController()
    Profile(navController)
}
