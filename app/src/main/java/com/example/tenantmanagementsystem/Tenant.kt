package com.example.tenantmanagementsystem

data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) {
    val summary: String
        get() = "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
}