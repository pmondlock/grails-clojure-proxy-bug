import clojure.lang.Compiler
import org.codehaus.groovy.grails.commons.ApplicationHolder

class BootStrap {

    def init = { servletContext ->
		def fs =  ApplicationHolder.application.parentContext.getResource('classpath:test.clj')
		println fs.file
       	fs.file.withReader { rdr ->
	        Compiler.load(rdr, 'classpath://', 'test.clj')
       	}
    }
    def destroy = {
    }
}
