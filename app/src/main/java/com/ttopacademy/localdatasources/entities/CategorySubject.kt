package com.ttopacademy.localdatasources.entities

import androidx.room.PrimaryKey
import java.util.*

data class CategorySubject(

    /** Returns categorySubjectID. */
    @PrimaryKey val categorySubjectID: Int,

    /** Returns categoryID. */
    val categoryID: Int,

    /** Returns subjectID. */
    val subjectID: Int,

    /** Returns subjectID. */
    val dateSavedToLocalDatabase: Date
)
