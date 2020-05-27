import com.intellij.openapi.options.colors.AttributesDescriptor

class RustColorSettings : BaseColorSettings("Rust") {
	override fun getAttributeDescriptors() = arrayOf(
		AttributesDescriptor("Keywords: true, false", RustAnnotator.value),
		AttributesDescriptor("Keywords: self, super", RustAnnotator.selfReference),
		AttributesDescriptor("Keywords: if, for, while, loop", RustAnnotator.flowControl),
		AttributesDescriptor("Keywords: const, extern, mut, pub", RustAnnotator.modifier)
	)
}
