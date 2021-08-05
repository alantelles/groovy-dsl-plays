package specs

class CircleSpec {
    Integer radiusDef

    def radius(Integer arg) {
        radiusDef = arg
        println "My radius is ${arg}"
        this
    }

    def getArea() {
        def res = 2 * 3.14 * (radiusDef * radiusDef)
        println "My area is ${res}"
        return res
    }
    def scale(Integer ratio) {
        println "I'm being scaled at ${ratio} times ratio"
        radiusDef *= ratio
    }
    def getSize() {
        println "My dimension is radius: ${radiusDef}"
    }
}