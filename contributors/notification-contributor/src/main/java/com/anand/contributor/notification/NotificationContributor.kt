package com.anand.contributor.notification

import com.anand.contributor.contributor.api.IContributor

class NotificationContributor : IContributor {
    override val id = "notification-contributor"
    override fun bottomNavigationContribution() = NotificationBottomNavigationContribution()
}