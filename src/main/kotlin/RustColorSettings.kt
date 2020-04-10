import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor


class RustColorSettings : BaseColorSettings("Rust") {
	companion object {
		private val fallback = TextAttributesKey.find("RUST_KEYWORD")
		val value = TextAttributesKey.createTextAttributesKey("RUST.TRUE_FALSE", fallback)
		val selfReference = TextAttributesKey.createTextAttributesKey("RUST.SELF_REFERENCE", fallback)
		val flowControl = TextAttributesKey.createTextAttributesKey("RUST.FLOW_CONTROL", fallback)
		val modifier = TextAttributesKey.createTextAttributesKey("RUST.MODIFIER", fallback)
	}

	override fun getAttributeDescriptors() = arrayOf(
		AttributesDescriptor("Keywords: true, false", value),
		AttributesDescriptor("Keywords: self, super", selfReference),
		AttributesDescriptor("Keywords: if, for, while, loop", flowControl),
		AttributesDescriptor("Keywords: const, extern, mut, pub", modifier)
	)
}
