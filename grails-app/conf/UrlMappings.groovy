class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"Simpleeeform",action:'form')
		//"/"(controller:"Samplee",action:'sharath')
		
        "500"(view:'/error')
	}
}
