package com.bignerdranch.android.quizmvvm;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class QuestionList {
    private static QuestionList questionListInstance;
    private List<Question> mQuestionList = new ArrayList<>();
    private static int index;

    private QuestionList(Context context) {
        String firstQuestion = context.getApplicationContext().getString(R.string.question_australia);
        String secondQuestion = context.getApplicationContext().getString(R.string.question_oceans);
        String thirdQuestion = context.getApplicationContext().getString(R.string.question_mideast);
        String forthQuestion = context.getApplicationContext().getString(R.string.question_africa);
        String fifthQuestion = context.getApplicationContext().getString(R.string.question_americas);
        String sixthQuestion = context.getApplicationContext().getString(R.string.question_asia);

        mQuestionList.add(new Question(firstQuestion, true));
        mQuestionList.add(new Question(secondQuestion, true));
        mQuestionList.add(new Question(thirdQuestion, false));
        mQuestionList.add(new Question(forthQuestion, false));
        mQuestionList.add(new Question(fifthQuestion, true));
        mQuestionList.add(new Question(sixthQuestion, true));

        index = 0;
    }

    static QuestionList getInstance(Context context) {
        if (questionListInstance == null) {
            questionListInstance = new QuestionList(context.getApplicationContext());
            return questionListInstance;
        }
        return questionListInstance;

    }

    List<Question> getQuestionList() {
        return mQuestionList;
    }

    public Question getQuestion(int position) {
        return mQuestionList.get(position);
    }

    static int getIndex() {
        return index;
    }

    static void setIndex(int index) {
        QuestionList.index = index;
    }
}