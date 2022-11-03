package com.anand.contributor.contributor.api

import androidx.annotation.DrawableRes
import androidx.fragment.app.Fragment

interface IBottomNavigationContribution: IContribution {
    val state: BottomNavigationContributionState
    fun fragment(): Class<out Fragment>
}

data class BottomNavigationContributionState(
    val text: String,
    @DrawableRes val icon: Int,
    val order: Int
)