package org.jetbrains.plugins.scala.testingSupport.scalatest.scala2_10.scalatest1_9_2

import org.jetbrains.plugins.scala.SlowTests
import org.jetbrains.plugins.scala.testingSupport.scalatest.singleTest.FunSuiteSingleTestTest
import org.junit.experimental.categories.Category

/**
 * @author Roman.Shein
 * @since 11.02.2015.
 */
@Category(Array(classOf[SlowTests]))
class Scalatest2_10_1_9_2_SingleTestTestDynamic extends {
  override val funSuiteTestPath = List("[root]", "should run single test")
  override val funSuiteTaggedTestPath = List("[root]", "tagged")
} with Scalatest2_10_1_9_2_Base with FunSuiteSingleTestTest {
  override val useDynamicClassPath = true
}