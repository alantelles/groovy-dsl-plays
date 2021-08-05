import specs.CircleSpec
import specs.RectangleSpec

abstract class MyBaseClass extends Script {

    static void rectangle(@DelegatesTo(RectangleSpec) Closure closure) {
        RectangleSpec rect = new RectangleSpec()
        def code = closure.rehydrate(rect, this, this)
        code.resolveStrategy = Closure.DELEGATE_ONLY
        code()
    }

    static void circle(Closure closure) {
        CircleSpec circle = new CircleSpec()
        def code = closure.rehydrate(circle, this, this)
        code.resolveStrategy = Closure.DELEGATE_ONLY
        code()
    }

}
