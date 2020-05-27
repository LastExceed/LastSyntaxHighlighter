import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.psi.PsiElement

class RustAnnotator : BaseAnnotator() {
	override val attributes = mapOf(
		"true" to value,
		"false" to value,

		"self" to selfReference,
		"Self" to selfReference,
		"super" to selfReference,

		"break" to flowControl,
		"return" to flowControl,
		"continue" to flowControl,

		"if" to flowControl,
		"else" to flowControl,
		"for" to flowControl,
		"while" to flowControl,
		"loop" to flowControl,

		"const" to modifier,
		"extern" to modifier,
		"mut" to modifier,
		"pub" to modifier
	)

	companion object {
		private val fallback = TextAttributesKey.find("RUST_KEYWORD")
		val value = TextAttributesKey.createTextAttributesKey("RUST.TRUE_FALSE", fallback)
		val selfReference = TextAttributesKey.createTextAttributesKey("RUST.SELF_REFERENCE", fallback)
		val flowControl = TextAttributesKey.createTextAttributesKey("RUST.FLOW_CONTROL", fallback)
		val modifier = TextAttributesKey.createTextAttributesKey("RUST.MODIFIER", fallback)
	}
}