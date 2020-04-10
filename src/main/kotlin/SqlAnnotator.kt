import com.intellij.psi.PsiElement

class SqlAnnotator : BaseAnnotator() {
	override fun getKeywordKind(element: PsiElement) = when (element.text.toUpperCase()) {
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
		-> SqlColorSettings.action

		"CONSTRAINT",
		"COLUMN",
		"DATABASE",
		"INDEX",
		"PROCEDURE",
		"TABLE",
		"UNIQUE",
		"VIEW"
		-> SqlColorSettings.variant

		else -> null
	}
}