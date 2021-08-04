import specs.*

abstract class MyBaseClass extends Script {
    static def rectangle(closure) {
        RectangleSpec rect = new RectangleSpec()
        def code = closure.rehydrate(rect, this, this)
        code.resolveStrategy = Closure.DELEGATE_ONLY
        code()
    }

    static def circle(closure) {
        CircleSpec circle = new CircleSpec()
        def code = closure.rehydrate(circle, this, this)
        code.resolveStrategy = Closure.DELEGATE_ONLY
        code()
    }

}
