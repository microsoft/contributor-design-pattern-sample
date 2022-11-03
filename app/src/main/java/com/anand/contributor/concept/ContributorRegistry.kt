package com.anand.contributor.concept

import com.anand.contributor.contributor.api.IContributor
import com.anand.contributor.dashboard.DashboardContributor
import com.anand.contributor.home.HomeContributor
import com.anand.contributor.manager.IContributorRegistry
import com.anand.contributor.notification.NotificationContributor

class ContributorRegistry: IContributorRegistry {
    override fun registeredContributors(): List<IContributor> {
        return listOf(
            HomeContributor(), DashboardContributor(), NotificationContributor()
        )
    }
}