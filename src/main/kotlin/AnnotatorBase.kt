import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement

abstract class AnnotatorBase(companion: AnnotatorCompanion) : Annotator {
	private val kinds = companion.textAttributesKeys.fold(mapOf<String, TextAttributesKey>()) { accumulator, element ->
		accumulator + element.second.associateWith { element.first }
	}

	override fun annotate(element: PsiElement, holder: AnnotationHolder) {
		if (element !is LeafPsiElement) return
		val kind = kinds[element.text] ?: return
		holder.newAnnotation(HighlightSeverity.INFORMATION, "")
			.range(element.textRange)
			.textAttributes(kind)
			.create()
	}
}