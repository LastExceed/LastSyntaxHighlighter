import com.intellij.openapi.options.colors.AttributesDescriptor

class CsharpColorSettings : BaseColorSettings("C#") {
	override fun getAttributeDescriptors() = arrayOf(
		AttributesDescriptor("Keywords: values (true, false, null)", CsharpAnnotator.value),
		AttributesDescriptor("Keywords: types (int, float, object...)", CsharpAnnotator.type),
		AttributesDescriptor("Keywords: self references (this, base, ...)", CsharpAnnotator.selfReference),
		AttributesDescriptor("Keywords: flow control (if, while, break, goto, ...)", CsharpAnnotator.flowControl),
		AttributesDescriptor("Keywords: modifier (public, private, const, ...)", CsharpAnnotator.modifier)
	)
}