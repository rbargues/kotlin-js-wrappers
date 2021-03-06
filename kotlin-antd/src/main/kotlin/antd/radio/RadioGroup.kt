package antd.radio

import antd.*
import antd.checkbox.*
import org.w3c.dom.*
import react.*

external object RadioGroupComponent : Component<RadioGroupProps, RadioGroupState> {
    override fun render(): ReactElement?
}

external interface RadioGroupProps : AbstractCheckboxGroupProps, RProps {
    var defaultValue: Any?
    var value: Any?
    var onChange: ((e: RadioChangeEvent) -> Unit)?
    var size: RadioGroupSize?
    var onMouseEnter: MouseEventHandler<HTMLDivElement>?
    var onMouseLeave: MouseEventHandler<HTMLDivElement>?
    var name: String?
    var children: ReactElement?
    var id: String?
    var buttonStyle: RadioGroupButtonStyle?
}

external interface RadioGroupState : RState {
    var value: Any
}
