package will.com.github.gs2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import will.com.github.gs2.R

class TeamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team)

        // Configurar a Toolbar
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Configurar o botão de voltar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Equipes")
    }

    override fun onSupportNavigateUp(): Boolean {
        // Faz com que o botão de voltar da Toolbar funcione
        onBackPressed()
        return true
    }
}
