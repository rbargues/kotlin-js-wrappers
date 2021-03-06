package samples.avatar

import antd.avatar.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.type() {
    styledDiv {
        css { +AvatarStyles.type }
        div {
            avatar {
                attrs.icon = "user"
            }
            avatar { +"U" }
            avatar { +"USER" }
            avatar {
                attrs.src = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
            }
            avatar {
                attrs.style = js {
                    color = "#f56a00"
                    backgroundColor = "#fde3cf"
                }
            }
            avatar {
                attrs {
                    style = js { backgroundColor = "#87d068" }
                    icon = "user"
                }
            }
        }
    }
}
