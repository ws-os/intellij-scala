package org.jetbrains.plugins.scala.conversion
package generated

import org.jetbrains.plugins.scala.lang.formatting.settings.ScalaCodeStyleSettings
import org.jetbrains.plugins.scala.settings.ScalaProjectSettings
import org.jetbrains.plugins.scala.util.TypeAnnotationSettings

class JavaToScalaConversionExamplesTest extends JavaToScalaConversionTestBase {
  //This class was generated by build script, please don't change this
  override def folderPath: String = super.folderPath + "examples/"

  def testAnnotated() = doTest()

  def testAnonymousClass() = doTest()

  def testDeprecated() = doTest()

  def testEnum() = doTest()

  def testFinalInObjects() = doTest()

  def testHelloWorld() = doTest()

  def testInterface() = doTest()

  def testRightOrder() = doTest()

  def testStaticInitializer() = doTest()

  def testStaticPrefix() = doTest()

  def testThrows() = doTest()

  def testTypeParameters() = doTest()

  def testVarArgs() = doTest()

  def testSCL3899() = doTest()

  def testSCL9369() = doTest()

  def testSCL11463() = doTest()

  def testNeedConstructorsSorting() = doTest()

  def testNoOverrideToImplement() = {
    val oldValue = ScalaProjectSettings.getInstance(getProjectAdapter).isAddOverrideToImplementInConverter
    ScalaProjectSettings.getInstance(getProjectAdapter).setAddOverrideToImplementInConverter(false)
    doTest()
    ScalaProjectSettings.getInstance(getProjectAdapter).setAddOverrideToImplementInConverter(oldValue)
  }

//  def testSCL9434() = doTest()

  def testSCL9421() = doTest()

  def testSCL9375() = doTest()

  def testSCL11313() = doTest()

  def testSCL11451() = doTest()

  def testNoReturnTypeForPublic() =
    doTest(TypeAnnotationSettings.noTypeAnnotationForPublic(
      TypeAnnotationSettings.alwaysAddType(ScalaCodeStyleSettings.getInstance(getProjectAdapter)))
    )
  
  def testNoRetunTypeForLocalAndOverride() =
    doTest(TypeAnnotationSettings.noTypeAnnotationForLocal(
      TypeAnnotationSettings.noTypeAnnotationForOverride(
        TypeAnnotationSettings.alwaysAddType(ScalaCodeStyleSettings.getInstance(getProjectAdapter)))
    ))

  def testImports() = doTest()

  def testLambdaExpr() = doTest()
}