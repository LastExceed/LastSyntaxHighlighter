import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement

abstract class BaseAnnotator : Annotator {
	override fun annotate(element: PsiElement, holder: AnnotationHolder) {
		if (element is LeafPsiElement) {
			val kind = getKeywordKind(element) ?: return
			val textRange = element.getTextRange()
			val range = TextRange(textRange.startOffset, textRange.endOffset)
			val annotation = holder.createAnnotation(
				HighlightSeverity.INFORMATION, range, null
			)
			annotation.textAttributes = kind
		}
	}

	protected abstract fun getKeywordKind(element: PsiElement): TextAttributesKey?
}