package com.example.calmmind

class MeditationAdapter(private val meditationList: List<Meditation>) :
    RecyclerView.Adapter<MeditationAdapter.MeditationViewHolder>() {

    class MeditationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.textTitle)
        val duration: TextView = itemView.findViewById(R.id.textDuration)
        val image: ImageView = itemView.findViewById(R.id.imageMeditation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeditationViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_meditation, parent, false)
        return MeditationViewHolder(view)
    }

    override fun onBindViewHolder(holder: MeditationViewHolder, position: Int) {
        val meditation = meditationList[position]
        holder.title.text = meditation.title
        holder.duration.text = meditation.duration
        holder.image.setImageResource(meditation.imageResId)
    }

    override fun getItemCount() = meditationList.size
}
