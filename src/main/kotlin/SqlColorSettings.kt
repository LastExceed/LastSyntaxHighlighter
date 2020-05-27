import com.intellij.openapi.options.colors.AttributesDescriptor

class SqlColorSettings : BaseColorSettings("SQL") {
	override fun getAttributeDescriptors() = arrayOf(
		AttributesDescriptor("Keywords: action", SqlAnnotator.action),
		AttributesDescriptor("Keywords: variant", SqlAnnotator.variant)
	)
}
