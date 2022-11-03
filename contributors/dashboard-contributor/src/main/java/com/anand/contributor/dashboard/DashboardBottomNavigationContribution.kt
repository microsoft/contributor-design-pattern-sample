package com.anand.contributor.dashboard

import androidx.fragment.app.Fragment
import com.anand.contributor.contributor.api.BottomNavigationContributionState
import com.anand.contributor.contributor.api.IBottomNavigationContribution

class DashboardBottomNavigationContribution : IBottomNavigationContribution {
    override val id: String = "dashboard-contribution"
    override val state = BottomNavigationContributionState(
        text = "Dashboard",
        icon = R.drawable.ic_dashboard_black_24dp,
        order = 2
    )
    override val isEnabled = true
    override fun fragment(): Class<out Fragment> = DashboardFragment::class.java
}
