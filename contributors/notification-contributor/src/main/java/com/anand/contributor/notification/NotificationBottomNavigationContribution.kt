package com.anand.contributor.notification

import androidx.fragment.app.Fragment
import com.anand.contributor.contributor.api.BottomNavigationContributionState
import com.anand.contributor.contributor.api.IBottomNavigationContribution

class NotificationBottomNavigationContribution: IBottomNavigationContribution {
    override val id: String = "notification-contribution"
    override val state = BottomNavigationContributionState(
        text = "Notification",
        icon = R.drawable.ic_notifications_black_24dp,
        order = 3
    )
    override val isEnabled = true
    override fun fragment(): Class<out Fragment> = NotificationsFragment::class.java
}
