import com.intellij.openapi.editor.colors.TextAttributesKey

class CsharpAnnotator : BaseAnnotator() {
	override val attributes = mapOf(
		"true" to value,
		"false" to value,
		"null" to value,

		"bool" to type,
		"byte" to type,
		"sbyte" to type,
		"short" to type,
		"ushort" to type,
		"int" to type,
		"uint" to type,
		"long" to type,
		"ulong" to type,
		"float" to type,
		"double" to type,
		"string" to type,
		"char" to type,
		"decimal" to type,
		"object" to type,
		"void" to type,

		"this" to selfReference,
		"base" to selfReference,

		"break" to flowControl,
		"return" to flowControl,
		"continue" to flowControl,
		"throw" to flowControl,
		"goto" to flowControl,

		"if" to flowControl,
		"else" to flowControl,
		"for" to flowControl,
		"foreach" to flowControl,
		"while" to flowControl,
		"do" to flowControl,
		"switch" to flowControl,
		"using" to flowControl,
		"try" to flowControl,
		"catch" to flowControl,
		"finally" to flowControl,
		"lock" to flowControl,

		"typeof" to flowControl,
		"sizeof" to flowControl,

		"abstract" to modifier,
		"const" to modifier,
		"extern" to modifier,
		"public" to modifier,
		"private" to modifier,
		"protected" to modifier,
		"internal" to modifier,
		"override" to modifier,
		"readonly" to modifier,
		"sealed" to modifier,
		"static" to modifier,
		"virtual" to modifier
	)

	companion object {
		private val fallback = TextAttributesKey.find("CSHARP_KEYWORD")
		val value = TextAttributesKey.createTextAttributesKey("CSHARP.VALUE", fallback)
		val type = TextAttributesKey.createTextAttributesKey("CSHARP.PRIMITIVE", fallback)
		val selfReference = TextAttributesKey.createTextAttributesKey("CSHARP.SELF_REFERENCE", fallback)
		val flowControl = TextAttributesKey.createTextAttributesKey("CSHARP.FLOW_CONTROL", fallback)
		val modifier = TextAttributesKey.createTextAttributesKey("CSHARP.MODIFIER", fallback)
	}
}