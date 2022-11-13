/*
 * Copyright (c) Microsoft Corporation. Licensed under the MIT license.
 */
package com.anand.contributor.contributor.api

interface IContributor {
    val id: String
    fun bottomNavigationContribution(): IBottomNavigationContribution
}