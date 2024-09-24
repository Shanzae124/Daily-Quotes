package com.example.dailyquotes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.dailyquotes.R

data class Dailyquotes(
    @StringRes val day : Int,
    @DrawableRes val imageResourceId : Int,
    @StringRes val stringResourceId : Int
)

 val dailyquotes = listOf(
     Dailyquotes(R.string.day_1 , R.drawable.image1 , R.string.content_desc_1),
     Dailyquotes(R.string.day_2, R.drawable.image2 , R.string.content_desc_2),
     Dailyquotes(R.string.day_3 , R.drawable.image3 , R.string.content_desc_3),
     Dailyquotes(R.string.day_4 , R.drawable.image4 , R.string.content_desc_4),
     Dailyquotes(R.string.day_5 , R.drawable.image5 , R.string.content_desc_5),
     Dailyquotes(R.string.day_6 , R.drawable.image6 , R.string.content_desc_6),
     Dailyquotes(R.string.day_7 , R.drawable.image7 , R.string.content_desc_7),
     Dailyquotes(R.string.day_8 , R.drawable.image8 , R.string.content_desc_8),
     Dailyquotes(R.string.day_9, R.drawable.image9, R.string.content_desc_9),
     Dailyquotes(R.string.day_10, R.drawable.image10 , R.string.content_desc_10),
     Dailyquotes(R.string.day_11, R.drawable.image11 , R.string.content_desc_11),
     Dailyquotes(R.string.day_12, R.drawable.image12 , R.string.content_desc_12),
     Dailyquotes(R.string.day_13, R.drawable.image13 , R.string.content_desc_13),
     Dailyquotes(R.string.day_14, R.drawable.image14 , R.string.content_desc_14),
     Dailyquotes(R.string.day_15, R.drawable.image15 , R.string.content_desc_15),
     Dailyquotes(R.string.day_16, R.drawable.image16 , R.string.content_desc_16),
     Dailyquotes(R.string.day_17, R.drawable.image17 , R.string.content_desc_17),
     Dailyquotes(R.string.day_18, R.drawable.image18 , R.string.content_desc_18),
     Dailyquotes(R.string.day_19, R.drawable.image19 , R.string.content_desc_19),
     Dailyquotes(R.string.day_20 , R.drawable.image20, R.string.content_desc_20),
     Dailyquotes(R.string.day_21 , R.drawable.image21 , R.string.content_desc_21),
     Dailyquotes(R.string.day_22, R.drawable.image22, R.string.content_desc_22),
     Dailyquotes(R.string.day_23, R.drawable.image23 , R.string.content_desc_23),
     Dailyquotes(R.string.day_24 , R.drawable.image24 , R.string.content_desc_24),
     Dailyquotes(R.string.day_25 , R.drawable.image25 , R.string.content_desc_25),
     Dailyquotes(R.string.day_26 , R.drawable.image26, R.string.content_desc_26),
     Dailyquotes(R.string.day_27 , R.drawable.image27, R.string.content_desc_27),
     Dailyquotes(R.string.day_28, R.drawable.image28, R.string.content_desc_28),
     Dailyquotes(R.string.day_29 , R.drawable.image29 , R.string.content_desc_29),
     Dailyquotes(R.string.day_30 , R.drawable.image30 , R.string.content_desc_30),
 )