package com.example.madlevel4task1

import androidx.room.*

@Dao
class ItemDao {
    @Query("SELECT * FROM itemTable")
    suspend fun getAllItems(): List<Item>

    @Insert
    suspend fun insertItem(item: Item)

    @Delete
    suspend fun deleteItem(item: Item)

    @Update
    suspend fun updateItem(item: Item)
}