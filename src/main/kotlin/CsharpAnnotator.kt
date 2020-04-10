import com.intellij.psi.PsiElement

class CsharpAnnotator : BaseAnnotator() {
	override fun getKeywordKind(element: PsiElement) = when (element.text) {
		"true",
		"false",
		"null"
		-> CsharpColorSettings.value

		"bool",
		"byte",
		"sbyte",
		"short",
		"ushort",
		"int",
		"uint",
		"long",
		"ulong",
		"float",
		"double",
		"string",
		"char",
		"decimal",
		"object",
		"void"
		-> CsharpColorSettings.type

		"this",
		"base"
		-> CsharpColorSettings.selfReference

		"break",
		"return",
		"continue",
		"throw",
		"goto",

		"if",
		"else",
		"for",
		"foreach",
		"while",
		"do",
		"switch",
		"using",
		"try",
		"catch",
		"finally",
		"lock",

		"typeof",
		"sizeof"
		-> CsharpColorSettings.flowControl

		"abstract",
		"const",
		"extern",
		"public",
		"private",
		"protected",
		"internal",
		"override",
		"readonly",
		"sealed",
		"static",
		"virtual"
		-> CsharpColorSettings.modifier

		else -> null
	}
}