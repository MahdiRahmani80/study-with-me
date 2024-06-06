package ir.m3.rahmani.studywithme.home.challenge

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import ir.m3.rahmani.home_datastore.model.Challenge
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.ItemChallengeBinding

class ChallengeAdapter(
    private val challenges: List<Challenge>
) : RecyclerView.Adapter<ChallengeAdapter.ViewHolder>() {

    private lateinit var context: Context
    var onItemClick: ((Challenge) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val binding = ItemChallengeBinding.inflate(
            LayoutInflater.from(context), parent, false
        )
        return (ViewHolder(binding))
    }

    override fun getItemCount(): Int = challenges.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val challenge = challenges[position]
        holder.bind(context, challenge)

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(challenge)
        }

    }

    inner class ViewHolder(
        private val binding: ItemChallengeBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(context: Context, challenge: Challenge) {
            binding.challengeTitle.text = challenge.user_requested_username
            binding.tvDate.text = showDate(challenge.date)
            binding.coin.text = challenge.coin
            binding.challengeDescription.text = mkDescription(context, challenge)
        }

        private fun showDate(date: String?): String {
            val d = date?.substring(5, 10)
            val time = date?.substring(11)
            return d + "   *_*   " + time
        }

        fun mkDescription(context: Context, challenge: Challenge): String {
            val start = challenge.start
            val end = challenge.end
            val target = challenge.target
            return context.getString(R.string.item_challenge_description, target)
        }
    }
}