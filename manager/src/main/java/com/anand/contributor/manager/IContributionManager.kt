/*
 * Copyright (c) Microsoft Corporation. Licensed under the MIT license.
 */
package com.anand.contributor.manager

import com.anand.contributor.contributor.api.IBottomNavigationContribution

interface IContributionManager {
    fun getBottomNavigationContributions(): List<IBottomNavigationContribution>
}
