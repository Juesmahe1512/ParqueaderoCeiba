package com.example.parqueaderoceiba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parqueaderoceiba.internal.di.components.DaggerMainActivityComponent
import com.example.parqueaderoceiba.internal.di.modules.MainActivityModule
import com.example.parqueaderoceiba.internal.di.modules.UseCasesModule
import com.example.parqueaderoceiba.presenters.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMainActivityComponent.builder().mainActivityModule(MainActivityModule(this))
            .useCasesModule(
                UseCasesModule()
            ).build().inject(this)
        crearCarro()
    }

    fun crearCarro(){
        button.setOnClickListener {
            System.out.println(this.presenter.crearCarro().toString())
        }
    }
}