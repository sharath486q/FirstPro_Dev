import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_demooo_sampleesharath_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/samplee/sharath.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(2)
invokeTag('render','g',8,['template':("form")],-1)
printHtmlPart(3)
invokeTag('submitButton','g',11,['name':("displayform"),'class':("save"),'value':("display")],-1)
printHtmlPart(4)
})
invokeTag('form','g',13,['action':("index")],2)
printHtmlPart(5)
})
invokeTag('captureBody','sitemesh',17,[:],1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1538133184000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
