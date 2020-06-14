import com.intellij.openapi.editor.colors.TextAttributesKey

interface AnnotatorCompanion {
	val fallback: TextAttributesKey
	val textAttributesKeys: Set<Pair<TextAttributesKey, Set<String>>>
}