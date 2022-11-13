/*
 * Copyright (c) Microsoft Corporation. Licensed under the MIT license.
 */
package com.anand.contributor.manager

import com.anand.contributor.contributor.api.IBottomNavigationContribution

class ContributionManager(
    private val registry: IContributorRegistry
) : IContributionManager {
    override fun getBottomNavigationContributions(): List<IBottomNavigationContribution> {
        return registry.registeredContributors().map {
            it.bottomNavigationContribution()
        }.filter {
            it.isEnabled
        }.sortedBy {
            it.state.order
        }
    }
}