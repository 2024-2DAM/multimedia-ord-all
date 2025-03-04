package org.ies.examen.presentation.ui.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.ies.examen.domain.model.Vehicle

@Composable
fun VehiclesScreen() {

    val vehicles = listOf(
        Vehicle("1", "Toyota", 50000, "1234ABC", "Toyota Camry"),
        Vehicle("2", "Ford", 30000, "5678DEF", "Ford Mustang"),
        Vehicle("3", "Honda", 20000, "9012GHI", "Honda Civic"),
        Vehicle("4", "Chevrolet", 40000, "3456JKL", "Chevrolet Silverado")
    )
    Scaffold(
    ) { paddingValues ->
        /* TODO Implementa la ventana del listado de vehículos */
    }
}

@Preview
@Composable
fun VehiclesScreenPreview() {
    VehiclesScreen()
}