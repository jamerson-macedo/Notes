package com.example.blocodenotas.persistence

import androidx.room.Entity

@Entity(tableName = "tbl_note")
class Note (id:Int, title:String?, description:String?,tag:String?){
}