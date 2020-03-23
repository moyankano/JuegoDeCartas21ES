package jael.android.juegodecartas21ES

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import jael.android.JuegoDeCartasDel21ES.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var count = 1
    var pressed = false
    var pressed2 = false
    var pressed3 = false
    var pressed4 = false
    var pressed5 = false
    var total = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val barajar = MutableList(5) { Random.nextInt(1, 13) }

        val nombreCarta = "carta" + barajar.get(0)
        val nombreCarta2 = "carta" + barajar.get(1)
        val nombreCarta3 = "carta" + barajar.get(2)
        val nombreCarta4 = "carta" + barajar.get(3)
        val nombreCarta5 = "carta" + barajar.get(4)

        val drawableResourceId =
            this.resources.getIdentifier(nombreCarta, "drawable", this.packageName)
        val drawableResourceId2 =
            this.resources.getIdentifier(nombreCarta2, "drawable", this.packageName)
        val drawableResourceId3 =
            this.resources.getIdentifier(nombreCarta3, "drawable", this.packageName)
        val drawableResourceId4 =
            this.resources.getIdentifier(nombreCarta4, "drawable", this.packageName)
        val drawableResourceId5 =
            this.resources.getIdentifier(nombreCarta5, "drawable", this.packageName)

        imageView.setOnClickListener {
            if (count <= 3 && !pressed) {
                imageView.setImageResource(drawableResourceId)
                total += barajar.get(0)
                editText5.setText(total.toString())
                count++
                pressed = true
            } else if (count <= 3 && pressed) {
                Log.d(
                    "onClickListener",
                    "Valores: count = $count y pressed = $pressed. No se realiza acción alguna"
                )
            } else if (count > 3 && !pressed) {
                checkAndShowFinalResult()
                restart()
            } else {
                checkAndShowFinalResult()
                restart()
            }
        }
        imageView2.setOnClickListener {

            if (count <= 3 && !pressed2) {
                imageView2.setImageResource(drawableResourceId2)
                total += barajar.get(1)
                editText5.setText(total.toString())
                count++
                pressed2 = true
            } else if (count <= 3 && pressed2) {
                Log.d(
                    "onClickListener2",
                    "Valores: count = $count y pressed = $pressed. No se realiza acción alguna"
                )
            } else if (count > 3 && !pressed2) {
                checkAndShowFinalResult()
                restart()
            } else {
                checkAndShowFinalResult()
                restart()
            }
        }
        imageView3.setOnClickListener {
            if (count <= 3 && !pressed3) {
                imageView3.setImageResource(drawableResourceId3)
                total += barajar.get(2)
                editText5.setText(total.toString())
                count++
                pressed3 = true
            } else if (count <= 3 && pressed3) {
                Log.d(
                    "onClickListener3",
                    "Valores: count = $count y pressed = $pressed. No se realiza acción alguna"
                )
            } else if (count > 3 && !pressed3) {
                checkAndShowFinalResult()
                restart()
            } else {
                checkAndShowFinalResult()
                restart()
            }
        }
        imageView4.setOnClickListener {
            if (count <= 3 && !pressed4) {
                imageView4.setImageResource(drawableResourceId4)
                total += barajar.get(3)
                editText5.setText(total.toString())
                count++
                pressed4 = true
            } else if (count <= 3 && pressed4) {
                Log.d(
                    "onClickListener4",
                    "Valores: count = $count y pressed = $pressed. No se realiza acción alguna"
                )
            } else if (count > 3 && !pressed4) {
                checkAndShowFinalResult()
                restart()
            } else {
                checkAndShowFinalResult()
                restart()
            }
        }
        imageView5.setOnClickListener {
            if (count <= 3 && !pressed5) {
                imageView5.setImageResource(drawableResourceId5)
                total += barajar.get(4)
                editText5.setText(total.toString())
                count++
                pressed5 = true
            } else if (count <= 3 && pressed5) {
                Log.d(
                    "onClickListener5",
                    "Valores: count = $count y pressed = $pressed. No se realiza acción alguna"
                )
            } else if (count > 3 && !pressed5) {
                checkAndShowFinalResult()
                restart()
            } else {
                checkAndShowFinalResult()
                restart()
            }
        }
    }

    private fun restart() {
        val intent = Intent(this, MainActivity::class.java)
        this.startActivity(intent)
    }

    private fun checkAndShowFinalResult() {
        if (total <= 21)
            imageView6.setImageResource(R.drawable.mano1)
        else
            imageView6.setImageResource(R.drawable.mano2)

        imageView6.visibility = View.VISIBLE
    }
}