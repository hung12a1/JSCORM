package com.arcusys.learn.quiz.model

import com.arcusys.learn.questionbank.model._
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith

@RunWith(classOf[org.scalatest.junit.JUnitRunner])
class QuizQuestionTest extends FlatSpec with ShouldMatchers {
  private def someQuestion = new TextQuestion(
    id = 4,
    categoryID = Some(66),
    title = "A test text question",
    text = "Please answer this text question",
    explanationText = "The correct answer is 'no, really'",
    answers = Seq(new TextAnswer(201, "no, really"), new TextAnswer(202, "you don't say")),
    isCaseSensitive = false, courseID = Some(1))

  "Quiz question" can "be constructed" in {
    val question = someQuestion
    val quizQuestion = new QuestionBankQuizQuestion(1, quizID = 13, categoryID = Some(10), title=None, question = question)
    quizQuestion.id should equal(1)
    quizQuestion.quizID should equal(13)
    quizQuestion.categoryID should equal(Some(10))
    quizQuestion.question should equal(question)
  }

  it can "be constructed with empty category" in {
    val question = someQuestion
    val quizQuestion = new QuestionBankQuizQuestion(1, quizID = 13, categoryID = None, title=None, question = question)
    quizQuestion.id should equal(1)
    quizQuestion.quizID should equal(13)
    quizQuestion.categoryID should equal(None)
    quizQuestion.question should equal(question)
  }
}
