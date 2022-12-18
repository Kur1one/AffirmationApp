package com.example.affirmationapp.data

import com.example.affirmationapp.R
import com.example.affirmationapp.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.i_dont_make_mistakes),
            Affirmation(R.string.affirmation2, R.drawable.im_not_just_like_the_rest_of_you),
            Affirmation(R.string.affirmation3, R.drawable.im_stronger),
            Affirmation(R.string.affirmation4, R.drawable.im_smarter),
            Affirmation(R.string.affirmation5, R.drawable.im_better),
            Affirmation(R.string.affirmation6, R.drawable.iam_better)
                )
    }
}