package com.bilol.expand.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.bilol.expand.databinding.ItemChildBinding
import com.bilol.expand.databinding.ItemParentBinding

class MyExpandAdapter(private val tList:ArrayList<String>, private val map: HashMap<String,ArrayList<String>>):BaseExpandableListAdapter() {
    override fun getGroupCount(): Int = tList.size

    override fun getChildrenCount(p0: Int): Int {
       val groupName = tList[p0]
        return map[groupName]!!.size
    }

    override fun getGroup(p0: Int): Any {
        return tList[p0]
    }

    @SuppressLint("SuspiciousIndentation")
    override fun getChild(p0: Int, p1: Int): Any {
        val list = map[tList[p0]]
        return list!![p1]
    }

    override fun getGroupId(p0: Int): Long {
       return p0.toLong()
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View {
        val itemParentBinding = ItemParentBinding.inflate(LayoutInflater.from(p3?.context),p3,false)
        itemParentBinding.tvParent.text = tList[p0]
        return itemParentBinding.root
    }

    override fun getChildView(groupPosition: Int, childPositon: Int, p2: Boolean, p3: View?, parent: ViewGroup?): View {
        val itemChildBinding = ItemChildBinding.inflate(LayoutInflater.from(parent?.context),parent,false)
        itemChildBinding.tvChildName.text = map[tList[groupPosition]]?.get(childPositon)
        return itemChildBinding.root
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }
}