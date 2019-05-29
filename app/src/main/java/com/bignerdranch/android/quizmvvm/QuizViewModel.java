package com.bignerdranch.android.quizmvvm;

import android.content.Context;
import android.widget.Toast;

import androidx.databinding.BaseObservable;

import java.util.List;

public class QuizViewModel extends BaseObservable {
    private Question mQuestion;
    private Context mContext;
    private List<Question> mQuestionList;

    QuizViewModel(List<Question> quizList, Context context) {
        mQuestionList = quizList;
        mQuestion = quizList.get(QuestionList.getIndex());
        mContext = context;
    }

    public void trueButtonOnClick() {
        if (mQuestion.isAnswerTrue()) {
            Toast.makeText(mContext, mContext.getString(R.string.correct_toast), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(mContext, mContext.getString(R.string.incorrect_toast), Toast.LENGTH_SHORT).show();
        }
    }

    public void falseButtonOnClick() {
        if (!mQuestion.isAnswerTrue()) {
            Toast.makeText(mContext, mContext.getString(R.string.correct_toast), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(mContext, mContext.getString(R.string.incorrect_toast), Toast.LENGTH_SHORT).show();
        }
    }

    public void nextButtonOnClick() {
        QuestionList.setIndex((QuestionList.getIndex() + 1) % mQuestionList.size());
    }

    public void prevButtonOnClick() {
        if (QuestionList.getIndex() == 0) QuestionList.setIndex(mQuestionList.size());
        QuestionList.setIndex((QuestionList.getIndex() - 1) % mQuestionList.size());
    }

    public String getQuestionString() {
        notifyChange();
        return mQuestionList.get(QuestionList.getIndex()).getQuestionText();
    }

}
