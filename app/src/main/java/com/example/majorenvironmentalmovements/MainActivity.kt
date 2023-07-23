package com.example.majorenvironmentalmovements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView : RecyclerView
    lateinit var newsArrayList : ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myRecyclerView = findViewById(R.id.recyclerview)

        val imageArray = arrayOf(
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img_6)

        val headingArray = arrayOf(
            "Bishnoi Movement",
            "Chipko Movement",
            "Save Silent Valley Movement",
            "Jungle Bachao Andholan",
            "Appiko Movement",
            "Narmada Bachao Andholan (NBA)",
            "Tehri Dam Conflict")

        val newsContent = arrayOf(
            "What was it all about: Amrita Devi, a female villager could not bear to witness the destruction of both her faith and the village’s sacred trees. She hugged the trees and encouraged others to do the same. 363 Bishnoi villagers were killed in this movement.\n" +
                    "\n" +
                    "The Bishnoi tree martyrs were influenced by the teachings of Guru Maharaj Jambaji, who founded the Bishnoi faith in 1485 and set forth principles forbidding harm to trees and animals. The king who came to know about these events rushed to the village and apologized, ordering the soldiers to cease logging operations. Soon afterwards, the maharajah designated the Bishnoi state as a protected area, forbidding harm to trees and animals. This legislation still exists today in the region.\n" +
                    "   ",
            "What was it all about: Mr. Bahuguna enlightened the villagers by conveying the importance of trees in the environment which checks the erosion of soil, cause rains and provides pure air. The women of Advani village of Tehri-Garhwal tied the sacred thread around trunks of trees and they hugged the trees, hence it was called the ‘Chipko Movement’ or ‘hug the tree movement’.\n" +
                    "\n" +
                    "The main demand of the people in these protests was that the benefits of the forests (especially the right to fodder) should go to local people. The Chipko movement gathered momentum in 1978 when the women faced police firings and other tortures.\n" +
                    "\n" +
                    "The then state Chief Minister, Hemwati Nandan Bahuguna set up a committee to look into the matter, which eventually ruled in favour of the villagers. This became a turning point in the history of eco-development struggles in the region and around the world.\n" +
                    "   ",
            "What was it all about: The Kerala State Electricity Board (KSEB) proposed a hydroelectric dam across the Kunthipuzha River that runs through Silent Valley. In February 1973, the Planning Commission approved the project at a cost of about Rs 25 crores. Many feared that the project would submerge 8.3 sq km of untouched moist evergreen forest. Several NGOs strongly opposed the project and urged the government to abandon it.\n" +
                    "\n" +
                    "In January 1981, bowing to unrelenting public pressure, Indira Gandhi declared that Silent Valley will be protected. In June 1983 the Center re-examined the issue through a commission chaired by Prof. M.G.K. Menon. In November 1983 the Silent Valley Hydroelectric Project was called off. In 1985, Prime Minister Rajiv Gandhi formally inaugurated the Silent Valley National Park.\n" +
                    "    ",
            "The Jungle Bachao Andolan emerged in the early 1980s in the Indian state of Jharkhand. The Jharkhand Jungle Bachao Andolan played a significant role in bringing the issues of Adivasis to the forefront. It helped in promoting their rights and well-being.\n" +
                    "\n" +
                    "        1.Jharkhand is rich in natural resources such as minerals, forests, and water. The region is also home to a significant indigenous population.\n" +
                    "\n" +
                    "        2This comprises various tribes such as Munda, Ho, and Santhal.\n" +
                    "\n" +
                    "        3.Since 1947, the Indian government has pursued a policy of industrialization and economic growth. This has often come at the cost of the environment and the rights of the local population.\n" +
                    "\n" +
                    "        4.In Jharkhand, large-scale commercial projects such as mining, dams, and power plants were being proposed. These were implemented without proper consent from the local communities.\n" +
                    "\n" +
                    "        5.It had a significant impact on the Adivasi (indigenous) communities living in the forest areas of Jharkhand.\n" +
                    "\n" +
                    "        6.The Jungle Bachao Andolan movement aimed to protect the forests and the rights of the people living in them.\n" +
                    "\n" +
                    "        7.The Adivasi communities had been living in harmony with the forests for generations. Deforestation and degradation threatened their way of life.\n" +
                    "\n" +
                    "        8.The Adivasi communities had been facing displacement due to large-scale commercial projects.\n" +
                    "\n" +
                    "        9.The Jungle Bachao Andolan highlighted the importance of preserving the forests and the rights of the Adivasi communities. It also helped to raise awareness about their plight.\n" +
                    "\n" +
                    "        10.The movement helped empower the Adivasi communities, giving them a voice in the decision-making process.\n" +
                    "   ",
            "The Movement Methods\n" +
                    "\n" +
                    "The Appiko Movement uses various techniques to raise awareness: foot marches in the interior forests, slide shows, folk dances, street plays and so on. The movement has achieved a fair amount of success: the state government has banned felling of green trees in some forest areas; only dead, dying and dry trees are felled to meet local requirements. The movement has spread to the four hill districts of Karnataka Province, and has the potential to spread to the Eastern Ghats in Tamil Nadu Province and to Goa Province.\n" +
                    "\n" +
                    "The second area of the Appiko Movement\\'s work is to promote afforestation on denuded lands. In the villagers to grow saplings. Individual families as well as village youth clubs have taken an active interest in growing decentralized nurseries. An all-time record of 1.2 million saplings were grown by people in the Sirsi area in 1984-1985. No doubt this was possible due to the cooperation of the forest department, which supplied the plastic bags for growing saplings. In the process of developing the decentralized nursery, the activists realized that forest department makes extra money in raising a nursery. The cost paid for one sapling grown by a villager was 20 paise (US 2c), whereas the cost of a single sapling raised by the forest department amounted to a minimum of Rs 2 (US 15c). In addition, the forest department used fertilizers and gave tablets to saplings. The Appiko Movement\\'s experience has brought an overuse of chemical fertilizers into the forest nursery, making it a capital-intensive, money-making program. The nursery program propagated by the forest department is really a means for utilizing village labor at cheap rates. Appiko activists have learnt lessons from this experience, and they are now growing saplings only to meet their own needs, not to give to the forest department.\n" +
                    "\n" +
                    " The villagers have initiated a process of regeneration in barren common land. The Youth Club has taken the responsibility for the project and the whole village has united to protect this land from grazing, lopping and fire. The experience shows that in those areas where soil is present, natural regeneration is the most efficient and least expensive method of bringing barren area under free cover. In the areas in which topsoil is washed off, tree planting - especially of indigenous, fast-growing species - is done. The irony is that the forest department is resorting to the mechanized planting of exotic species, and also uses huge amounts of fertilizers on these exotic, monoculture plantations. This work will definitely harm the soil, and eventually the tree cover, in the area. Two obvious techniques of greening are being performed: one the forest department's method, is capital intensive, and the other, the people's technique of growing through regeneration, is a natural process for sustainable development of the soil.\n" +
                    "\n" +
                    "   ",
            " What was it all about: The movement first started as a protest for not providing proper rehabilitation and resettlement for the people who have been displaced by the construction of the Sardar Sarovar Dam. Later on, the movement turned its focus on the preservation of the environment and the eco-systems of the valley. Activists also demanded the height of the dam to be reduced to 88 m from the proposed height of 130m. World Bank withdrew from the project.\n" +
                    "\n" +
                    "The environmental issue was taken into court. In October 2000, the Supreme Court gave a judgment approving the construction of the Sardar Sarovar Dam with a condition that the height of the dam could be raised to 90 m. This height is much higher than the 88 m which anti-dam activists demanded, but it is definitely lower than the proposed height of 130 m. The project is now largely financed by the state governments and market borrowings. The project is expected to be fully com\u00ADpleted by 2025.\n" +
                    "\n" +
                    "Although not successful, as the dam could not be prevented, the NBA has created an anti-big dam opinion in India and outside. It questioned the paradigm of development. As a democratic movement, it followed the Gandhian way 100 per cent.\n" +
                    "   ",
            " The Tehri Dam is situated in the Tehri Garhwal district in Uttarakhand, India. This multi-purpose rock and earth-fill embankment dam is the tallest dam in the country. The dam was built in 2006 for providing water to generate electricity, irrigation as well as municipal water supply. The sediment trap efficiency of the dam is 95%. It was designed in a manner to make it capable of offsetting 150 years of sedimentation. Tehri dam river is the Bhagirathi River of Uttarakhand. This dam is a primary part of the Tehri Hydro Development Corporation Ltd. and Tehri hydroelectric complex. Standing tall as one of the highest dams in Asia, the Tehri Dam is a multi-purpose dam with a reservoir that generates around 1,000 MW of hydroelectricity.\n" +
                    "\n" +
                    "        History of Tehri Dam\n" +
                    "Under the ministry of India’s first prime minister, Jawahar Lal Nehru, a preliminary investigation of the dam was completed in 1961. The design was completed in 1972 and had a 600 MW capacity power plant.\n" +
                    "\n" +
                    "In 1978, the construction of the dam started after studying all the possibilities. However, the construction got delayed because there were various financial constraints and social and environmental impacts.\n" +
                    "\n" +
                    "The USSR provided their technical and financial assistance in 1986, which also witnessed the interference of political instability. Thus, the project’s control ended up in the hands of India.\n" +
                    "\n" +
                    "The project was first given to Uttar Pradesh’s Irrigation Department. But, the Tehri Hydro Development Corporation was established for managing the dam in 1988. The funding’s responsibility was 75% of the federal government and 25% of the state. It was decided that Uttar Pradesh will be responsible for financing the project’s whole irrigation portion.\n" +
                    "   ")

        myRecyclerView.layoutManager = LinearLayoutManager(this)

        newsArrayList = arrayListOf<News>()

        for(index in imageArray.indices){
            val news = News(headingArray[index],imageArray[index],newsContent[index])
            newsArrayList.add(news)
        }

        var myAdapter = MyAdapter(newsArrayList,this)
        myRecyclerView.adapter =myAdapter
        myAdapter.setOnItemClickListener(object :MyAdapter.onItemClickListener{
        override fun onItemClick(position : Int){
            // action to perform on each item click
            val intent = Intent(applicationContext,NewsDetailActivity::class.java)
            intent.putExtra("heading",newsArrayList[position].newsHeading)
            intent.putExtra("imageId",newsArrayList[position].newsImage)
            intent.putExtra("newscontent",newsArrayList[position].newsContent)
            startActivity(intent)
        }
        })
    }
}