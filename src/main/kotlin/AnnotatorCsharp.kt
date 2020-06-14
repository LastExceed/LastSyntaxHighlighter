import com.intellij.openapi.editor.colors.TextAttributesKey

class AnnotatorCsharp : AnnotatorBase(AnnotatorCsharp) {
	companion object : AnnotatorCompanion {
		override val fallback = TextAttributesKey.find("CSHARP_KEYWORD")

		private val value = TextAttributesKey.createTextAttributesKey("CSHARP.VALUE", fallback)
		private val type = TextAttributesKey.createTextAttributesKey("CSHARP.PRIMITIVE", fallback)
		private val selfReference = TextAttributesKey.createTextAttributesKey("CSHARP.SELF_REFERENCE", fallback)
		private val flowControl = TextAttributesKey.createTextAttributesKey("CSHARP.FLOW_CONTROL", fallback)
		private val modifier = TextAttributesKey.createTextAttributesKey("CSHARP.MODIFIER", fallback)

		override val textAttributesKeys = setOf(
			value to setOf(
				"true",
				"false",
				"null"
			),
			type to setOf(
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
			),
			selfReference to setOf(
				"this",
				"base"
			),
			flowControl to setOf(
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
			),
			modifier to setOf(
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
			)
		)
	}
}