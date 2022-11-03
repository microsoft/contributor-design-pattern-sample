package com.anand.contributor.concept

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.anand.contributor.concept.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    private lateinit var fragmentContainer: FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView = binding.navView
        fragmentContainer = binding.fragmentContainerView
        navView.setOnItemSelectedListener { menuItem ->
            viewModel.getFragment(menuItem.actionView.tag.toString())?.let { fragment ->
                loadFragment(fragment)
            }
            true
        }

        viewModel.bottomNavigationContributions.observe(this) { contributions ->
            navView.menu.clear()
            contributions.forEach { contribution ->
                contribution.state.let { state ->
                    val menuItem = navView.menu.add(state.text)
                    menuItem.icon = ResourcesCompat.getDrawable(resources, state.icon, theme)
                    // Associate contribution id to menu items using action view.
                    // Could also maintain a map to achieve this association.
                    menuItem.actionView = View(this).apply {
                        tag = contribution.id
                    }
                }
            }
            loadFragment(contributions.first().fragment())
        }
    }

    private fun loadFragment(
        fragment: Class<out Fragment>
    ) = supportFragmentManager.beginTransaction()
        .replace(
            fragmentContainer.id,
            fragment,
            null
        ).commit()
}