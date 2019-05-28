package com.bignerdranch.android.quizmvvm

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {

    @Mock
    lateinit var quizList: List<Question>

    @InjectMocks
    lateinit var viewModel: QuizViewModel

    @get:Rule
    val mockitoRule: MockitoRule = MockitoJUnit.rule()

    @get:Rule
    val taskExecutorRule = InstantTaskExecutorRule()

    companion object {
        private val question = Question("foo", true)
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    fun someMoreTest() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    fun getQuestionString() {
        whenever(quizList[any()]).thenReturn(question)

        viewModel.questionString

        verify(quizList, times(2))[any()]
    }
}