import com.intellij.openapi.editor.colors.TextAttributesKey

class AnnotatorRust : AnnotatorBase(AnnotatorRust) {
	companion object : AnnotatorCompanion {
		override val fallback = TextAttributesKey.find("RUST_KEYWORD")

		private val value = TextAttributesKey.createTextAttributesKey("RUST.TRUE_FALSE", fallback)
		private val selfReference = TextAttributesKey.createTextAttributesKey("RUST.SELF_REFERENCE", fallback)
		private val flowControl = TextAttributesKey.createTextAttributesKey("RUST.FLOW_CONTROL", fallback)
		private val modifier = TextAttributesKey.createTextAttributesKey("RUST.MODIFIER", fallback)

		override val textAttributesKeys = setOf(
			value to setOf(
				"true",
				"false"
			),
			selfReference to setOf(
				"self",
				"Self",
				"super"
			),
			flowControl to setOf(
				"break",
				"return",
				"continue",

				"if",
				"else",
				"for",
				"while",
				"loop"
			),
			modifier to setOf(
				"const",
				"extern",
				"mut",
				"pub"
			)
		)
	}
}