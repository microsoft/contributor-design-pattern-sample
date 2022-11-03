package com.anand.contributor.home

import com.anand.contributor.contributor.api.IContributor

class HomeContributor : IContributor {
    override val id = "home-contributor"
    override fun bottomNavigationContribution()= HomeBottomNavigationContribution()
}