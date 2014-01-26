package psi

import com.intellij.psi.FileViewProvider
import com.intellij.extapi.psi.PsiFileBase
import amailp.language.RobotLanguage
import com.intellij.openapi.fileTypes.FileType
import amailp.file.RobotFileType
import java.lang.String
import javax.swing.Icon

class RobotFile(viewProvider: FileViewProvider)
  extends PsiFileBase(viewProvider, RobotLanguage.INSTANCE) {

  def getFileType: FileType = RobotFileType.INSTANCE

  override def toString: String = "Robtoframework File"

  override def getIcon(flags: Int): Icon = super.getIcon(flags)
}
