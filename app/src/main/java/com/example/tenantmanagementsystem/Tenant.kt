package com.example.tenantmanagementsystem

import java.io.Serializable

data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) : Serializable {
    val summary: String
        get() = "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
}
