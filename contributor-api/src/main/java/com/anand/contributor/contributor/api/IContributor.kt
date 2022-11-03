package com.anand.contributor.contributor.api

interface IContributor {
    val id: String
    fun bottomNavigationContribution(): IBottomNavigationContribution
}