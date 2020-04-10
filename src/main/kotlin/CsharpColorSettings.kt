import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor


class CsharpColorSettings : BaseColorSettings("C#") {
	companion object {
		private val fallback = TextAttributesKey.find("CSHARP_KEYWORD")
		val value = TextAttributesKey.createTextAttributesKey("CSHARP.VALUE", fallback)
		val type = TextAttributesKey.createTextAttributesKey("CSHARP.PRIMITIVE", fallback)
		val selfReference = TextAttributesKey.createTextAttributesKey("CSHARP.SELF_REFERENCE", fallback)
		val flowControl = TextAttributesKey.createTextAttributesKey("CSHARP.FLOW_CONTROL", fallback)
		val modifier = TextAttributesKey.createTextAttributesKey("CSHARP.MODIFIER", fallback)
	}

	override fun getAttributeDescriptors() = arrayOf(
		AttributesDescriptor("Keywords: values (true, false, null)", value),
		AttributesDescriptor("Keywords: types (int, float, object...)", type),
		AttributesDescriptor("Keywords: self references (this, base, ...)", selfReference),
		AttributesDescriptor("Keywords: flow control (if, while, break, goto, ...)", flowControl),
		AttributesDescriptor("Keywords: modifier (public, private, const, ...)", modifier)
	)
}