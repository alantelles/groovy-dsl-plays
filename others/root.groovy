show = { println it }
square_root = { Math.sqrt(it) }
// def please(action) {
//     [the: { what ->
//         [of: {n -> action(what(n))}]
//     }]
// }

class PleaseHandler {
    static please(action) {
        return new ActionHandler(action: action)
    }
}

class ActionHandler {
    def action
    def the(what) {
        return new ValueHandler(action: action, what: what)
    }
}

class ValueHandler {
    def action
    def what
    def of (n) {
        action(what(n))
    }
}



// def mapWithThe = please(show)
// def mapWithOf = mapWithThe.the(square_root)
// mapWithOf.of(100)

PleaseHandler.please show the square_root of 25