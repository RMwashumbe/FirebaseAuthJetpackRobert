package com.example.firebaseauthjetpackrobert.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauthjetpackrobert.ui.theme.screen.about.AboutScreen
import com.example.firebaseauthjetpackrobert.ui.theme.screen.home.HomeScreen
import com.example.firebaseauthjetpackrobert.ui.theme.screen.login.LoginScreen
import com.example.firebaseauthjetpackrobert.ui.theme.screen.products.AddProductsScreen
import com.example.firebaseauthjetpackrobert.ui.theme.screen.products.UpdateProductsScreen
import com.example.firebaseauthjetpackrobert.ui.theme.screen.products.ViewProductsScreen
import com.example.firebaseauthjetpackrobert.ui.theme.screen.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController: NavHostController= rememberNavController(),startDestination: String= ROUTE_HOME) {

    NavHost(navController= navController, modifier =modifier, startDestination = startDestination ) {
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT){
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!! )
        }
    }
}