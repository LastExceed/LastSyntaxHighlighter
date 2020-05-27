import com.intellij.openapi.editor.colors.TextAttributesKey

class SqlAnnotator : BaseAnnotator() {
	override val attributes = mapOf(
		"ADD" to action,
		"ALTER" to action,
		"BACKUP" to action,
		"CREATE" to action,
		"DELETE" to action,
		"DROP" to action,
		"EXEC" to action,
		"INSERT" to action,
		"INTO" to action,
		"SELECT" to action,

		"CONSTRAINT" to variant,
		"COLUMN" to variant,
		"DATABASE" to variant,
		"INDEX" to variant,
		"PROCEDURE" to variant,
		"TABLE" to variant,
		"UNIQUE" to variant,
		"VIEW" to variant
	)

	companion object {
		private val fallback = TextAttributesKey.find("JAVA_KEYWORD")
		val action = TextAttributesKey.createTextAttributesKey("SQL.ACTION", fallback)
		val variant = TextAttributesKey.createTextAttributesKey("SQL.VARIANT", fallback)
	}
}