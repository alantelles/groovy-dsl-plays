import org.codehaus.groovy.control.CompilerConfiguration

def shapeFile = this.args[0]
def shapeFileContent = new File(shapeFile).text

def config = new CompilerConfiguration()
config.scriptBaseClass = 'MyBaseClass'

def shell = new GroovyShell(this.class.classLoader, config)
shell.evaluate(shapeFileContent)