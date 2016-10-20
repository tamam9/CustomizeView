package com.skypiea.span;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

/**
 * Created by Yusuf on 2016/10/20.
 */

public class CustomSpan {

    public static SpannableStringBuilder getRedBlackText(String text) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.RED);
        AbsoluteSizeSpan span=new AbsoluteSizeSpan(100);
        spannableStringBuilder.setSpan(span, 0, text.length() / 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, text.length() / 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        int length1 = spannableStringBuilder.length();
        spannableStringBuilder.append("muyesser");
        int length2 = spannableStringBuilder.length();
        BackgroundColorSpan backgroundColorSpan=new BackgroundColorSpan(Color.BLACK);
        spannableStringBuilder.setSpan(backgroundColorSpan,length1,length2,Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        return spannableStringBuilder;
    }
}
