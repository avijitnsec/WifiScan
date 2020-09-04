package com.example.wifiscan.data

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object wifiData {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<WifiNetworkInfo> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, WifiNetworkInfo> = HashMap()

    private const val COUNT = 15
    private var wifiManager = null

    private var mContext = null

    init {
//        mContext = ctxt
        listAvailableWifi()
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createWifiItem(i))
        }
    }

    private fun listAvailableWifi() {
//        wifiManager = context.SystemService(Context.WIFI_SERVICE) as WifiManager
        
    }

    private fun addItem(item: WifiNetworkInfo) {
        ITEMS.add(item)
        ITEM_MAP[item.id] = item
    }

    private fun createWifiItem(position: Int): WifiNetworkInfo {
        return WifiNetworkInfo(position.toString(), "Item $position", makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0 until position) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class WifiNetworkInfo(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}