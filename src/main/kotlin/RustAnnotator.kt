import com.intellij.psi.PsiElement

class RustAnnotator : BaseAnnotator() {
	override fun getKeywordKind(element: PsiElement) = when (element.text) {
		"true",
		"false"
		-> RustColorSettings.value

		"self",
		"Self",
		"super"
		-> RustColorSettings.selfReference

		"break",
		"return",
		"continue",

		"if",
		"else",
		"for",
		"while",
		"loop"
		-> RustColorSettings.flowControl

		"const",
		"extern",
		"mut",
		"pub"
		-> RustColorSettings.modifier

		else -> null
	}
}