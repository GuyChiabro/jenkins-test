package com.bignerdranch.android.quizmvvm;

public class Question {
    private String mQuestionText;
    private boolean mAnswerTrue;

    Question(String question, boolean answerTrue) {
        mQuestionText = question;
        mAnswerTrue = answerTrue;
    }

    String getQuestionText() {
        return mQuestionText;
    }

    public void setQuestionText(String questionText) {
        mQuestionText = questionText;
    }

    boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }


}
