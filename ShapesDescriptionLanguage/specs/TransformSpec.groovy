package specs

class TransformSpec {
    RectangleSpec rect
    def base(n) {
        def old = rect.baseDef
        rect.baseDef += n
        println "My base went from ${old} to ${rect.baseDef}"
        this
    }
    def height(n) {
        def old = rect.heightDef
        rect.heightDef += n
        println "My height went from ${old} to ${rect.heightDef}"
        this
    }
}