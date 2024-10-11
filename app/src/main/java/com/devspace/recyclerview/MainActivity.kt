package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)

    }
}

private val contacts = listOf(
    Contact(
        name = "Rebeca",
        phone = "(55)11 98827-5683",
        icon = R.drawable.sample1
    ),
    Contact(
        name = "Eduardo",
        phone = "(55)11 98326-5683",
        icon = R.drawable.sample2
    ),
    Contact(
        name = "Magali",
        phone = "(55)11 99195-6563",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Camila",
        phone = "(55)11 99727-1473",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "Rafaela",
        phone = "(55)11 97727-5153",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Patricia",
        phone = "(55)11 98727-2533",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Marilia",
        phone = "(55)11 96727-6563",
        icon = R.drawable.sample7
    ),
    Contact(
        name = "Marlon",
        phone = "(55)11 99227-6363",
        icon = R.drawable.sample8
    ),
    Contact(
        name = "Erick",
        phone = "(55) 11 98722-5913",
        icon = R.drawable.sample9
    ),
    Contact(
        name = "Davi",
        phone = "(55) 11 99277-9213",
        icon = R.drawable.sample10
    ),
    Contact(
        name = "Lorena",
        phone = "(55) 11 97221-1523",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Paulo",
        phone = "(55) 11 96171-1223",
        icon = R.drawable.sample12
    ),
    Contact(
        name = "Julia",
        phone = "(55) 11 97225-4513",
        icon = R.drawable.sample13
    ),
    Contact(
        name = "Carlos",
        phone = "(55) 11 99111-1293",
        icon = R.drawable.sample14
    ),
    Contact(
        name = "Maria",
        phone = "(55) 11 97453-1298",
        icon = R.drawable.sample15
    ),
    Contact(
        name = "Eduarda",
        phone = "(55) 11 97753-1192",
        icon = R.drawable.sample16
    ),
)