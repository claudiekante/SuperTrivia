package org.alessandrobarile.supertrivia.model.model;

import java.util.Collections;
import java.util.List;

public class QuestionBank {
    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

    public QuestionBank(List<Question> questionList){
        mQuestionList = questionList;
        Collections.shuffle(mQuestionList);
    }

    public Question getCurrentQuestion() {
        return mQuestionList.get(mNextQuestionIndex);
    }

    public Question getNextQuestion() {
        mNextQuestionIndex++;
        return getCurrentQuestion();
    }


}
