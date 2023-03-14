package com.bilol.expand.models

object MyData {
    val map = HashMap<String, ArrayList<String>>()
    val titleList = ArrayList<String>()

    fun addMap() {
        titleList.add("Mobiles")
        titleList.add("Laptops")
        titleList.add("Computer Accessories")
        titleList.add("Home Entertainment")
        titleList.add("TVs by brand")
        titleList.add("Kitchen Appliances")

        val list1 = arrayListOf<String>("Mi", "RealMe", "Samsung", "Apple", "Honor")
        val list2 = arrayListOf<String>("Dell", "MAC", "HP", "ASUS")
        val list3 = arrayListOf<String>("Pendrive", "Mouse", "Keyboard")
        val list4 = arrayListOf<String>("Video game", "Television", "PS", "Home audio")
        val list5 = arrayListOf<String>("LG", "Hisense", "Sony", "Panasonic", "Philips")
        val list6 = arrayListOf<String>("Frezer", "Boiler", "Ranges", "Dishwasher", "Microwave")

        map[titleList[0]] = list1
        map[titleList[1]] = list2
        map[titleList[2]] = list3
        map[titleList[3]] = list4
        map[titleList[4]] = list5
        map[titleList[5]] = list6

    }
}