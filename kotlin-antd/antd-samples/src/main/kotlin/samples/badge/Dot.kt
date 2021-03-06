package samples.badge

import antd.badge.*
import antd.icon.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.dot() {
    styledDiv {
        css { +BadgeStyles.dot }
        div {
            badge {
                attrs.dot = true
                icon {
                    attrs.type = "notification"
                }
            }
            badge {
                attrs {
                    count = 0
                    dot = true
                }
                icon {
                    attrs.type = "notification"
                }
            }
            badge {
                attrs.dot = true
                a {
                    attrs.href = "#"
                    +"Link something"
                }
            }
        }
    }
}
