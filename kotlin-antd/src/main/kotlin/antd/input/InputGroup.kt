package antd.input

import antd.*
import org.w3c.dom.*
import react.*

external object InputGroupComponent : Component<InputGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface InputGroupProps : RProps {
    var className: String?
    var size: InputSize?
    var children: ReactElement?
    var style: dynamic
    var onMouseEnter: MouseEventHandler<HTMLSpanElement>?
    var onMouseLeave: MouseEventHandler<HTMLSpanElement>?
    var onFocus: FocusEventHandler<HTMLSpanElement>?
    var onBlur: FocusEventHandler<HTMLSpanElement>?
    var prefixCls: String?
    var compact: Boolean?
}
