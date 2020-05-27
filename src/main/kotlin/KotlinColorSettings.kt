import com.intellij.openapi.options.colors.AttributesDescriptor

class KotlinColorSettings : BaseColorSettings("kotlin") {
		override fun getAttributeDescriptors() = arrayOf(
		AttributesDescriptor("Keywords: true, false, null", KotlinAnnotator.value),
		AttributesDescriptor("Keywords: constructor, init", KotlinAnnotator.initializer),
		AttributesDescriptor("Keywords: this, super", KotlinAnnotator.selfReference),
		AttributesDescriptor("Keywords: if, for, while, when", KotlinAnnotator.flowControl)
	)
}
