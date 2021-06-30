package com.kanayo.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.kanayo.tabs.views.CallsFragment
import com.kanayo.tabs.views.ChatsFragment
import com.kanayo.tabs.views.StatusFragment

class WhatsappAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {//ctrl + o to override
        when(position){
            0 -> return "Chat"
            1 -> return "Status"
            2 -> return "Calls"
            else -> return "Chat"

        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return ChatsFragment()
            1 -> return StatusFragment()
            2 -> return CallsFragment()
            else -> return ChatsFragment()
        }
    }
}