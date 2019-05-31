package com.bignerdranch.android.quizmvvm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.bignerdranch.android.quizmvvm.databinding.FragmentQuizBinding;

public class QuizFragment extends Fragment {

    private QuestionList mQuizList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mQuizList = QuestionList.getInstance(getContext().getApplicationContext());

    }

    @Nullable
    @Override
    public android.view.View onCreateView(@NonNull LayoutInflater inflater
            , @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentQuizBinding mBinding = DataBindingUtil
                .inflate(inflater, R.layout.fragment_quiz, container, false);

        mBinding.setViewModel(new QuizViewModel(mQuizList.getQuestionList(), getContext().getApplicationContext()));
        return mBinding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();


    }
}
