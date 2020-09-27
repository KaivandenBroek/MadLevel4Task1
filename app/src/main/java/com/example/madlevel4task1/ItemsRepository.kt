package com.example.madlevel4task1

import android.content.Context

public class ItemsRepository(context: Context) {

    private var itemDao: ItemDao

    init {
        val itemRoomDatabase = ItemRoomDatabase.getDatabase(context)
        itemDao = itemRoomDatabase!!.itemDao()
    }

    suspend fun getAllItems(): List<Item> {
        return itemDao.getAllItems()
    }

    suspend fun insertItem(item: Item) {
        itemDao.insertItem(item)
    }

    suspend fun deleteItem(item: Item) {
        itemDao.deleteItem()
    }

    suspend fun updateItem(item: Item) {
        itemDao.updateItem()
    }
}