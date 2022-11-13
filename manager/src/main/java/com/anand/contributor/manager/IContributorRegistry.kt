/*
 * Copyright (c) Microsoft Corporation. Licensed under the MIT license.
 */
package com.anand.contributor.manager

import com.anand.contributor.contributor.api.IContributor

interface IContributorRegistry {
    fun registeredContributors(): List<IContributor>
}