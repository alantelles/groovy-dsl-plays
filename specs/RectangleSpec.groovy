package specs

class RectangleSpec {
    Integer baseDef
    Integer heightDef   
    
    def base(Integer arg) {
        baseDef = arg
        println "My base is ${arg}"
        this
    }

    def height(Integer arg) {
        heightDef = arg
        println "My height is ${arg}"
        this
    }

    Integer getArea() {
        def res = baseDef * heightDef
        println "My area is ${res}"
        return res
    }

    def scale(Integer ratio) {
        baseDef *= ratio
        println "I'm being scaled at ${ratio} times ratio"
        heightDef *= ratio
    }

    def transform(Closure body) {
        TransformSpec transSpec = new TransformSpec(rect: this)
        def code = body.rehydrate(transSpec, this, this)
        code.resolveStrategy = Closure.DELEGATE_ONLY
        code()
    }

    def getSize() {
        println "My dimensions are base ${baseDef}, height: ${heightDef}"
    }
    
}