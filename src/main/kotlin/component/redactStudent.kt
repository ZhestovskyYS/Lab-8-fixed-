package component

import kotlinx.html.InputType
import kotlinx.html.id
import react.*
import react.dom.input

fun RBuilder.redactStudent() =
    child(functionalComponent<RProps> {
        input(InputType.text){
            attrs{
                placeholder = "Enter student first name"
                id = "FName"
            }
        }
        input(InputType.text){
            attrs {
                placeholder = "Enter student sure name"
                id = "SName"
            }
        }
    }){
    }