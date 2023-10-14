package eu.nida.newquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: TextView = findViewById(R.id.btn_finish)
        val btnRestart: TextView = findViewById(R.id.btn_restart)
        tvName.text= intent.getStringExtra(Constants.USER_NAME)

        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        tvScore.text="Your Score is ${correctAnswers}/${totalQuestion}"

        btnRestart.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        btnFinish.setOnClickListener {
            finish()
        }


    }
}