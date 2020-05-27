import com.intellij.openapi.editor.colors.TextAttributesKey

class KotlinAnnotator : BaseAnnotator() {
	override val attributes = mapOf(
		"true" to value,
		"false" to value,
		"null" to value,

		"constructor" to initializer,
		"init" to initializer,

		"this" to selfReference,
		"super" to selfReference,

		"break" to flowControl,
		"return" to flowControl,
		"continue" to flowControl,
		"throw" to flowControl,

		"if" to flowControl,
		"else" to flowControl,
		"for" to flowControl,
		"while" to flowControl,
		"do" to flowControl,
		"when" to flowControl,
		"try" to flowControl,
		"catch" to flowControl,
		"finally" to flowControl
	)

	companion object {
		private val fallback = TextAttributesKey.find("JAVA_KEYWORD")
		val value = TextAttributesKey.createTextAttributesKey("KOTLIN.TRUE_FALSE_NULL", fallback)
		val initializer = TextAttributesKey.createTextAttributesKey("KOTLIN.INITIALIZER", fallback)
		val selfReference = TextAttributesKey.createTextAttributesKey("KOTLIN.SELF_REFERENCE", fallback)
		val flowControl = TextAttributesKey.createTextAttributesKey("KOTLIN.FLOW_CONTROL", fallback)
	}
}