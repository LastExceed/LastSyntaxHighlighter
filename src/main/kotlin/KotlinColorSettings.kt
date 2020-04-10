import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor


class KotlinColorSettings : BaseColorSettings("kotlin") {
	companion object {
		private val fallback = TextAttributesKey.find("JAVA_KEYWORD")
		val value = TextAttributesKey.createTextAttributesKey("KOTLIN.TRUE_FALSE_NULL", fallback)
		val initializer = TextAttributesKey.createTextAttributesKey("KOTLIN.INITIALIZER", fallback)
		val selfReference = TextAttributesKey.createTextAttributesKey("KOTLIN.SELF_REFERENCE", fallback)
		val flowControl = TextAttributesKey.createTextAttributesKey("KOTLIN.FLOW_CONTROL", fallback)
	}

	override fun getAttributeDescriptors() = arrayOf(
		AttributesDescriptor("Keywords: true, false, null", value),
		AttributesDescriptor("Keywords: constructor, init", initializer),
		AttributesDescriptor("Keywords: this, super", selfReference),
		AttributesDescriptor("Keywords: if, for, while, when", flowControl)
	)
}
