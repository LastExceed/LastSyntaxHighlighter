import com.intellij.openapi.editor.colors.TextAttributesKey

class AnnotatorKotlin : AnnotatorBase(AnnotatorKotlin) {
	companion object : AnnotatorCompanion {
		override val fallback = TextAttributesKey.find("JAVA_KEYWORD")

		private val value = TextAttributesKey.createTextAttributesKey("KOTLIN.TRUE_FALSE_NULL", fallback)
		private val initializer = TextAttributesKey.createTextAttributesKey("KOTLIN.INITIALIZER", fallback)
		private val selfReference = TextAttributesKey.createTextAttributesKey("KOTLIN.SELF_REFERENCE", fallback)
		private val flowControl = TextAttributesKey.createTextAttributesKey("KOTLIN.FLOW_CONTROL", fallback)

		override val textAttributesKeys = setOf(
			value to setOf(
				"true",
				"false",
				"null"
			),
			initializer to setOf(
				"constructor",
				"init"
			),
			selfReference to setOf(
				"this",
				"super"
			),
			flowControl to setOf(
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
				"finally",

				"is",
				"!is",
				"in",
				"!in"
			)
		)
	}
}