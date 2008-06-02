package org.jetbrains.plugins.scala.lang.psi.impl.toplevel.typedef

import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode

import org.jetbrains.plugins.scala.lang.parser.ScalaElementTypes
import org.jetbrains.plugins.scala.lang.lexer._
import org.jetbrains.plugins.scala.lang.psi.ScalaPsiElementImpl
import org.jetbrains.plugins.scala.lang.lexer.ScalaTokenTypes
import org.jetbrains.annotations._

import org.jetbrains.plugins.scala.icons.Icons

import org.jetbrains.plugins.scala.lang.psi.api.toplevel.typedef._
import org.jetbrains.plugins.scala.lang.psi.api.toplevel.templates._

/** 
* @author Alexander Podkhalyuzin
* Date: 20.02.2008
*/

class ScTraitImpl(node: ASTNode) extends ScTypeDefinitionImpl(node) with ScTrait {

  def getMixinParents = null /*if (extendsBlock != null) {
    extendsBlock.getMixinParents
  } else null*/

  def getMainParentName = null/*{
    if (getMixinParents != null &&
    getMixinParents.getMainConstructor != null){
      getMixinParents.getMainConstructor.getClassName
    } else {
      null
    }
  } */

  /*override def getMixinParentsNames = {
    if (getMixinParents != null){
      getMixinParents.getMixinParents.toList
    } else {
      Nil: List[ScStableId]
    }
  } */

  override def toString: String = "ScTrait"

  override def getIconInner = Icons.TRAIT
}
