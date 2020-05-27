import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement

abstract class BaseAnnotator : Annotator {
	protected abstract val attributes: Map<String, TextAttributesKey>

	override fun annotate(element: PsiElement, holder: AnnotationHolder) {
		if (element !is LeafPsiElement) return
		val kind = attributes[element.text] ?: return
		holder.newAnnotation(HighlightSeverity.INFORMATION, "")
			.range(element.getTextRange())
			.textAttributes(kind)
			.create()
	}
}