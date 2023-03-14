package com.bilol.expand

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bilol.expand.databinding.ActivityThirdBinding
import com.bilol.expand.databinding.ItemChildBinding
import com.bilol.expand.models.MyData

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomi = intent.getStringExtra("name")


        if (nomi == MyData.map[MyData.titleList[0]]?.get(0)) {
            binding.tvName.text =
                "$nomi \n\n Xiaomi Corporation Chinese: 小米), commonly known as Xiaomi and registered as Xiaomi Inc., is a Chinese designer and manufacturer of consumer electronics and related software, home appliances, and household items. Behind Samsung, it is the second largest manufacturer of smartphones in the world, most of which run the MIUI operating system. The company is ranked 338th and is the youngest company on the Fortune Global 500."
        }
        if (nomi == MyData.map[MyData.titleList[0]]?.get(1)) {
            binding.tvName.text =
                "$nomi \n\n Realme (stylized as realme) is a Chinese consumer electronics manufacturer based in Shenzhen, Guangdong. It was founded by Li Bingzhong (known as Sky Li) on May 4, 2018, who was former vice president of Oppo. Started originally as a sub-brand of Oppo, Realme eventually ventured as its own brand. Realme then became the fastest-growing 5G smartphone brand in Q3 2021 with an 831% growth rate."
        }
        if (nomi == MyData.map[MyData.titleList[0]]?.get(2)) {
            binding.tvName.text =
                "$nomi \n\n The Samsung Group[3] (or simply Samsung) (Korean: 삼성 [samsʌŋ]) is a South Korean multinational manufacturing conglomerate headquartered in Samsung Town, Seoul, South Korea.[1] It comprises numerous affiliated businesses,[1] most of them united under the Samsung brand, and is the largest South Korean chaebol (business conglomerate). As of 2020, Samsung has the eighth highest global brand value"
        }
        if (nomi == MyData.map[MyData.titleList[0]]?.get(3)) {
            binding.tvName.text =
                "$nomi \n\n Apple Inc. is an American multinational technology company headquartered in Cupertino, California, United States. Apple is the largest technology company by revenue (totaling US\$365.8 billion in 2021) and, as of June 2022, is the world's biggest company by market capitalization, the fourth-largest personal computer vendor by unit sales and second-largest mobile phone manufacturer. It is one of the Big Five American information technology companies, alongside Alphabet, Amazon, Meta, and Microsoft."
        }
        if (nomi == MyData.map[MyData.titleList[0]]?.get(4)) {
            binding.tvName.text =
                "$nomi \n\n Honor (stylized and marketed as HONOR) is a smartphone brand majority owned by a state-owned enterprise controlled by the municipal government of Shenzhen. It was formerly owned by Huawei Technologies. Honor pro"
        }
        if (nomi == MyData.map[MyData.titleList[1]]?.get(0)) {
            binding.tvName.text =
                "$nomi \n\n Dell is an American technology company that develops, sells, repairs, and supports computers and related products and services and is owned by its parent company, Dell Technologies"
        }
        if (nomi == MyData.map[MyData.titleList[1]]?.get(1)) {
            binding.tvName.text =
                "$nomi \n\n macOS (/ˌmækoʊˈɛs/;[8] previously OS X and originally Mac OS X) is a Unix operating system[9] developed and marketed by Apple Inc. since 2001. It is the primary operating system for Apple's Mac computers. Within the market of desktop and laptop computers it is the second most widely used desktop OS, after Microsoft Windows and ahead of ChromeOS."
        }
        if (nomi == MyData.map[MyData.titleList[1]]?.get(2)) {
            binding.tvName.text =
                "$nomi \n\n The Hewlett-Packard Company, commonly shortened to Hewlett-Packard (/ˈhjuːlɪt ˈpækərd/ HYEW-lit PAK-ərd) or HP, was an American multinational information technology company headquartered in Palo Alto, California. HP developed and provided a wide variety of hardware components, as well as software and related services to consumers, small and medium-sized businesses (SMBs), and large enterprises, including customers in the government, health, and education sectors."
        }
        if (nomi == MyData.map[MyData.titleList[1]]?.get(3)) {
            binding.tvName.text =
                "$nomi \n\n Asia's Top 10 IT Companies\" rankings, and it ranked first in the IT Hardware category of the 2008 Taiwan Top 10 Global Brands survey with a total brand value of \$1.3 billion.[9]"
        }
        if (nomi == MyData.map[MyData.titleList[2]]?.get(0)) {
            binding.tvName.text =
                "$nomi \n\n A USB flash drive (also called a thumb drive)[1][note 1] is a data storage device that includes flash memory with an integrated USB interface. It is typically removable, rewritable and much smaller than an optical disc. "
        }
        if (nomi == MyData.map[MyData.titleList[2]]?.get(1)) {
            binding.tvName.text =
                "$nomi \n\n The mouse is a small, movable device that lets you control a range of things on a computer. Most types of mouse have two buttons, and some will have a wheel in between the buttons. Most types of mouse connect to the computer with a cable, and use the computer's power to work."
        }
        if (nomi == MyData.map[MyData.titleList[2]]?.get(2)) {
            binding.tvName.text =
                "$nomi \n\n A keyboard is for putting information including letters, words and numbers into your computer. You press the individual buttons on the keyboard when you type. The number keys across the top of the keyboard are also found on the right of the keyboard. The letter keys are in the centre of the keyboard."
        }
        if (nomi == MyData.map[MyData.titleList[3]]?.get(0)) {
            binding.tvName.text =
                "$nomi \n\n Video games, also known as computer games, are electronic games that involves interaction with a user interface or input device – such as a joystick, ..."
        }
        if (nomi == MyData.map[MyData.titleList[3]]?.get(1)) {
            binding.tvName.text =
                "$nomi \n\n Television is a system for transmitting visual images and sound that are reproduced on screens, chiefly used to broadcast programs for entertainment, information, and education. The television set has become a commonplace in many households, businesses, and institutions. It is a major vehicle for advertising."
        }
        if (nomi == MyData.map[MyData.titleList[3]]?.get(2)) {
            binding.tvName.text =
                "$nomi \n\n PlayStation (Japanese: プレイステーション, Hepburn: Pureisutēshon, officially abbreviated as PS) is a video gaming brand that consists of five home video game consoles, two handhelds, a media center, and a smartphone, as well as an online service and multiple magazines."
        }
        if (nomi == MyData.map[MyData.titleList[3]]?.get(3)) {
            binding.tvName.text =
                "$nomi \n\n Home audio systems are audio electronics intended for home entertainment use, such as shelf stereos, music centres and surround sound receivers."
        }
        if (nomi == MyData.map[MyData.titleList[4]]?.get(0)) {
            binding.tvName.text =
                "$nomi \n\n LG Electronics Inc. (Korean: 엘지 전자; RR: Elji Jeonja) is a South Korean multinational electronics company headquartered in Yeouido-dong, Seoul, South Korea. LG Electronics is a part of LG Corporation, the fourth largest chaebol in South Korea, and often considered as the pinnacle of LG"
        }
        if (nomi == MyData.map[MyData.titleList[4]]?.get(1)) {
            binding.tvName.text =
                "$nomi \n\n Hisense Group is a Chinese multinational major appliance and electronics manufacturer headquartered in Qingdao, Shandong Province, China. Televisions are the main products of Hisense, and it is the largest TV manufacturer in China by market share since 2004"
        }
        if (nomi == MyData.map[MyData.titleList[4]]?.get(2)) {
            binding.tvName.text =
                "$nomi \n\n Sony Group Corporation, commonly stylized as SONY, is a Japanese multinational conglomerate corporation headquartered in Minato, Tokyo, Japan. Wikipedia"
        }
        if (nomi == MyData.map[MyData.titleList[4]]?.get(3)) {
            binding.tvName.text =
                "$nomi \n\n Panasonic Holdings Corporation, formerly Matsushita Electric Industrial Co., Ltd. between 1935 and 2008 and the first incarnation of Panasonic Corporation between 2008 and 2022, is a major Japanese multinational conglomerate corporation, headquartered in Kadoma, Osaka. Wikipedia"
        }
        if (nomi == MyData.map[MyData.titleList[4]]?.get(4)) {
            binding.tvName.text =
                "$nomi \n\n Koninklijke Philips N.V., commonly shortened to Philips, is a Dutch multinational conglomerate corporation that was founded in Eindhoven in 1891. Since 1997, it has been mostly headquartered in Amsterdam, though the Benelux headquarters is still in Eindhoven."
        }
        if (nomi == MyData.map[MyData.titleList[5]]?.get(0)) {
            binding.tvName.text =
                "$nomi \n\n A freezer is a large container like a fridge in which the temperature is kept below freezing point so that you can store food inside it for long periods."
        }
        if (nomi == MyData.map[MyData.titleList[5]]?.get(1)) {
            binding.tvName.text =
                "$nomi \n\n boiler, also called Steam Generator, apparatus designed to convert a liquid to vapour. In a conventional steam power plant, a boiler consists of a furnace in which fuel is burned, surfaces to transmit heat from the combustion products to the water, and a space where steam can form and collect."
        }
        if (nomi == MyData.map[MyData.titleList[5]]?.get(2)) {
            binding.tvName.text =
                "$nomi \n\n This table is offered only to show general information about the performing ranges of particular instruments. There are a number of variations in the type ..."
        }
        if (nomi == MyData.map[MyData.titleList[5]]?.get(3)) {
            binding.tvName.text =
                "$nomi \n\n A dishwasher is a machine that is used to clean dishware, cookware, and cutlery automatically."
        }
        if (nomi == MyData.map[MyData.titleList[5]]?.get(4)) {
            binding.tvName.text =
                "$nomi \n\n Description. Microwave ovens heat food using microwaves, a form of electromagnetic radiation similar to radio waves. Microwaves have three characteristics that allow them to be used in cooking: they are reflected by metal; they pass through glass, paper, plastic, and similar materials; and they are absorbed by foods."
        }

    }
}