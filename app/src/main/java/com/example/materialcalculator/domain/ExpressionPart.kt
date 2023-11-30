package com.example.materialcalculator.domain

/*npr. "35-6" treba znati razlikovati brojeve od znakova,te spojiti dva broja u ovom slucaju 3 i 5*/
interface ExpressionPart {
    data class Number(val number: Double): ExpressionPart
    data class Op(val operation: Operation):ExpressionPart
    data class Parentheses(val type: ParenthesesType): ExpressionPart
}

sealed interface ParenthesesType{
    object Opening: ParenthesesType
    object Closing: ParenthesesType
}