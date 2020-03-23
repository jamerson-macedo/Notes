package com.example.blocodenotas.di

import android.app.Application
import androidx.room.Room
import com.example.blocodenotas.persistence.NoteDao
import com.example.blocodenotas.persistence.NoteDataBase
import com.example.blocodenotas.repository.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// @Provides anotação. Métodos anotados retornam instâncias de classes que não podem suportar a @Injectanotação.
@Module
class AppModule {
    @Singleton
    @Provides
    fun providesNoteDao(db: NoteDataBase): NoteDao {
        return db.notedao()

    }

    @Singleton
    @Provides
    fun provideAppDatabase(app: Application): NoteDataBase {
        return Room.databaseBuilder(app, NoteDataBase::class.java, "note_database").build()
    }

    @Singleton
    @Provides
    fun providesrepository(): Repository {
        return Repository()
    }
}