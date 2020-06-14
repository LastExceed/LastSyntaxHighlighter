import com.intellij.openapi.editor.colors.TextAttributesKey

class AnnotatorSql : AnnotatorBase(AnnotatorSql) {

	companion object : AnnotatorCompanion {
		override val fallback = TextAttributesKey.find("JAVA_KEYWORD")

		private val action = TextAttributesKey.createTextAttributesKey("SQL.ACTION", fallback)
		private val variant = TextAttributesKey.createTextAttributesKey("SQL.VARIANT", fallback)

		override val textAttributesKeys = setOf(
			action to setOf(
				"ADD",
				"ALTER",
				"BACKUP",
				"CREATE",
				"DELETE",
				"DROP",
				"EXEC",
				"INSERT",
				"INTO",
				"SELECT"
			),
			variant to setOf(
				"CONSTRAINT",
				"COLUMN",
				"DATABASE",
				"INDEX",
				"PROCEDURE",
				"TABLE",
				"UNIQUE",
				"VIEW"
			)
		)
	}
}