import com.intellij.icons.AllIcons
import com.intellij.lang.Language
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.options.colors.*
import com.intellij.psi.codeStyle.DisplayPriority
import com.intellij.psi.codeStyle.DisplayPrioritySortable
import javax.swing.Icon

abstract class SettingsColorBase(
	private val languageID: String,
	private val annotatorCompanion: AnnotatorCompanion
) : ColorSettingsPage, DisplayPrioritySortable {
	override fun getDemoText() = "TODO"
	override fun getPriority() = DisplayPriority.LANGUAGE_SETTINGS
	override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = mapOf()
	override fun getIcon(): Icon? = AllIcons.FileTypes.Custom
	override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY
	override fun getDisplayName() = "$languageID+"
	override fun getHighlighter() =
		SyntaxHighlighterFactory.getSyntaxHighlighter(
			Language.findLanguageByID(languageID) ?: Language.ANY,
			null,
			null
		) ?: SyntaxHighlighterFactory.getSyntaxHighlighter(
			Language.ANY,
			null,
			null
		)!!

	override fun getAttributeDescriptors() =
		annotatorCompanion.textAttributesKeys.map {
			AttributesDescriptor(it.second.joinToString(" "), it.first)
		}.toTypedArray()
}

class SettingsColorCsharp : SettingsColorBase("C#", AnnotatorCsharp)
class SettingsColorKotlin : SettingsColorBase("kotlin", AnnotatorKotlin)
class SettingsColorRust : SettingsColorBase("Rust", AnnotatorRust)
class SettingsColorSql : SettingsColorBase("SQL", AnnotatorSql)