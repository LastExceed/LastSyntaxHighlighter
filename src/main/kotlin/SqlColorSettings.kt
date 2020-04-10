import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor


class SqlColorSettings : BaseColorSettings("SQL") {
	companion object {
		private val fallback = TextAttributesKey.find("JAVA_KEYWORD")
		val action = TextAttributesKey.createTextAttributesKey("SQL.ACTION", fallback)
		val variant = TextAttributesKey.createTextAttributesKey("SQL.VARIANT", fallback)
	}

	override fun getAttributeDescriptors() = arrayOf(
		AttributesDescriptor("Keywords: action", action),
		AttributesDescriptor("Keywords: variant", variant)
	)
}
