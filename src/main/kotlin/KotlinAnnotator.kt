import com.intellij.psi.PsiElement

class KotlinAnnotator : BaseAnnotator() {
	override fun getKeywordKind(element: PsiElement) = when (element.text) {
		"true",
		"false",
		"null"
		-> KotlinColorSettings.value

		"constructor",
		"init"
		-> KotlinColorSettings.initializer

		"this",
		"super"
		-> KotlinColorSettings.selfReference

		"break",
		"return",
		"continue",
		"throw",

		"if",
		"else",
		"for",
		"while",
		"do",
		"when",
		"try",
		"catch",
		"finally"
		-> KotlinColorSettings.flowControl

		else -> null
	}
}