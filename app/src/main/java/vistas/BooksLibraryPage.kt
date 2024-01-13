package vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView
import java.clases.R

private lateinit var backwardsButton: CardView
class BooksLibraryPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Warden_library)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_library_page)
        initComponents()
        initListeners()
    }

    /**
     * Inicializa los componentes
     */
    private fun initComponents(){
        backwardsButton = findViewById(R.id.backwardsButton)
    }

    /**
     * inicializa los listeners
     */
    private fun initListeners(){
        backwardsButton.setOnClickListener {
            // Llama a finish() para cerrar la actividad actual y volver a la anterior
            finish()
        }
    }
}