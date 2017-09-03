package com.luseen.ribble.presentation.screen.dispatch

import com.luseen.ribble.presentation.base_mvp.base.BaseActivity
import com.luseen.ribble.presentation.screen.auth.AuthActivity
import com.luseen.ribble.presentation.screen.home.HomeActivity
import com.luseen.ribble.utils.start
import javax.inject.Inject

class DispatchActivity : BaseActivity<DispatchContract.View, DispatchContract.Presenter>(), DispatchContract.View {

    @Inject
    protected lateinit var dispatchPresenter: DispatchPresenter

    override fun injectDependencies() {
        activityComponent.inject(this)
    }

    override fun initPresenter(): DispatchContract.Presenter = dispatchPresenter

    override fun openHomeActivity() {
        start {
            HomeActivity::class.java
        }
        finish()
    }

    override fun openLoginActivity() {
        start {
            AuthActivity::class.java
        }
        finish()
    }
}
